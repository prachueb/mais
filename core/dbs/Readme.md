# Running in develop mode

`$ mvn -pl inventory liberty:dev`

`$ mvn -pl dbs-cache liberty:dev`

And use

http://localhost:9080/dbs-cache/properties
http://localhost:9080/dbs-cache/google.com
http://localhost:9080/dbs-cachesystem/hello

---
# Running app in kubernetes
**The docker image that build outside of kubernetes could not deploy in the kubernetes !!!**

**Change by using command `$ eval $(minikube docker-env)` and `$ eval $(minikube docker-env -u)`**

---

`$ minikube start`

or 

`$ minikube start --driver=virtualbox`

Optional

`$ minikube addons enable ingress`

Have the dashboard using

`$ minikube dashboard`

or command line

`$ kubectl get nodes`

NAME       STATUS   ROLES                  AGE   VERSION
minikube   Ready    control-plane,master   45s   v1.23.1

`$ eval $(minikube docker-env)`

`$ mvn clean package`



`$ docker pull icr.io/appcafe/open-liberty:full-java11-openj9-ubi`

`$ docker build -t dbs-cache:1.0-SNAPSHOT dbs-cache/.`

`$ docker build -t core-db-1:1.0-SNAPSHOT core-db-1/.`

`$ docker build -t inventory:1.0-SNAPSHOT inventory/.`

`$ docker build -t frontendui:1.0-SNAPSHOT frontendUI/.`



**Optional to create the sys-app-root** to define cacheHostIP and cacheHostPort

`$ kubectl create configmap sys-app-root --from-literal cacheHostIP=192.168.49.2 --from-literal cacheHostPort=30000`

`$ kubectl apply -f kubernetes`

`$ kubectl get pods [--watch]`

`$ kubectl get svc`

`$ kubectl describe pods`

`$ kubectl get pods -o wide`
NAME                                    READY   STATUS    RESTARTS   AGE   IP           NODE       NOMINATED NODE   READINESS GATES
dbs-cache-deployment-66ff54b588-x2jfd   1/1     Running   0          47s   172.17.0.3   minikube   <none>           <none>
dbs-cache-redis-7bbbcf5d8d-ddwwh        1/1     Running   0          47s   172.17.0.4   minikube   <none>           <none>
inventory-deployment-594c957bb4-hqdbt   1/1     Running   0          47s   172.17.0.5   minikube   <none>           <none>

`$ kubectl logs dbs-cache-deployment-66ff54b588-x2jfd`

`$ kubectl exec --stdin --tty dbs-cache-deployment-66ff54b588-x2jfd -- /bin/bash`

Goto Browser

*The dbs-cache may disable external access later.*

http://192.168.49.2:30010/dbs-cache/properties
http://192.168.49.2:30010/dbs-cache/google.com
http://192.168.49.2:30010/dbs-cache/hello

*inventory call to dbs-cache to dbs-cache-redis*

http://192.168.49.2:31110/inventory/systems/system-service

*frontendUI call to core-db-1 to derby*

http://192.168.49.2:31100/

## Interactive MySQL
`# kubectl run -it --rm --image=mysql:5.6 --restart=Never mysql-client -- mysql -h mysql -ppassword`


## Tear down

`$ kubectl delete -f kubernetes`

`$ kubectl delete configmap sys-app-root`

`$ kubectl delete deployment,svc derby`

`$ kubectl delete pvc database-pv-claim`

`$ kubectl delete pv database-pv-volume`

`$ eval $(minikube docker-env -u)`

`$ minikube stop`

`$ minikube delete`

`$ mvn clean`

---
# Build derby database server

`$ docker build --force-rm -t prachueb/derby:10.14.2.0 rdbms-engine/derby`

`$ docker login`

`$ docker push prachueb/derby:10.14.2.0`

`$ docker run --rm --detach -p 1527:1527 --name derby prachueb/derby:10.14.2.0`

`$ docker stop derby`

**Connect to Derby server in Kubernetes**

The *.war application using Openliberty should to place the *derby jar files* into *src/main/resources* and the *Dockerfile* should to copy these files into the docker container on build.

**Dockerfile**

    FROM icr.io/appcafe/open-liberty:full-java11-openj9-ubi
    
    COPY --chown=1001:0 src/main/resources/*.jar /opt/ol/wlp/usr/shared/resources/
    COPY --chown=1001:0 src/main/liberty/config /config/
    COPY --chown=1001:0 target/core-db-1.war /config/apps
    RUN configure.sh

---

# Debug in kubernetes

`kubectl exec --stdin --tty ubuntu -- /bin/bash`

`apt-get update`

`apt-get install -y curl`

`curl http://localhost:port/`

`apt-get install -y telnet`

`telnet host/ip port`
exit by press control and ] then q

You can run these example commands inside the container

`ls /`

`cat /proc/mounts`

`cat /proc/1/maps`

`apt-get update`

`apt-get install -y tcpdump`

`tcpdump`

`apt-get install -y lsof`

`lsof`

`apt-get install -y procps`

`ps aux`

`ps aux | grep nginx`