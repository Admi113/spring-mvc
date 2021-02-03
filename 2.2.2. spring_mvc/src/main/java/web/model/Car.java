package web.model;

public class Car {
    private String owner;
    private String model;
    private int cost;

    public Car(String owner, String model, int cost) {
        this.owner = owner;
        this.model = model;
        this.cost = cost;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner='" + owner + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
