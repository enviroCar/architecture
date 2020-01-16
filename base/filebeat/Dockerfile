
FROM docker.elastic.co/beats/filebeat:7.0.0
COPY filebeat.yml /usr/share/filebeat/filebeat.yml
COPY ilm.json     /usr/share/filebeat/ilm.json 

# must run as root to access /var/lib/docker and /var/run/docker.sock
USER root
RUN chown root /usr/share/filebeat/filebeat.yml \
 && chmod 644 /usr/share/filebeat/filebeat.yml

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  filebeat test output

# dont run with -e, to disable output to stderr
CMD [""]
