# Network collector interface (netcol_web)

Web interface for Netcol project

## Getting Started

### Prerequisites

For this project you need to install the next software:

```
java 1.8 or higher
gradle
docker
ssh client
```

### Installing

```
```

## Running

```
01. git clone 
02. cd netcol_web
03. ./gradlew  build 
04. docker build -t netcol_web .
05. docker run --name netcol_web -p 8087:8087 netcol_web
06. docker network inspect bridge
    - find ubuntu_sshd container IP Address. Example:
             "dbb9929a8a982cf83c187b115f1d2908c25d20919f38f2b2e0b27dcd214b2762": {
                 "Name": "ubuntu_sshd",
                 "EndpointID": "2e8411942ee3a81e7f785fd0bb3a4735763c162a62a1c00203a1190831a0948d",
                 "MacAddress": "02:42:ac:11:00:03",
                 "IPv4Address": "172.17.0.3/16",
                 "IPv6Address": ""
             },   
07. In a browser http://localhost:8087/hostParameters
08. In a browse click "Host Credentials" then enter:
    - Host IP Address: see p. 6 172.17.0.3
    - Login: root
    - Password: root
    click "Send Request"
09. You will be redirect back to http://localhost:8087/hostParameters
10. click on any field in "Id" column
11. !!!Currently parser works with Linux hosts only.
```

### Docker
```
./gradlew  build 
docker build -t netcol_web .
docker run --name netcol_web -p 8087:8087 netcol_web
```

License
=======
Sourcerer is under the MIT license. See the [LICENSE](https://github.com/sourcerer-io/sourcerer-app/blob/develop/LICENSE.md) for more information.
