#!/bin/bash
for i in $(eval echo "{1..$2}")
do
  python3 publisher.py $MQTT_BROKER_IP $1"."$i &
done
