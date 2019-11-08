# FSD_SBA By Shawn
Github https://github.com/ascmaaa00/FSD_SBA
Because of the internet and speed issue, I run the SBA on my computer.
Can check all the Assessment with function PNG file in ./FSD_SBA/Assessment .

# Achetect
1.Run three mysql db use docker.
The DB table will create automatically by JPA function.

docker run --name mysql-account -p 32001:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=sba_account -e MYSQL_USER=user -e MYSQL_PASSWORD=123456 -d mysql:latest

docker run --name mysql-course -p 32002:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=sba_course -e MYSQL_USER=user -e MYSQL_PASSWORD=123456 -d mysql:latest

docker run --name mysql-payment -p 32003:3306 -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=sba_payment -e MYSQL_USER=user -e MYSQL_PASSWORD=123456 -d mysql:latest

2.I create two docker for gateway and registry , other middle wiers i use Intellij IDE to start.

cd C:\D\文件\IBM\FSD\SBA_shawn\registry-master
docker build -t registry . --no-cache
docker run -d -p 10001:10001 registry


cd C:\D\文件\IBM\FSD\SBA_shawn\gateway-master
docker build -t gateway . --no-cache
docker run -d -p 9000:9000 gateway


3.Go to ./front-master ,use ng serve command to run a web service

4.Run other spring boot.

5.Check the Eureka ,http://localhost:10001/

6.Go http://localhost:4200/ to check the Website.

# URL PATH
Angular index page :http://localhost:4200/
Eureka :http://localhost:10001/
Jenkins http://localhost:8080/job/pipeline-demo/ 、 http://localhost:8080/job/sbatest/


#Install in windows.
Postman-win64-7.10.0-Setup.exe 、 apache-jmeter-5.1.1 、jenkins-2.190.2 、docker desktop to run for SBA Assessment in windows.
