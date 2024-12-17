package gui;

import core.gui.components.ScrollablePanel;
import core.gui.components.Text;
import core.gui.shapes.Rectangle;
import gui.settingpage.*;

import java.awt.*;

public class SettingsPage extends ScrollablePanel {

    public SettingsPage() {

        setPosition(200, 30);
        setSize(520, 1300);
        setColor(Color.decode("#cccccc"));

        add(
                new SettingSection(),
                new Button1Section(),
                new Button2Section(),
                new Button3Section(),
                new Button4Section(),
                new Button5Section()
        );

    }
}
