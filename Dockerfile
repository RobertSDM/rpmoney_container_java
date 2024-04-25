FROM tomcat:10
WORKDIR /usr/local/tomcat/webapps
COPY  ./target/DimMoneyAppRM552520.war .
EXPOSE 8080
