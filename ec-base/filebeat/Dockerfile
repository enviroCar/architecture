<<<<<<< HEAD

ARG ELK_VERSION
FROM docker.elastic.co/beats/filebeat:${ELK_VERSION}
=======
FROM docker.elastic.co/beats/filebeat:7.0.0
>>>>>>> f2e586f092db80f558c7ec21a791ec847f699d96
COPY filebeat.yml /usr/share/filebeat/filebeat.yml

# must run as root to access /var/lib/docker and /var/run/docker.sock
USER root
RUN chown root /usr/share/filebeat/filebeat.yml

# dont run with -e, to disable output to stderr
CMD [""]