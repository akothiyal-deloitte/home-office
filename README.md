## Sample Application demo for Spring Boot , Docker and Kubernetes
 
##Pre-requisites:
1. Install Docker on your machine

##Steps to install and run the application 
1. Clone the repository (git clone https://github.com/akothiyal-deloitte/home-office.git)
2. Change directory to home-office on terminal and run command "gradle clean build buildDocker". This should create docker images locally. Check by using command- "docker images"
3. execute command "docker-compose up" (check processes are running by command "docker ps" )
4. Hit the url http://localhost:8780/fees or http://localhost:8780/circumstance, to test if application is working.
5. To terminate the application use "docker-compose down" command from another terminal tab.
