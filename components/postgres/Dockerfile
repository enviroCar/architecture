FROM mdillon/postgis:10-alpine

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  pg_isready -q -h localhost -d ${POSTGRES_DB} -U ${POSTGRES_USER}

