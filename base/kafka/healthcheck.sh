#!/bin/bash

function contains() {
  local n=$#
  local value=${!n}
  for ((i=1; i < $#; i++)) {
      if [ "${!i}" == "${value}" ]; then
          echo "y"
          return 0
      fi
  }
  echo "n"
  return 1
}


ids=(
    $(zookeeper-shell ${KAFKA_ZOOKEEPER_CONNECT} <<< "ls /brokers/ids" | tail -1 | jq '.[]')
)


[ "$(contains "${ids[@]}" "$KAFKA_BROKER_ID")" == "y" ] && exit 0 || exit 1
