package server.tasks;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import model.FruitPrice;
import server.FruitComputeEngine;
import server.interfaces.Task;

public class AddFruitPrice implements Task<String> {
    private FruitPrice fruitPrice;

    public AddFruitPrice(FruitPrice fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    @Override
    public String execute() throws RemoteException {
        try {
            // Get the engine instance and add the fruit price to its storage
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            FruitComputeEngine engine = (FruitComputeEngine) registry.lookup("FruitComputeEngine");
            engine.addFruitPrice(fruitPrice.getFruitName(), fruitPrice.getPrice());
            
            System.out.println("Adding fruit price: " + fruitPrice.getFruitName() + " - $" + fruitPrice.getPrice());
            return "Fruit price added successfully for " + fruitPrice.getFruitName() + " - $" + fruitPrice.getPrice();
        } catch (Exception e) {
            throw new RemoteException("Failed to add fruit price", e);
        }
    }
}