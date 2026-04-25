📘 PatternForge – Interactive Structural Design Pattern Playground
🚀 Overview

PatternForge is a full-stack Java Spring Boot application designed to visualize, interact, and understand structural design patterns in real-time.

Unlike traditional theoretical learning, this project makes patterns visible and interactive through:

REST APIs
WebSockets (live tracing)
Dynamic UI rendering

It demonstrates how patterns behave internally and how they are used in real-world systems.

🎯 Objective

To build an interactive playground that implements and visualizes the following structural design patterns:

Composite
Decorator
Adapter
Facade
Proxy
Bridge
Flyweight
🏗️ Architecture
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
🛠️ Tech Stack
Category	Technology
Backend	Java 17, Spring Boot 3
API	REST, WebSocket (STOMP)
Build Tool	Maven
Frontend	Thymeleaf / React
Documentation	Swagger (OpenAPI)
Containerization	Docker
AOP	Spring AOP
📂 Project Structure
src/main/java/com/patternforge
│
├── controller       → REST APIs
├── service          → Business logic
├── model            → Core domain objects
├── patterns         → Composite pattern
├── decorator        → Decorator pattern
├── adapter          → Adapter pattern
├── facade           → Facade pattern
├── proxy            → Proxy pattern
├── bridge           → Bridge pattern
├── flyweight        → Flyweight pattern
├── inspector        → AOP tracing
├── config           → WebSocket & app config
🧩 Design Patterns Implemented
1️⃣ Composite Pattern – Dashboard Tree
Builds a tree structure of widgets and containers
Supports recursive rendering
Prevents circular references
2️⃣ Decorator Pattern – Dynamic Features
Adds features like:
Borders
Shadows
Logging
Uses immutable RenderResult
3️⃣ Adapter Pattern – API Integration
Integrates incompatible systems:
LegacyGraphLib
OldChartLib
Converts data formats dynamically
4️⃣ Facade Pattern – Simplified Interface
Provides single entry point:
createDashboard()
applyTheme()
Hides subsystem complexity
5️⃣ Proxy Pattern – Controlled Access
Virtual Proxy → Lazy loading
Access Proxy → Role-based access
Audit Proxy → Logs activity
6️⃣ Bridge Pattern – Flexible Rendering
Separates abstraction and implementation
Supports:
JSON Renderer
HTML Renderer
SVG Renderer
7️⃣ Flyweight Pattern – Memory Optimization
Shares common data between widgets
Reduces memory usage significantly
Uses factory pattern for object reuse
🔗 API Endpoints
📌 Dashboard (Composite)
GET /api/dashboard/tree
POST /api/dashboard/container
POST /api/dashboard/widget
PUT /api/dashboard/{containerId}/add/{childId}
DELETE /api/dashboard/node/{id}
POST /api/dashboard/render-all
🎨 Decorator
GET /api/widget/{id}/decorators
POST /api/widget/{id}/decorators
DELETE /api/widget/{id}/decorators/{type}
PUT /api/widget/{id}/decorators/reorder
🔄 Adapter
POST /api/widget/chart
GET /api/widget/{id}/adapter-trace
🧱 Facade
POST /api/facade/create-dashboard
GET /api/facade/call-log
🔐 Proxy
POST /api/widget/{id}/load
GET /api/widget/{id}/proxy-state
PUT /api/session/role
GET /api/audit-log
🔀 Bridge
PUT /api/dashboard/renderer
GET /api/bridge/class-count
♻️ Flyweight
POST /api/flyweight/generate
GET /api/flyweight/pool
GET /api/flyweight/memory-estimate
⚡ Real-Time Features
🔴 Live pattern execution tracing
🔴 WebSocket streaming (/topic/call-chain)
🔴 AOP-based method interception
📡 WebSocket Configuration
Endpoint: /ws
Topic: /topic/call-chain
Protocol: STOMP
📖 Swagger API Docs

Access API documentation at:

http://localhost:8080/swagger-ui.html
🐳 Docker Setup
🔧 Build JAR
mvn clean package
🐳 Run with Docker
docker build -t patternforge .
docker run -p 8080:8080 patternforge
🐳 Run with Docker Compose
docker-compose up --build
▶️ Running the Application
mvn spring-boot:run

Open:

http://localhost:8080
💡 Key Highlights

✅ All 7 structural patterns implemented
✅ Real-time visualization using WebSockets
✅ AOP-based tracing (no code pollution)
✅ Clean architecture (SOLID principles)
✅ Dockerized deployment
✅ Swagger API documentation

🧪 Testing

Use:

Postman
Swagger UI

Test all endpoints and pattern behaviors.

📈 Learning Outcomes
Deep understanding of structural design patterns
Real-world backend architecture skills
Hands-on with Spring Boot, AOP, WebSockets
Experience with scalable and maintainable systems
🙌 Conclusion

PatternForge transforms design patterns from theory into experience by making them:

Interactive
Observable
Practical

This project demonstrates strong backend engineering skills and system design knowledge.