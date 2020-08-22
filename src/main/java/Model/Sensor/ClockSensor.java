package Model.Sensor;
import Model.Sensor.Sensor;
import java.util.Date;

public class ClockSensor implements Sensor {

    @Override
    public Object getValue() {
        System.out.println("ClockSensor Called");
        Date date = new Date();
        return date.getHours();
    }
}
