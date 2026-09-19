# 🚀 Microservices Application

A **Spring Boot Microservices application** demonstrating how multiple independent services communicate and work together using **Service Discovery, API Gateway, Centralized Configuration, and Distributed Tracing**.

The project consists of Employee and Department microservices along with supporting infrastructure such as **Eureka Service Registry, Spring Cloud Config Server, API Gateway, and Zipkin**.

## 🏗️ Architecture

```text
                         ┌─────────────────────┐
                         │     API Gateway     │
                         │       :8060         │
                         └──────────┬──────────┘
                                    │
                    ┌───────────────┴───────────────┐
                    │                               │
                    ▼                               ▼
          ┌──────────────────┐           ┌──────────────────┐
          │ Employee Service │           │ Department       │
          │                  │           │ Service          │
          │                  │           │                  │
          │                  │           │ :8081            │
          └────────┬─────────┘           └────────┬─────────┘
                   │                              │
                   └──────────────┬───────────────┘
                                  │
                                  ▼
                       ┌─────────────────────┐
                       │   Eureka Server     │
                       │ Service Registry    │
                       │       :8761         │
                       └─────────────────────┘

                       ┌─────────────────────┐
                       │   Config Server     │
                       │       :8088         │
                       └─────────────────────┘

                       ┌─────────────────────┐
                       │       Zipkin        │
                       │ Distributed Tracing │
                       │       :9411         │
                       └─────────────────────┘
```

## ✨ Features

* 🔹 Microservices-based architecture
* 🔹 Employee Management Service
* 🔹 Department Management Service
* 🔹 Service Discovery using Eureka
* 🔹 Centralized configuration using Spring Cloud Config
* 🔹 API Gateway for routing requests
* 🔹 Inter-service communication
* 🔹 Load-balanced service communication
* 🔹 Distributed request tracing with Zipkin
* 🔹 RESTful APIs
* 🔹 Independent service deployment
* 🔹 Scalable and maintainable architecture

## 🧩 Project Modules

| Module             | Description                        |   Port |
| ------------------ | ---------------------------------- | -----: |
| `service_registry` | Eureka Service Registry            | `8761` |
| `config_server`    | Centralized configuration server   | `8088` |
| `depart_service`   | Department management microservice | `8081` |
| `employee-service` | Employee management microservice   |      — |
| `Api-Gateway`      | API Gateway for routing requests   | `8060` |

## 🛠️ Technologies Used

### Backend

* Java
* Spring Boot
* Spring Cloud
* Spring Web
* Spring Data JPA
* REST APIs

### Microservices & Cloud

* Spring Cloud Netflix Eureka
* Spring Cloud Config
* Spring Cloud Gateway
* Service Discovery
* Client-side Load Balancing

### Monitoring

* Zipkin
* Distributed Tracing

### Development Tools

* Maven
* Git
* GitHub
* Postman
* IntelliJ IDEA / Eclipse

## 🔄 Microservices Communication

The application follows a service-oriented architecture where each business functionality is separated into an independent service.

For example:

```text
Client
  │
  ▼
API Gateway
  │
  ├──► Employee Service
  │
  └──► Department Service
```

The services register themselves with **Eureka**, allowing other services and the API Gateway to discover them dynamically.

## 🌐 Service Registry

The Eureka Server acts as the **Service Registry**.

Open:

```text
http://localhost:8761
```

It provides a dashboard where registered microservices can be monitored.

## ⚙️ Config Server

The Config Server provides **centralized configuration management** for the microservices.

```text
Config Server
     │
     ├── Employee Service
     └── Department Service
```

This avoids maintaining configuration separately across every service.

## 🚪 API Gateway

The API Gateway acts as the single entry point for clients.

Gateway:

```text
http://localhost:8060
```

Instead of directly accessing individual microservices, clients can send requests through the gateway.

Example:

```text
Client
   │
   ▼
API Gateway :8060
   │
   ├── Employee Service
   │
   └── Department Service
```

## 📊 Distributed Tracing with Zipkin

Zipkin is used to monitor and trace requests across different microservices.

Zipkin dashboard:

```text
http://localhost:9411
```

It helps identify:

* Request flow
* Service-to-service communication
* Request duration
* Service dependencies
* Performance bottlenecks

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/SoundaryanA46/Microservices-App.git
```

Navigate to the project:

```bash
cd Microservices-App
```

### 2. Start the Services

Start the services in the following order:

```text
1. Config Server
2. Service Registry
3. Department Service
4. Employee Service
5. API Gateway
```

### 3. Verify Eureka

Open:

```text
http://localhost:8761
```

Verify that the required microservices are registered.

### 4. Access the API Gateway

Use:

```text
http://localhost:8060
```

API requests can be sent through the gateway using Postman or another REST client.

### 5. Open Zipkin

Open:

```text
http://localhost:9411
```

Use Zipkin to inspect distributed request traces.

## 🧪 Testing

The APIs can be tested using **Postman**.

Example workflow:

```text
Postman
   │
   ▼
API Gateway
   │
   ▼
Microservice
   │
   ▼
Response
```

You can test:

* Employee APIs
* Department APIs
* Gateway routing
* Service discovery
* Inter-service communication

## 📁 Project Structure

```text
Microservices-App/
│
├── Api-Gateway/
│
├── config_server/
│
├── depart_service/
│
├── employee-service/
│
├── service_registry/
│
└── README.md
```

## 🎯 Learning Objectives

This project was developed to understand practical implementation of:

* Microservices architecture
* Spring Boot application development
* Spring Cloud ecosystem
* Service discovery
* API Gateway pattern
* Centralized configuration
* Inter-service communication
* Distributed tracing
* REST API development
* Scalable backend architecture


## 👨‍💻 Author

**Soundaryan Anbalagan**

Computer Science & Engineering | Java | Spring Boot | Microservices | Backend Development

### Connect with Me

* GitHub: [SoundaryanA46](https://github.com/SoundaryanA46)

---

