package configuration;

public class Config {

    private static Config config;

    private final ConfigButton[] buttons = new ConfigButton[5];
    private boolean active;
    private boolean autoStart;

    public static void loadConfig() {

        config = new Config();

    }

    public static ConfigButton getButton(int button) {

        return config.buttons[button - 1];

    }

    public static boolean isActive() {

        return config.active;

    }

    public static void setActive(boolean active) {

        config.active = active;

    }

    public static boolean isAutoStart() {

        return config.autoStart;

    }

    public static void setAutoStart(boolean autoStart) {

        config.autoStart = autoStart;

    }

    public Config() {

        this.active = false;
        this.autoStart = true;
        this.buttons[0] = new ConfigButton("A", "B", "C", "D", "E", "1", "2", "", "");
        this.buttons[1] = new ConfigButton("F", "G", "H", "I", "J", "3", "4", "", "");
        this.buttons[2] = new ConfigButton("K", "L", "M", "N", "O", "5", "6", "", "");
        this.buttons[3] = new ConfigButton("P", "Q", "R", "S", "T", "7", "8", "", "");
        this.buttons[4] = new ConfigButton("U", "V", "W", "X", "Y", "Z", "9", "0", "");

    }

}
