package mouse;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;
import configuration.Config;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class Mouse implements NativeMouseListener {

    private final Robot robot;
    private int lastButton = -1;
    private int pressCount = 0;
    private Instant lastPressTime = Instant.now();
    private static final int TIMEOUT = 1;
    private Timer timer = new Timer();

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

        System.out.println("Button pressed " + button);

        if(button > 5) return; // If the button key code is greater than five

        Instant currentTime = Instant.now();
        Duration duration = Duration.between(lastPressTime, currentTime);

        if (button == lastButton && duration.getSeconds() < TIMEOUT) {

            pressCount = (pressCount + 1) % Config.getButton(button).size();

        } else {

            finalizeCharacter();

            pressCount = 0;

            lastButton = button;

        }

        lastPressTime = currentTime;

        resetTimer(button);

    }

    private void resetTimer(int button) {

        timer.cancel();
        timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                finalizeCharacter();
            }
        }, TIMEOUT * 1000);

    }

    private void finalizeCharacter() {

        if (lastButton != -1) {

            String currentChar = Config.getButton(lastButton).getKey(pressCount + 1);


            typeCharacter(currentChar);
            System.out.println("Typed: " + currentChar);


            lastButton = -1;
            pressCount = 0;

        }

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
