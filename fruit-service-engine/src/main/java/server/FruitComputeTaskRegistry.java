package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;

import model.FruitPrice;
import server.interfaces.Compute;
import server.interfaces.Task;

public class FruitComputeTaskRegistry {

    private FruitComputeEngine fruitComputeEngine;
    private Compute computeEngine;

    public FruitComputeTaskRegistry() {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            fruitComputeEngine = (FruitComputeEngine) registry.lookup("FruitComputeEngine");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FruitComputeTaskRegistry(Compute computeEngine) {
        this.computeEngine = computeEngine;
    }

    public void executeTask(Task task) {
        try {
            fruitComputeEngine.executeTask(task);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public <T> T runTask(Task<T> task) {
        try {
            if (computeEngine != null) {
                return computeEngine.executeTask(task);
            } else if (fruitComputeEngine != null) {
                return fruitComputeEngine.executeTask(task);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addFruitPrice(FruitPrice fruitPrice) {
        try {
            if (computeEngine != null) {
                computeEngine.addFruitPrice(fruitPrice.getFruitName(), fruitPrice.getPrice());
            } else if (fruitComputeEngine != null) {
                fruitComputeEngine.addFruitPrice(fruitPrice.getFruitName(), fruitPrice.getPrice());
            }
            System.out.println("Successfully added fruit price: " + fruitPrice.getFruitName() + " - $" + fruitPrice.getPrice());
        } catch (RemoteException e) {
            System.err.println("Error adding fruit price: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateFruitPrice(FruitPrice fruitPrice) {
        try {
            if (computeEngine != null) {
                computeEngine.updateFruitPrice(fruitPrice.getFruitName(), fruitPrice.getPrice());
            } else if (fruitComputeEngine != null) {
                fruitComputeEngine.updateFruitPrice(fruitPrice.getFruitName(), fruitPrice.getPrice());
            }
            System.out.println("Successfully updated fruit price: " + fruitPrice.getFruitName() + " - $" + fruitPrice.getPrice());
        } catch (RemoteException e) {
            System.err.println("Error updating fruit price: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void deleteFruitPrice(String fruitName) {
        try {
            if (computeEngine != null) {
                computeEngine.deleteFruitPrice(fruitName);
            } else if (fruitComputeEngine != null) {
                fruitComputeEngine.deleteFruitPrice(fruitName);
            }
            System.out.println("Successfully deleted fruit price for: " + fruitName);
        } catch (RemoteException e) {
            System.err.println("Error deleting fruit price: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void calculateFruitCost(String fruitName, int quantity) {
        try {
            double totalCost = 0.0;
            if (computeEngine != null) {
                totalCost = computeEngine.calculateFruitCost(fruitName, quantity);
            } else if (fruitComputeEngine != null) {
                totalCost = fruitComputeEngine.calculateFruitCost(fruitName, quantity);
            }
            System.out.println("Total cost for " + quantity + " " + fruitName + "(s): $" + totalCost);
        } catch (RemoteException e) {
            System.err.println("Error calculating fruit cost: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void printReceipt(String cashierName, double amountGiven) {
        try {
            // For demonstration, using a placeholder total cost
            double totalCost = 0.0; // This should be calculated from the shopping cart
            String receipt = "";
            if (computeEngine != null) {
                receipt = computeEngine.generateReceipt(cashierName, totalCost, amountGiven);
            } else if (fruitComputeEngine != null) {
                receipt = fruitComputeEngine.generateReceipt(cashierName, totalCost, amountGiven);
            }
            System.out.println("Receipt generated:\n" + receipt);
        } catch (RemoteException e) {
            System.err.println("Error generating receipt: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Map<String, Object> getFruitPrices() {
        Map<String, Object> fruitPrices = new HashMap<>();
        // Logic to retrieve fruit prices from the fruitComputeEngine can be added here
        return fruitPrices;
    }
}