FROM docker:dind

RUN apk add --no-cache curl

VOLUME /certs

ENV DOCKER_TLS_CERTDIR /certs

HEALTHCHECK --interval=5s --timeout=20s --retries=3 CMD \
  curl --fail --silent \
    --cacert ${DOCKER_TLS_CERTDIR}/client/ca.pem \
    --cert ${DOCKER_TLS_CERTDIR}/client/cert.pem \
    --key ${DOCKER_TLS_CERTDIR}/client/key.pem \
    https://localhost:2376/v1.40/info
