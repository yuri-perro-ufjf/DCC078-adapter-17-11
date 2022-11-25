import java.util.ArrayList;
import java.util.List;

public class KeysKeyboard implements Keys {
    private List<String> keys = new ArrayList<String>();

    @Override
    public List<String> getKeys() {
        return keys;
    }

    public void setKey(String key) {
        this.keys.add(key);
    }
}
