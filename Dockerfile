FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/oms-product-service-0.0.1-SNAPSHOT.jar oms-product.jar
RUN sh -c 'touch /oms-product.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/oms-product.jar"]
EXPOSE 9091
