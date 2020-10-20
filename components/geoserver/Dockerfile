FROM kartoza/geoserver:2.16.1 

HEALTHCHECK --interval=10s --timeout=5s --retries=5 CMD \
  curl -s -f 'http://localhost:8080/geoserver/ows?service=wms&version=1.3.0&request=GetCapabilities' >/dev/null 2>&1
