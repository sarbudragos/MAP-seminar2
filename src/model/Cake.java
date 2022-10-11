package model;

public class Cake implements Entity{
    int weight = 0;

    public Cake(int weight)
    {
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
        return "Cake, weight: " + this.weight;
    }
}
