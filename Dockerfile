FROM tomcat:8.0.20-jre8
FROM maven:3.5.2-jdk-8
COPY /target/springmvc.war /usr/local/tomcat/webapps/ 
ENTRYPOINT ["java", "-war", "/usr/local/tomcat/webapps/springmvc.war"]
