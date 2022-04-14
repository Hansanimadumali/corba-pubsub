import random
import time
import sys
import json

from paho.mqtt import client as mqtt_client


broker = sys.argv[1]
port = 1883
topic = "python/mqtt"
client_id = sys.argv[2]
print(client_id)
# username = 'emqx'
# password = 'public'

def connect_mqtt():
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

def publish(client):
    msg_count = 0

    while True:
        rand_num = random.randint(0, 1000)
        time.sleep(1)
        msg_dic = {"node":client_id, "number":rand_num, "timestamp": current_milli_time()}
        msg = json.dumps(msg_dic)
        result = client.publish(topic, msg)
        # result: [0, 1]
        status = result[0]
        if status == 0:
            print(f"Send `{msg}` to topic `{topic}`")
        else:
            print(f"Failed to send message to topic {topic}")
        msg_count += 1


def run():
    client = connect_mqtt()
    client.loop_start()
    publish(client)


if __name__ == '__main__':
    run()