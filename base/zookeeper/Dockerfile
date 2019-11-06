FROM confluentinc/cp-zookeeper:latest

 HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  test "$(echo ruok | nc localhost $ZOOKEEPER_CLIENT_PORT)" = imok

ENV ZOOKEEPER_CLIENT_PORT "2181"
ENV zk_id "1"
