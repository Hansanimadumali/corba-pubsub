import random
import time
import json
import sys

from paho.mqtt import client as mqtt_client


broker = sys.argv[1]
port = 1883
topic = "python/mqtt"
# generate client ID with pub prefix randomly
client_id = f'python-mqtt-{random.randint(0, 100)}'
# username = 'emqx'
# password = 'public'

#parameters
count=0
sum=0


def connect_mqtt() -> mqtt_client:
    def on_connect(client, userdata, flags, rc):
        if rc == 0:
            print("Connected to MQTT Broker!")
        else:
            print("Failed to connect, return code %d\n", rc)

    client = mqtt_client.Client(client_id)
#     client.username_pw_set(username, password)
    client.on_connect = on_connect
    client.connect(broker, port)
    return client

def current_milli_time():
    return int(round(time.time()*1000))


def subscribe(client: mqtt_client):
    def on_message(client, userdata, msg):
        global count
        global sum
#         print(f"Received `{msg.payload.decode()}` from `{msg.topic}` topic")
        y = json.loads(msg.payload.decode())
        node = y["node"]
        messages = y["number"]
        timestamp = y["timestamp"]
        count=count+1
        diff=current_milli_time()-timestamp
        sum=sum+diff
        average = sum/count
        print(f"Node: `{node}`, messages: `{messages}`, count: `{count}`, average: `{average}`")
#         print(f"Node: `{node}`, messages: `{messages}`")

    client.subscribe(topic)
    client.on_message = on_message


def run():
    client = connect_mqtt()
    subscribe(client)
    client.loop_forever()


if __name__ == '__main__':
    run()
