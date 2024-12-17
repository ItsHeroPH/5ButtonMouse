package mouse;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;
import configuration.Config;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;

public class Mouse implements NativeMouseListener {

    private final Robot robot;
    private int lastButton = -1;
    private int pressCount = 0;
    private Instant lastPressTime = Instant.now();
    private static final int TIMEOUT = 1;

    public static void init() {

        try {

            GlobalScreen.registerNativeHook();
            GlobalScreen.addNativeMouseListener(new Mouse());

        } catch (Exception ignored) {}

    }

    public Mouse() throws AWTException {

        this.robot = new Robot();

    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {

        if(!Config.isActive()) return;

        int button = e.getButton();

        if(button > 5) return; // If the button key code is greater than five

        Instant currentTime = Instant.now();
        Duration duration = Duration.between(lastPressTime, currentTime);

        if (button == lastButton && duration.getSeconds() < TIMEOUT) {

            pressCount = (pressCount + 1) % 9;

        } else {

            pressCount = 0;

        }

        lastButton = button;
        lastPressTime = currentTime;

        String currentChar = Config.getButton(button).getKey(pressCount);
        typeCharacter(currentChar);
        System.out.println("Typed: " + currentChar);

    }

    private void typeCharacter(String character) {

        for (char c : character.toCharArray()) {

            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (keyCode != KeyEvent.VK_UNDEFINED) {

                robot.keyPress(keyCode);
                robot.keyRelease(keyCode);

            }

        }

    }

}
