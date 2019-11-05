FROM mongo:4-xenial

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  mongo localhost --eval 'quit(db.runCommand({ping:1}).ok ? 0 : 1)'
