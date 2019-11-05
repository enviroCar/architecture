ARG REGISTRY_VERSION=2

FROM registry:${REGISTRY_VERSION}

HEALTHCHECK --interval=5s --timeout=20s --retries=3 CMD \
  wget http://localhost:5000/v2 -q -O - > /dev/null 2>&1
