**Create Kubernetes environment**
`$ minikube start`
Set the vertial machine environment
`$ eval $(minikube docker-env)`

or 

`$ minikube start --driver=virtualbox`

**Load balance kubernetes**

`$ minikube addons enable ingress`

**Kubernetes dashboard**

`$ minikube dashboard`

**Tear down Kubernetes**
`$ minikube stop`
`$ minikube delete`
Set the vertial machine environment
`$ eval $(minikube docker-env -u)`

**Create the Kubernetes resources**
`$ kubectl create -f file.yaml`
`$ kubectl create -f .`
or
`$ kubectl apply -f file.yaml`
`$ kubectl apply -f .`

**See nodes**
`$ kubectl get nodes`
NAME       STATUS   ROLES                  AGE   VERSION
minikube   Ready    control-plane,master   45s   v1.23.1

**See pods**
`$ kubectl get pods [--watch]`
NAME                                    READY   STATUS    RESTARTS   AGE
inventory-deployment-594c957bb4-h4djj   1/1     Running   0          37s
sdb-cache-6f56896c64-jcrw2              1/1     Running   0          81m
system-deployment-85cbc77df4-b6hs8      1/1     Running   0          37s

**See ip address**
`$ kubectl get pods -o wide`
NAME                                    READY   STATUS    RESTARTS   AGE     IP           NODE       NOMINATED NODE   READINESS GATES
inventory-deployment-594c957bb4-7g4j4   1/1     Running   0          5m24s   172.17.0.3   minikube
sdb-cache-6f56896c64-jhx7w              1/1     Running   0          5m24s   172.17.0.5   minikube
system-deployment-85cbc77df4-l56pc      1/1     Running   0          5m24s   172.17.0.4   minikube

**See information of container in pod**
`$ kubectl logs system-deployment-85cbc77df4-b6hs8`

``$ kubectl exec --stdin --tty system-deployment-85cbc77df4-b6hs8 -- /bin/bash``

**See service**
`$ kubectl get svc`

**Namespaces**
`$ kubectl get namespaces`
NAME              STATUS   AGE
default           Active   5m49s
kube-node-lease   Active   5m51s
kube-public       Active   5m51s
kube-system       Active   5m51s

$ `kubectl describe namespaces default`
Name:         default
Labels:       kubernetes.io/metadata.name=default
Annotations:  <none>
Status:       Active

No resource quota.

No LimitRange resource.

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



---
# Intermicroservice  communication
 **DNS**
https://dev.to/narasimha1997/communication-between-microservices-in-a-kubernetes-cluster-1n41
Using fully-qualified DNS names
If we have cluster-aware DNS service
like CoreDNS running, we can use fully qualified DNS names. starting from cluster.local
Assume that our web-server is running in namespace test-namespace and has a service
web-app-service defined. We can address this using an URL shown below:
web-app-service.test-namespace.svc.cluster.local
1. .cluster.local
Communication between Microservices in a Kubernetes cluster - DEV Community
: This is the root of our cluster DNS, every resource must be accessed
from root.
2. .svc : This tells we are accessing a service resource.
3. test-namespace : This is the namespace where our web-app-service is defined.
4. web-app-service :
This is our service name.

We can use URLs like
http://web-app-service.test-namespace.svc.cluster.local:
( xxxx is the Port, you can optionally ignore this if the service is mapping default
http port 80 )

---

