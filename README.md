## Sample Application demo for Spring Boot , Docker and Kubernetes

## Pre-requisites:
1. Install Docker on your machine
2. Install Gradle
3. Install Brew for MacOS
4. Install Minikube (installation reference: https://kubernetes.io/docs/tutorials/stateless-application/hello-minikube/ )
  1. curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-darwin-amd64 && \
  chmod +x minikube && \
  sudo mv minikube /usr/local/bin/
  2. brew install docker-machine-driver-xhyve
sudo chown root:wheel $(brew --prefix)/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
sudo chmod u+s $(brew --prefix)/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve
  3. brew install kubectl

## Steps to install and run the application
1. Clone the repository (git clone https://github.com/akothiyal-deloitte/home-office.git)
2. Change directory to home-office on terminal and run command "gradle clean build buildDocker". This should create docker images locally. Check by using command- "docker images"
## if using docker to manage containers
3. execute command "docker-compose up" (check processes are running by command "docker ps" )
4. Hit the url http://localhost:8780/fees or http://localhost:8780/circumstance, to test if application is working.
5. To terminate the application use "docker-compose down" command from another terminal tab.


## Commands used during Kubernetes demo from the root project folder /home-office (if using kubernetes to manage deployments)
1. minikube start --vm-driver=xhyve
2. eval $(minikube docker-env) (switch to minikube provided docker version to allow local docker builds on vm)
  1. gradle clean build buildDocker
3. kubectl create -f home-office/fee-service/fee-deployment.yml
4. kubectl create -f home-office/fee-service/fee-service.yml
5. kubectl create -f home-office/circumstance-service/circumstance-deployment.yml
6. kubectl create -f home-office/circumstance-service/circumstance-service.yml
7. kubectl get pods
8. kubectl get deployments
9. kubectl get services
  1. minikube service fee-service (testing exposed service)
  2. minikube service circumstance-service (testing exposed service)
10. kubectl scale --replicas=3 -f home-office/fee-service/fee-deployment.yml
11. kubectl create -f ingress.yml
  1. Edit host file to add [cluster-ip] micro.all. Save and Close.
  2. Hit following urls to test - http://micro.all/circumstance/circumstance and http://micro.all/fee/fees
12. kubectl delete -f ingress.yml
13. kubectl delete -f home-office/fee-service/fee-deployment.yml
14. kubectl delete -f home-office/fee-service/fee-service.yml
15. kubectl delete -f home-office/circumstance-service/circumstance-deployment.yml
16. kubectl delete -f home-office/circumstance-service/circumstance-service.yml
17. minikube stop

## Setting up Travis CI

1. Ensure that you have a GitHub account registered on https://travis-ci.org/ , and that this repo is part of your account.
2. Follow the instructions on the Travis CI website to link this repo onto the Travis CI dashboard (Click on your username, then on accounts, then select this repo. If it does not appear in the list, click "sync account" )
3. In order to trigger builds, a .travis.yml file needs to be created, and added to the root directory. This yaml file triggers and configures travis to build your code when it is pushed up to GitHub, or when a PR is raised for it. 
4. Settings for the yaml file can be found here : https://docs.travis-ci.com/

