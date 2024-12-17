package gui.homepage;

import configuration.Config;
import core.gui.components.Switch;

import java.awt.*;

public class AutoStartSwitch extends Switch {

    public AutoStartSwitch() {

        setPosition(230, 175);
        setSize(50, 20);
        setSwitchHeadColor(Color.decode("#848484"));
        setActive(Config.isAutoStart());

    }

    @Override
    public void onActivated() {

        setColor(Color.decode("#029210"));
        Config.setAutoStart(true);

    }

    @Override
    public void onDeactivated() {

        setColor(Color.decode("#8b0000"));
        Config.setAutoStart(false);

    }
}
