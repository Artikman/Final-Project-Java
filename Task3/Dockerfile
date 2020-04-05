FROM ubuntu:latest

MAINTAINER Artyom <sapriko.artem74@mail.ru>

COPY MyApplication/target/MyApplication-1.0-SNAPSHOT.jar /home/app/

RUN apt-get -y -q update
RUN apt-get -y -q install software-properties-common htop
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get -y -q install openjdk-8-jdk openjdk-8-jre

RUN apt-get -y -q install maven

RUN java -cp /home/app/MyApplication-1.0-SNAPSHOT.jar
com.epam.sapryka.Runner

ENTRYPOINT mvn -f /home/app/pom.xml install