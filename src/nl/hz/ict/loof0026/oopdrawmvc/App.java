package nl.hz.ict.loof0026.oopdrawmvc;

import nl.hz.ict.loof0026.oopdrawmvc.model.Model;
import nl.hz.ict.loof0026.oopdrawmvc.view.MainView;
import nl.hz.ict.loof0026.oopdrawmvc.view.View;

/**
 * Created by raymondelooff on 14-10-15.
 */
public class App {
    
    private Model model;
    private View currentView;

    /**
     * This method initializes the application
     */
    public void initialize() {
        model = new Model();
        currentView = new MainView();

        // Initialize view
        currentView.initialize(model);

        // Start event processing
        startEventProcessing();
    }

    /**
     * This method starts the event processing
     */
    public void startEventProcessing() {
        System.out.println("Start event processing");
    }

    public static void main(String[] args) {
        App app = new App();
        app.initialize();
    }

}
