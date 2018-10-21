#!/usr/bin/env bash

export JAR_FILE=target/p2pdinner-config-server-0.0.1-SNAPSHOT.jar
docker build -t p2pdinner-config-service .
docker build --build-arg JAR_FILE=target/p2pdinner-config-server-0.0.1-SNAPSHOT.jar -t p2pdinner-config-service .

# docker run -p 8888:8888 -t p2pdinner-config-service