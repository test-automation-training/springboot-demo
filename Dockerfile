FROM openjdk:8-jre-alpine

ADD build/libs/springboot-demo*.jar app.jar
ADD wait-for wait-for

CMD [ "sh", "-c", "java -jar app.jar" ]
