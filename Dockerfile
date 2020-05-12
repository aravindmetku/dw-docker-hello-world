FROM openjdk:8

COPY ./target/HelloWorld-1.0-SNAPSHOT.jar /data/HelloWorld-1.0-SNAPSHOT.jar
COPY ./hello-world-config.yml /data/hello-world-config.yml

CMD java -jar /data/HelloWorld-1.0-SNAPSHOT.jar server /data/hello-world-config.yml

EXPOSE 8080