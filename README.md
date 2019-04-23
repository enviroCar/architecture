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

