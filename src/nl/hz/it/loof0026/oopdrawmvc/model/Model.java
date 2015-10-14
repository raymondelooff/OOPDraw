package nl.hz.it.loof0026.oopdrawmvc.model;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by raymondelooff on 14-10-15.
 */
public class Model extends Observable {

    /**
     * This method adds an observer to the list of observers
     * @param observer
     */
    public void attach(Observer observer) {
        this.addObserver(observer);
    }

}
