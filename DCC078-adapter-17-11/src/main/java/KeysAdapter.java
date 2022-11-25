public class KeysAdapter extends KeysKeyboard {

    private Keys joystickKeys;

    public KeysAdapter(Keys joystickKeys){
        this.joystickKeys = joystickKeys;
    }

    public String getMappedKeys(){
        String output = "KEYS: ";
        for(String key: this.getKeys()){
            if(key.equals("W")){
                output += "- UP";
            } else if (key.equals("A")){
                output += "- LEFT";
            }else if (key.equals("D")){
                output += "- RIGHT";
            } else {
                output += "- DOWN";
            }
        }
        return output;
    }


    public void mapKeys(){
        for(String key: this.joystickKeys.getKeys()){
            if(key.equals("UP")){
                this.setKey("W");
            } else if (key.equals("LEFT")){
                this.setKey("A");
            }else if (key.equals("RIGHT")){
                this.setKey("D");
            } else {
                this.setKey("S");
            }
        }
    }
}
