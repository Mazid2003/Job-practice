# 🧠 System Design Concepts – Complete Reference Guide

This document provides a **clear, interview-ready, and real-world focused** overview of **core System Design concepts** with meanings, reasons, use cases, and examples.

---

## 📊 Core System Design Concepts Table

| **Concept** | **What It Means** | **Why It Exists** | **When to Use** | **Real-World Example** |
|---|---|---|---|---|
| **Scalability** | Ability to handle more users/load | Support growth | High-traffic apps | Instagram scaling |
| **Latency** | Time to get a response | Better UX | Real-time systems | Video calls |
| **Throughput** | Requests handled per second | Measure capacity | APIs, pipelines | Payment gateways |
| **Load Balancing** | Distributing traffic | Avoid overload | Multi-server systems | AWS ELB |
| **Caching** | Store frequent data in memory | Faster responses | Read-heavy apps | Browser cache |
| **Database Indexing** | Faster data lookup | Performance | Large databases | Search by user ID |
| **Horizontal Scaling** | Add more servers | Elastic growth | Cloud systems | Microservices |
| **Vertical Scaling** | Increase server power | Simple upgrade | Monolith apps | RAM upgrade |
| **Replication** | Copying data | High availability | Fault tolerance | Read replicas |
| **Sharding** | Splitting database | Handle big data | Large-scale DBs | User-based shards |
| **Consistency** | Same data everywhere | Data correctness | Banking apps | Account balance |
| **Availability** | System always online | User trust | Consumer apps | WhatsApp uptime |
| **Partition Tolerance** | Survive network failures | Distributed systems | Global systems | Cloud services |
| **CAP Theorem** | Consistency vs Availability trade-off | System design rule | Distributed DBs | Cassandra |
| **Rate Limiting** | Restrict requests | Prevent abuse | Public APIs | Login limits |
| **Fault Tolerance** | Survive failures | Reliability | Mission-critical apps | Payment systems |
| **CDN** | Content Delivery Network | Faster global access | Global users | YouTube videos |
| **Message Queue** | Async communication | Decouple services | Event-driven apps | Kafka |
| **Idempotency** | Same result on retries | Safe operations | Payment APIs | Retry payments |
| **Data Consistency Models** | Sync vs async updates | Balance speed & accuracy | Distributed DBs | Eventual consistency |

---

## 🧩 Additional System Design Concepts (Advanced)

| **Concept** | **Description** | **Example / Use Case** |
|---|---|---|
| **Microservices** | Independent services per feature | Netflix architecture |
| **Monolithic Architecture** | Single codebase system | Early-stage startups |
| **API Gateway** | Central entry for APIs | Authentication, routing |
| **Event-Driven Architecture** | Reacts to events | Order placed → notify |
| **Circuit Breaker** | Stops failing requests | Prevent cascading failures |
| **Service Discovery** | Services find each other | Kubernetes |
| **Auto Scaling** | Dynamic resource scaling | AWS ASG |
| **Health Checks** | Monitor service health | Restart failed services |
| **Read Replica** | DB copy for reads | Reduce DB load |
| **Write Ahead Logging** | Log before write | Crash recovery |
| **Stateless Services** | No local session data | Easy scaling |
| **Stateful Services** | Maintains session | Needs sticky sessions |
| **Timeouts & Retries** | Handle slow services | Network resilience |
| **Observability** | Logs, metrics, traces | Debugging & monitoring |
| **Blue-Green Deployment** | Zero-downtime release | Safe deployments |
| **Canary Deployment** | Gradual rollout | Risk reduction |


### Youtube Playlist for System Design 
 
- **[System Design Playlist in Telugu](https://www.youtube.com/watch?v=HIswoUBRPD8)**
- **[System Design Playlist in Hindi](https://www.youtube.com/playlist?list=PLA3GkZPtsafZdyC5iucNM_uhqGJ5yFNUM)**
- **[System Design Playlist in English](https://www.youtube.com/playlist?list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX)**

### Github repo's for System Design

   - **[Reference repo for Low Level System Design](https://github.com/ashishps1/awesome-low-level-design)**
   - **[Awesome System Design resources](https://github.com/ashishps1/awesome-system-design-resources)**
