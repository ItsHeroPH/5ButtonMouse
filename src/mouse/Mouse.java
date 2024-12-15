package mouse;

public class Mouse {

    private static boolean active = false;

    public static boolean isActive() {

        return active;

    }

    public static void setActive(boolean active) {

        Mouse.active = active;

    }
}
