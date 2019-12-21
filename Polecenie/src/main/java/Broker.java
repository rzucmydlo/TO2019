
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Control> controlList = new ArrayList<Control>();

    public void takeControl(Control control){
        controlList.add(control);
    }

    public void placeControls(){

        for (Control control : controlList) {
            control.execute();
        }
        controlList.clear();
    }
}
