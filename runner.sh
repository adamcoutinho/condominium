#!/bin/bash
rm -rf run-platform
mkdir run-platform
mkdir -p run-platform/plugins
gradle clean build
cp  commons/build/libs/commons.jar run-platform/plugins
cp  plugin-model/build/libs/plugin-model.jar run-platform/plugins
cp  plugin-controller/build/libs/plugin-controller.jar run-platform/plugins
cp orchestrator/build/libs/orchestrator.jar run-platform

cd run-platform

java -jar orchestrator.jar