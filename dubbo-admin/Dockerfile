FROM tomcat:8.0.39-jre7-alpine

ADD dubbo-admin-2.5.4.war /usr/local/tomcat/webapps/ROOT.war

RUN rm -rf /usr/local/tomcat/webapps/ROOT && \
    rm -rf /usr/local/tomcat/webapps/examples && \
    rm -rf /usr/local/tomcat/webapps/docs
