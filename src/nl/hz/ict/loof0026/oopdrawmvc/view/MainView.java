package nl.hz.ict.loof0026.oopdrawmvc.view;

import nl.hz.ict.loof0026.oopdrawmvc.controller.Controller;
import nl.hz.ict.loof0026.oopdrawmvc.controller.MainController;

import java.util.Observable;

/**
 * Created by raymondelooff on 14-10-15.
 */
public class MainView extends View {

    /**
     * This method instantiates the controller of the view
     */
    @Override
    public Controller makeController() {
        MainController controller = new MainController();
        super.controller = controller;
        return controller;
    }

    @Override
    public void update(Observable o, Object arg) {
        super.update(o, arg);

        System.out.println("Update view called");
    }

}
