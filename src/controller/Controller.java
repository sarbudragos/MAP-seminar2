package controller;

import model.Entity;
import repository.Repository;

public class Controller {
    private Repository repository;

    public Controller(Repository repository)
    {
        this.repository = repository;
    }

    public Entity[] getAllEntitiesHeavierThanGivenValue(int value)
    {
        Entity[] entities = this.repository.getAllEntities();
        Entity[] filteredEntities = new Entity[repository.getLength()];
        int filteredEntitiesLength = 0;

        for (int i=0; i<repository.getLength(); i++)
        {
            if(entities[i].getWeight() > value)
            {
                filteredEntities[filteredEntitiesLength] = entities[i];
                filteredEntitiesLength++;
            }
        }
        return filteredEntities;
    }
}
