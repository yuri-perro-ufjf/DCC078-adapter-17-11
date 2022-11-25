import java.util.ArrayList;
import java.util.List;

public class KeysJoystick implements Keys{

    private List<String> keys = new ArrayList<String>();

    @Override
    public List<String> getKeys() {
        return this.keys;
    }

    @Override
    public void setKey(String key) {
        this.keys.add(key);
    }
}
