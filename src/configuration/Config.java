package configuration;

public class Config {

    private static Config config;
    private final ConfigButton[] buttons = new ConfigButton[5];

    public static void loadConfig() {

        config = new Config();

    }

    public static ConfigButton getButton(int button) {

        return config.buttons[button - 1];

    }

    public Config() {

        this.buttons[0] = new ConfigButton("A", "B", "C", "D", "E", "1", "2", "", "");
        this.buttons[1] = new ConfigButton("F", "G", "H", "I", "J", "3", "4", "", "");
        this.buttons[2] = new ConfigButton("K", "L", "M", "N", "O", "5", "6", "", "");
        this.buttons[3] = new ConfigButton("P", "Q", "R", "S", "T", "7", "8", "", "");
        this.buttons[4] = new ConfigButton("U", "V", "W", "X", "Y", "Z", "9", "0", "");

    }

}
