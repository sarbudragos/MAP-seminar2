package view;

import controller.Controller;
import model.Entity;

import java.util.Arrays;

public class ConsoleView {
    Controller controller;

    public ConsoleView(Controller controller)
    {
        this.controller = controller;
    }

    public void start()
    {
        for(Entity entity : controller.getAllEntitiesHeavierThanGivenValue(200))
        {
            if(entity != null)
                System.out.println(entity.toString());
        }
    }
}
