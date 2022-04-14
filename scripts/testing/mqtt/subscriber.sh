#!/bin/bash
for i in $(eval echo "{1..$1}")
do
  python3 subscriber.py $MQTT_BROKER_IP &
done
