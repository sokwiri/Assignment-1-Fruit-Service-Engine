# Name: Stephen Okwiri | # Admission No: 224160

# Fruit Service Engine

## Introduction
This is my submission for the Distributed Systems assignment 1 Fruit-Service-Engine. It as a simple distributed application where clients can manage fruit prices on a server. 
The main idea is to let users(clients) add, update, delete, and calculate fruit prices, and also get receipts for their transactions. 

## How my project is organized 

Here is an overview of how my project is structured:

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

## References

1. Oracle. (n.d.). [Java™ Remote Method Invocation (RMI)](https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/index.html). Oracle Documentation.
2. Coulouris, G., Dollimore, J., Kindberg, T., & Blair, G. (2011). Distributed Systems: Concepts and Design (5th Edition). Addison-Wesley.
3. Apache Maven Project. (n.d.). [Maven: The Complete Reference](https://maven.apache.org/guides/index.html).
4. Oracle. (n.d.). [Java SE Documentation](https://docs.oracle.com/javase/8/docs/).
5. Google. (n.d.). Gson User Guide. Retrieved from https://github.com/google/gson   
6. GitHub Copilot. (n.d.). Context-aware code suggestions. GitHub.
7. ChatGPT. (2025). Assisted code generation and project guidance. OpenAI.
