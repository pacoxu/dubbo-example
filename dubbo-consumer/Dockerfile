FROM tomcat:8.5.8-jre8-alpine

ADD target/dubbo-consumer.war /usr/local/tomcat/webapps/ROOT.war

RUN rm -rf /usr/local/tomcat/webapps/ROOT && \
    rm -rf /usr/local/tomcat/webapps/examples && \
    rm -rf /usr/local/tomcat/webapps/docs
