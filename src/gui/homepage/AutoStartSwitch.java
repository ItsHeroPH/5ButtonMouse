package gui.homepage;

import core.gui.components.Switch;

import java.awt.*;

public class AutoStartSwitch extends Switch {

    public AutoStartSwitch() {

        setPosition(30, 145);
        setSize(50, 20);
        setSwitchHeadColor(Color.decode("#848484"));
        setActive(false);

    }

    @Override
    public void onActivated() {

        setColor(Color.decode("#029210"));

    }

    @Override
    public void onDeactivated() {

        setColor(Color.decode("#8b0000"));

    }
}
