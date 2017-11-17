package factoryControl.seleniumControl;

import factoryControl.Control;

/**
 * Created by Eynar on 11/16/2017.
 */
public class Label extends Control {

    public String getTextValue() {
        control=this.find();
        return this.control.getText();
    }
}
