public class Input {
    Keys keys;
    KeysAdapter keysAdapter;

    public Input(){
        keys = new KeysJoystick();
        keysAdapter = new KeysAdapter(keys);
    }

    public void setKey(String key){
        keys.setKey(key);
        keysAdapter.mapKeys();
    }

    public String getKeys(){
       return  keysAdapter.getMappedKeys();
    }

    public String getKeysKeyboard(){
        String output = "KEYBOARD:";
        for(String key: keysAdapter.getKeys()){
            output = output +  " - " + key;
        }
        return output;
    }
}
