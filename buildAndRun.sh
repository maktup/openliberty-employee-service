#!/bin/sh
mvn clean package && docker build -t com.javabullets.javaee8/javaee8 .
docker rm -f javaee8 || true && docker run -d -p 8080:8080 -p 4848:4848 --name employee-service com.javabullets.javaee8/javaee8 
