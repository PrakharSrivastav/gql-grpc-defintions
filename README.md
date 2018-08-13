# Description

This project sets up protobuf definitions being used in the project [gql-server](https://github.com/PrakharSrivastav/gql-server). We will use the native compiler for protobuf and generate extensions in go and java to implement the gRPC client and server

## Installation instructions
Follow the instructions on [this](https://gist.github.com/sofyanhadia/37787e5ed098c97919b8c593f0ec44d8) page to install protoc compiler.

### Create protobuf definition of payload and services
Start by creating the protobuf workload in ./schema directory. Save payload and service definitions in the .proto files. 

### Generate definitions in go and java

#### Generating golang stubs
Using the protoc compiler run the below command to generate rpc methods and the Request, response payloads.
- `go get -u github.com/golang/protobuf/{proto,protoc-gen-go}`
- `export PATH=$PATH:$GOPATH/bin`
- `protoc --go_out=plugins=grpc:./go ./schema/*.proto`

#### Generating Java stubs
I have configured gradle to generate the Java stubs. This is because gradle(or maven) can be easily configured to publish to a repo like artifactory, which can be used as dependency in the java projects. Right now, for case of simplicity, we will generate the java source code under 'java/main' directory and copy these over to gql-server project.
- run `/gradlew build` from root of the project.
Instructions to use protoc compiler will be added soon for generating Java stubs.

After end of these steps, we will have golang and java stubs ready to play around with. We will implement the server in golang (as microservices) and Client in Java. These server and clients would run on kubernetes. To see the complete example, check these repo
- [gql-server](https://github.com/PrakharSrivastav/gql-server) - Implementation of graphql-server with grpc clients for Go microservices
- [artist-service](https://github.com/PrakharSrivastav/artist-service-grpc) - Go gRPC artist microservice
- [track-service](https://github.com/PrakharSrivastav/track-service-grpc) - Go gRPC track microservice
- [album-service](https://github.com/PrakharSrivastav/album-service-grpc) Go gRPC album microservice
