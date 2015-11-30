import java.util.HashMap;
import java.util.Map;

/**
 * Created by dima on 26.11.15.
 */
public class Catalog {
    private String fullName;
    private String numberOfCar;

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public Map<String, String> addOwner() {
        Map<String, String> map = new HashMap<String, String>();
        checkInformation(fullName);
        if (checkInformation(fullName) == false) {
            return map;
        }
        map.put(fullName, numberOfCar);
        return map;
    }

    private boolean checkInformation(String fullName) {
        Check check = new Check();
        while (true) {
            check.checkFullName(this.fullName);
        }

    }
}
