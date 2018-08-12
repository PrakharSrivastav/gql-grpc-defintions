# Description

This project sets up protobuf definitions being used in the project [gql-server](https://github.com/PrakharSrivastav/gql-server). We will use the native compiler for protobuf and generate extensions in go and java to implement the gRPC client and server

## Installation instructions
Follow the instructions on [this](https://gist.github.com/sofyanhadia/37787e5ed098c97919b8c593f0ec44d8) page to install protoc compiler.

### Create protobuf definition of payload and services
### Generate definitions in go and java
`protoc --go_out=plugins=grpc:./go ./schema/*.proto`
`protoc --java_out=./java ./schema/*.proto`