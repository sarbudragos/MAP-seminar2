package repository;

import model.Apple;
import model.Book;
import model.Cake;
import model.Entity;

public class Repository {
    private Entity[] elems;
    private int length;

    public void add(Entity entity)
    {
        elems[length] = entity;
        length++;
    }

    public Repository()
    {
        elems = new Entity[100];
        length = 0;
        this.add(new Book(150));
        this.add(new Cake(230));
        this.add(new Apple(50));
        this.add(new Cake(300));
    }

    public Entity[] getAllEntities()
    {
        return elems;
    }
    public int getLength()
    {
        return length;
    }
}
