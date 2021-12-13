FROM docker.elastic.co/elasticsearch/elasticsearch:7.16.1

COPY heapsize.options log4j2.options config/jvm.options.d/


HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
    status=$(curl -f -s localhost:9200/_cat/health?h=status) && [ "$status" == "green" -o "$status" == "yellow" ] && exit 0 || exit 1
