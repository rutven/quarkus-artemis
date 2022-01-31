# How to run ArtemisMQ in docker

## Create volumes

docker volume create artemis-vol-data
docker volume create artemis-vol-etc

## Pull image

docker pull qoricode/activemq-artemis

## Run container

docker run -it --rm -p 8161:8161 -p 61616:61616 --name artemis -v artemis-vol-data:/var/lib/artemis/data -v artemis-vol-etc:/var/lib/artemis/etc qoricode/activemq-artemis

## Login to web portal

<http://localhost:8161/console/artemis>
u: artemis
p: simetraehcapa
