#!/bin/bash
for pid in $(ps -ef | awk '/jaco/ {print $2}'); do kill -9 $pid; done
for pid in $(ps -ef | awk '/python/ {print $2}'); do kill -9 $pid; done
