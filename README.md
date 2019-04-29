# enviroCar Architecture

Docker Architecture for envirocar.org

## Base Architecture

### ec-base
* Zookeeper
* Kafka
* ElasticSearch
* Kibana
* Filebeat

### ec-cicd
* Docker Registry
* Docker Engine
* Jenkins
* Watchtower

### ec-components
* GeoServer
* PostgreSQL (inkl. OSM-Daten)
* MongoDB (2 Instanzen)
* enviroCar-UMS
* enviroCar-DMS
* Auth-Proxy
* WebApp
* Landing Page

### ec-proxy
* Caddy

### Todo
* Processing Service MapMatching
* Processing Service Statistics
* Base Infrastructure
  * Config-Management? (etcd, redis)
  * Apache Flink (oder was auch immer)

# Troubleshooting
## Setting up ElasticSearch on Docker

```ERROR: [2] bootstrap checks failed
[1]: max virtual memory areas vm.max_map_count [65530] is too low, increase to at least [262144]
```

Solution: sudo sysctl -w vm.max_map_count=262144

