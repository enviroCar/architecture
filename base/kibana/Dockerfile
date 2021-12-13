FROM docker.elastic.co/kibana/kibana:7.16.1

COPY kibana.yml /opt/kibana/config/kibana.yml
HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  curl -sf http://localhost:5601/api/status
