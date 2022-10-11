package model;

public class Book implements Entity{
    int weight = 0;

    public Book(int weight)
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
        return "Book, weight: " + this.weight;
    }
}
