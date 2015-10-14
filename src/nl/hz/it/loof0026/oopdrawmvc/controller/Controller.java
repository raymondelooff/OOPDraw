package nl.hz.it.loof0026.oopdrawmvc.controller;

import nl.hz.it.loof0026.oopdrawmvc.view.View;
import nl.hz.it.loof0026.oopdrawmvc.model.Model;

import java.util.Observable;
import java.util.Observer;

/**
 * This method describes an abstract controller
 */
public abstract class Controller implements Observer {

    protected Model model;
    protected View view;

    /**
     * This method initializes the controller with the given model and view
     * @param model
     * @param view
     */
    public void initialize(Model model, View view) {
        this.model = model;
        this.view = view;

        // Attach controller to the model
        model.attach(this);
    }

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
