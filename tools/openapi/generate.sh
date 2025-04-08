#!/bin/bash

scriptDir=$(cd $(dirname $0) && pwd)
workDir=$(cd ${scriptDir}/../.. && pwd)


npx openapi-generator-cli generate \
  -g kotlin-spring \
  -i "$workDir"/todo-api/schema/openapi.yml \
  -o "$workDir"/todo-api \
  -c "$scriptDir"/openapi-config.yml
