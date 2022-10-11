import controller.Controller;
import repository.Repository;
import view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Controller controller = new Controller(repository);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.start();
    }
}