# enviroCar Architecture

Docker Architecture for envirocar.org


## Base Architecture 
* GeoServer
* PostgreSQL (inkl. OSM-Daten)
* MongoDB (2 Instanzen)
* enviroCar-UMS
* enviroCar-DMS
* (WebApp in Docker)
* (Auth-Proxy)
* Processing Service MapMatching
* Processing Service Statistics
* Base Infrastructure
  * Caddy
  * ELK
  * Config-Management? (etcd, redis)
  * Kafka
  * Zookeeper
  * Apache Flink (oder was auch immer)
* CI/CD/CX
  * Watchtower
  * Docker Registry
  * Jenkins

# Troubleshooting
## Setting up ElasticSearch on Docker

```ERROR: [2] bootstrap checks failed
[1]: max virtual memory areas vm.max_map_count [65530] is too low, increase to at least [262144]
```

Solution: sudo sysctl -w vm.max_map_count=262144

