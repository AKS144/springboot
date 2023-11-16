FROM openjdk:21-jdk-slim
WORKDIR /springboot-demo
COPY target/springboot-demo-0.0.1-SNAPSHOT.jar springboot.jar
EXPOSE 8080
CMD ["java", "-jar", "springboot-demo.jar"]



#FROM 
#COPY target/addressbook-2.0.war /usr/local/tomcat/webapps/
#CMD ["catalina.sh","run"]
#EXPOSE 8080
