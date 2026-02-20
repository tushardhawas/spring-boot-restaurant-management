# Restaurant Order Management System

A Spring Boot REST API project built while learning Spring Boot fundamentals.

## 📚 What I Learned
- Spring Boot project setup
- REST Controllers (@RestController, @GetMapping, @PostMapping)
- Dependency Injection (Field, Constructor, Setter)
- Interface-based design with multiple implementations
- Service layer architecture
- Using @Qualifier for multiple bean implementations

## 🏗️ Project Structure
```
com.Restaurant.Management
├── controller/      # REST API endpoints
├── service/         # Business logic layer
├── payment/         # Payment strategies (Cash, Card, UPI)
└── model/           # Data models (Order)
```

## 🚀 Features
- Create orders (POST /orders)
- View order by ID (GET /orders/{id})
- View all orders (GET /orders)
- Process payment (POST /orders/{id}/pay)
- Multiple payment methods (Cash, Card, UPI)

## 🧪 How to Run
1. Clone the repository
2. Open in IntelliJ IDEA / Eclipse
3. Run the main application class
4. Access API at `http://localhost:8080/orders`

## 📝 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/orders?dishName=Biryani&amount=250` | Create new order |
| GET | `/orders/{id}` | Get order by ID |
| GET | `/orders` | Get all orders |
| POST | `/orders/{id}/pay` | Process payment for order |

## 🛠️ Technologies
- Java 17
- Spring Boot 3.x
- Maven

## 📖 Learning Journey
This project is part of my Spring Boot learning path. I'm documenting my progress as I learn backend development.

**Current Progress:** Videos 1-6 completed
- ✅ Spring Boot basics
- ✅ REST Controllers
- ✅ Dependency Injection
- ⏳ JPA & Database (coming next)
