ARG ELK_VERSION
FROM docker.elastic.co/elasticsearch/elasticsearch:${ELK_VERSION}


HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
    status=$(curl -f -s localhost:9200/_cat/health?h=status) && [ "$status" == "green" -o "$status" == "yellow" ] && exit 0 || exit 1
