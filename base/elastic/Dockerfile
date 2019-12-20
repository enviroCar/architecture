FROM docker.elastic.co/elasticsearch/elasticsearch:7.0.0

COPY jvm.options config/jvm.options


HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
    status=$(curl -f -s localhost:9200/_cat/health?h=status) && [ "$status" == "green" -o "$status" == "yellow" ] && exit 0 || exit 1
