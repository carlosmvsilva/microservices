@echo off
title Zipkin Server - localhost development
echo Getting the last version
curl -sSL https://zipkin.io/quickstart.sh | bash -s
echo Starting Zipkin Server at localhost:9411.
start chrome http://localhost:9411/zipkin/
echo Press CTRL+C when you want to stop the server...
java -jar zipkin.jar