FROM tomcat:8.0.20-jre8

COPY target/Spring_MVC_First.war  /usr/local/tomcat/webapps/Spring_MVC_First.war

EXPOSE 8080
