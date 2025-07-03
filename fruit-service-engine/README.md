# Fruit Service Engine

## Introduction
This is my submission for the Distributed Systems assignment 1. I built the Fruit Service Engine as a simple distributed application where clients can manage fruit prices on a server. The main idea is to let users add, update, delete, and calculate fruit prices, and also get receipts for their transactions. 

## How I have organized the Project 

Here is an overview of how I structured my project:

fruit-service-engine
├── src
│   ├── main
│   │   └── java
│   │       ├── server
│   │       │   ├── FruitComputeEngine.java
│   │       │   ├── FruitComputeTaskRegistry.java
│   │       │   ├── tasks
│   │       │   │   ├── AddFruitPrice.java
│   │       │   │   ├── UpdateFruitPrice.java
│   │       │   │   ├── DeleteFruitPrice.java
│   │       │   │   ├── CalFruitCost.java
│   │       │   │   └── CalculateCost.java
│   │       │   ├── interfaces
│   │       │   │   ├── Compute.java
│   │       │   │   └── Task.java
│   │       │   └── servlets
│   │       │       ├── AddFruitServlet.java
│   │       │       ├── UpdateFruitServlet.java
│   │       │       ├── DeleteFruitServlet.java
│   │       │       ├── CalculateCostServlet.java
│   │       │       └── ReceiptServlet.java
│   │       ├── client
│   │       │   └── FruitClient.java
│   │       └── model
│   │           ├── FruitPrice.java
│   │           └── Receipt.java
│   └── webapp
│       └── WEB-INF
│           └── web.xml
├── pom.xml
└── README.md
```

## How the Project Works

- Add Fruit Price: You can add new fruits and their prices to the system.
- Update Fruit Price: If a price changes, you can update it easily.
- Delete Fruit Price: Remove any fruit price entry you don’t need anymore.
- Calculate Fruit Cost: Enter a fruit and quantity to see the total cost.
- Generate Receipt: After a transaction, you’ll get a detailed receipt showing the costs, payment, change, and cashier info.

## Execution of the Project

1. Start RMI Registry: Run `rmiregistry 1099` to start the RMI registry.
2. Run the Server: Start the server by running the `FruitComputeEngine` class.
3. Run the Client: Start the client by running the `FruitClient` class.

The client application interacts with the server and all the main features (add, update, delete, calculate, and get receipts) are available through the client, and everything works over RMI.

