package configuration;

public class ConfigButton {

    private final String[] keys = new String[9];

    public ConfigButton(String click1, String click2, String click3, String click4, String click5, String click6, String click7, String click8, String click9) {

        this.keys[0] = click1;
        this.keys[1] = click2;
        this.keys[2] = click3;
        this.keys[3] = click4;
        this.keys[4] = click5;
        this.keys[5] = click6;
        this.keys[6] = click7;
        this.keys[7] = click8;
        this.keys[8] = click9;

    }

    public String getKey(int click) {

        return keys[click - 1];

    }

    public int size() {

        return keys.length;

    }
}
