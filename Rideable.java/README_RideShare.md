# 🚗 RideShare Application (Java)

## 📌 Project Overview
The RideShare Application is a Java console-based program designed to demonstrate the use of **interfaces** and **packages** in Java.
It simulates a basic ride-booking system where users can choose between a **Car Ride** or a **Bike Ride**, and the total fare is calculated based on distance.

---

## 🎯 Objective
- To implement Java interfaces
- To demonstrate abstraction and polymorphism
- To organize code using packages
- To simulate a real-world ride booking system

---

## 🛠 Technologies Used
- Programming Language: Java
- Concepts: Interface, Abstraction, Polymorphism, Encapsulation
- Input Handling: Scanner Class
- IDE: Eclipse / IntelliJ IDEA / VS Code

---

## 📂 Project Structure
```
rideshare.service
 ├── Rideable.java
 ├── CarRide.java
 └── BikeRide.java

rideshare.main
 └── Main.java
```

---

## 🧩 Description of Components

### Rideable Interface
Defines common behavior for all ride types.
- bookRide(double distance)
- endRide()

### CarRide Class
- Implements Rideable interface
- Fare per kilometer: ₹15
- Calculates total fare for car rides

### BikeRide Class
- Implements Rideable interface
- Fare per kilometer: ₹8
- Provides economical ride option

### Main Class
- Takes user input for ride type and distance
- Uses polymorphism to execute ride operations
- Entry point of the program

---

## 🔑 Concepts Used
- Interface
- Polymorphism
- Abstraction
- Encapsulation
- Packages

---

## ▶ Sample Output
```
=== Welcome to RideShare ===
Choose your ride type:
1. Car Ride
2. Bike Ride
Enter your choice (1 or 2): 1
Enter distance (in km): 10
Car ride booked for 10.0 km.
Car ride completed. Total fare: ₹150.0
```

---

## 🏁 Conclusion
The RideShare Application demonstrates how Java interfaces and packages help in building modular,
scalable, and maintainable applications.
