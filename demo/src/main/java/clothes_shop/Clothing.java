package clothes_shop;

public class Clothing {

    private String typeOfClothing;
    private String size;
    private double cost;
    private int amount;
  
    public Clothing() {
        this.typeOfClothing = null;
        this.size = null;
        this.cost = 0;
        this.amount = 0;
    }
  
    public Clothing(String typeOfClothing, String size, double cost, int amount) {
        this.typeOfClothing = typeOfClothing;
        this.size = size;
        this.cost = cost;
        this.amount = amount;
    }
  
    public String getTypeOfClothing() {
        return typeOfClothing;
    }
  
    public void setTypeOfClothing(String typeOfClothing) {
        this.typeOfClothing = typeOfClothing;
    }
  
    public String getSize() {
        return size;
    }
  
    public void setSize(String size) {
        this.size = size;
    }
  
    public double getCost() {
        return cost;
    }
  
    public void setCost(double cost) {
        this.cost = cost;
    }
  
    public int getAmount() {
        return amount;
    }
  
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setData(String typeOfClothing, String size, double cost, int amount) {
    this.typeOfClothing = typeOfClothing;
    this.size = size;
    this.cost = cost;
    this.amount = amount;
    }
  
    @Override
    public String toString() {
        return "Type: " + typeOfClothing + ", Size: " + size + ", Cost: " + cost + "$, Amount: " + amount;
    }
    
  }
  