# 📘 PatternForge – Interactive Structural Design Pattern Playground

## 🚀 Overview

PatternForge is a full-stack Java Spring Boot application designed to visualize and interact with structural design patterns in real time.

This project goes beyond theory by making design patterns visible through REST APIs, WebSockets, and dynamic UI rendering.

---

## 🎯 Objective

To build an interactive system that demonstrates:

- Composite  
- Decorator  
- Adapter  
- Facade  
- Proxy  
- Bridge  
- Flyweight  

---

## 🏗️ Architecture

Frontend (Thymeleaf / React)  
↓  
REST Controllers (Spring Boot)  
↓  
Service Layer (Pattern Implementations)  
↓  
Core Domain Models  
↓  
AOP Pattern Tracer  
↓  
WebSocket (Live Updates)  

---

## 🛠️ Tech Stack

- Java 17  
- Spring Boot 3  
- Maven  
- REST APIs  
- WebSocket (STOMP)  
- Spring AOP  
- Thymeleaf / React  
- Swagger (OpenAPI)  
- Docker  

---

## 📂 Project Structure

src/main/java/com/patternforge

- controller       → REST APIs  
- service          → Business logic  
- model            → Core models  
- patterns         → Composite  
- decorator        → Decorator  
- adapter          → Adapter  
- facade           → Facade  
- proxy            → Proxy  
- bridge           → Bridge  
- flyweight        → Flyweight  
- inspector        → AOP tracing  
- config           → Configuration  

---

## 🧩 Design Patterns

### Composite
- Tree structure of widgets
- Recursive rendering
- Circular reference prevention

### Decorator
- Adds runtime features (border, shadow, logging)
- Immutable RenderResult

### Adapter
- Integrates incompatible APIs
- Converts data formats dynamically

### Facade
- Simplified interface for complex subsystems
- Reduces API complexity

### Proxy
- Virtual Proxy (lazy loading)
- Access Control Proxy (role-based)
- Audit Proxy (logging)

### Bridge
- Separates abstraction and implementation
- Supports multiple renderers (JSON, HTML, SVG)

### Flyweight
- Memory optimization
- Shared intrinsic state
- Factory-based reuse

---

## 🔗 API Endpoints

### Dashboard (Composite)
- GET /api/dashboard/tree  
- POST /api/dashboard/container  
- POST /api/dashboard/widget  
- PUT /api/dashboard/{containerId}/add/{childId}  
- DELETE /api/dashboard/node/{id}  
- POST /api/dashboard/render-all  

### Decorator
- GET /api/widget/{id}/decorators  
- POST /api/widget/{id}/decorators  
- DELETE /api/widget/{id}/decorators/{type}  
- PUT /api/widget/{id}/decorators/reorder  

### Adapter
- POST /api/widget/chart  
- GET /api/widget/{id}/adapter-trace  

### Facade
- POST /api/facade/create-dashboard  
- GET /api/facade/call-log  

### Proxy
- POST /api/widget/{id}/load  
- GET /api/widget/{id}/proxy-state  
- PUT /api/session/role  
- GET /api/audit-log  

### Bridge
- PUT /api/dashboard/renderer  
- GET /api/bridge/class-count  

### Flyweight
- POST /api/flyweight/generate  
- GET /api/flyweight/pool  
- GET /api/flyweight/memory-estimate  

---

## ⚡ Real-Time Features

- Live pattern execution tracing  
- WebSocket streaming (/topic/call-chain)  
- AOP-based method interception  

---

## 📡 WebSocket

- Endpoint: /ws  
- Topic: /topic/call-chain  

---

## 📖 Swagger API Docs

http://localhost:8080/swagger-ui.html  

---

## 🐳 Docker Setup

### Build JAR
mvn clean package  

### Build Image
docker build -t patternforge .  

### Run Container
docker run -p 8080:8080 patternforge  

### Docker Compose
docker-compose up --build  

---

## ▶️ Run Application

mvn spring-boot:run  

Open: http://localhost:8080  

---

## 💡 Key Highlights

- All 7 structural design patterns implemented  
- Real-time visualization using WebSockets  
- AOP-based tracing  
- Clean architecture (SOLID principles)  
- Docker support  
- Swagger documentation  

---

## 🧪 Testing

Use Postman or Swagger UI to test APIs.

---

## 📈 Learning Outcomes

- Strong understanding of design patterns  
- Backend architecture skills  
- Spring Boot, AOP, WebSockets experience  
- Scalable system design  

---

## 🙌 Conclusion

PatternForge transforms design patterns into an interactive and practical learning experience.

---

## 👩‍💻 Author

Kallepalli Durga Bhavani  
B.Tech – Software Development  