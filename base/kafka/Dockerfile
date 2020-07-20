FROM confluentinc/cp-kafka:latest

RUN apt-get update \
 && apt-get install -y --no-install-recommends jq \
 && rm -rf /var/lib/apt/lists/*

ADD healthcheck.sh /usr/local/bin/healthcheck

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD healthcheck

ENV KAFKA_LISTENER_SECURITY_PROTOCOL_MAP "LISTENER_DOCKER_INTERNAL:PLAINTEXT,LISTENER_DOCKER_EXTERNAL:PLAINTEXT"
ENV KAFKA_INTER_BROKER_LISTENER_NAME "LISTENER_DOCKER_INTERNAL"
ENV KAFKA_LOG4J_LOGGERS "kafka.controller=INFO,kafka.producer.async.DefaultEventHandler=INFO,state.change.logger=INFO"
ENV KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR "1"
ENV KAFKA_MESSAGE_MAX_BYTES "157286400"
ENV KAFKA_MAX_REQUEST_SIZE "157286400"
ENV KAFKA_MAX_PARTITION_FETCH_BYTES "157286400"
ENV KAFKA_BROKER_ID "1"
