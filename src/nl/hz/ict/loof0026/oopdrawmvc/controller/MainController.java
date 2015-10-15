package nl.hz.ict.loof0026.oopdrawmvc.controller;

import java.util.Observable;

/**
 * Created by raymondelooff on 14-10-15.
 */
public class MainController extends Controller {

    @Override
    public void update(Observable o, Object arg) {
        super.update(o, arg);

        System.out.println("Update controller called");
    }

}
