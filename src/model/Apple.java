package model;

public class Apple implements  Entity{
    int weight = 0;

    public Apple(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString()
    {
        return "Apple, weight: " + this.weight;
    }
}
