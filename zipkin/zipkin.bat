@echo off
title Zipkin Server - localhost development
echo Getting the last version
curl -sSL https://zipkin.io/quickstart.sh | bash -s
echo Starting Zipkin Server.
echo Press CTRL+C when you want to stop the server...
java -jar zipkin.jar
echo Zipkin Server is stopped.
echo Press ENTER to close this window...
pause