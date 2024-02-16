FROM ubuntu:22.04

RUN apt-get update \
    && apt-get upgrade -y

RUN apt-get install -y proftpd

EXPOSE 21 

EXPOSE 20

CMD [ "proftpd", "--nodaemon" ]