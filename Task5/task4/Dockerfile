FROM ubuntu:latest

USER root

COPY target /task4-1.0-SNAPSHOT.jar/home/app/

RUN apt-get -y -q update
RUN apt-get -y -q install software-properties-common htop
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get -y -q install openjdk-8-jdk openjdk-8-jre
RUN apt-get -y -q install libslf4j-java 

ENTRYPOINT ["java","-cp","/home/app/task4-1.0-SNAPSHOT.jar","com.company.sapriko.Task5.task4.Runner"]