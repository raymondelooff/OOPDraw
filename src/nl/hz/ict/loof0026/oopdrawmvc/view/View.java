package nl.hz.ict.loof0026.oopdrawmvc.view;

import nl.hz.ict.loof0026.oopdrawmvc.controller.Controller;
import nl.hz.ict.loof0026.oopdrawmvc.model.Model;

import java.util.Observable;
import java.util.Observer;

/**
 * This class is an abstract view
 */
public abstract class View implements Observer {

    protected Model model;
    protected Controller controller;

    /**
     * This method initializes the view with the given model
     * @param model The data to show in the view
     */
    public void initialize(Model model) {
        this.model = model;

        // Attach view to the model
        model.attach(this);

        // Make controller
        Controller viewController = this.makeController();
        this.controller = viewController;

        // Initialize controller
        viewController.initialize(model, this);
    }

    /**
     * This method instantiates the controller of the view
     */
    public abstract Controller makeController();

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {

    }

}
