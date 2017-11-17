package factoryControl;

/**
 * Created by Eynar on 11/16/2017.
 */
public class FactoryControl<T>{

    private Class<T> control;

    /**
     * Factory Control Template
     * @param control
     */
    public FactoryControl(Class<T> control)
    {
        this.control = control;
    }

    /**
     * Thia method is to create a Control
     * @return
     */
    public T makeControl() {
        try {
            return control.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
