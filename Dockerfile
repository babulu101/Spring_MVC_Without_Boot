FROM tomcat:9.0.104-jre17

COPY target/Spring_MVC_First.war  /usr/local/tomcat/webapps/Spring_MVC_First.war

EXPOSE 8080
