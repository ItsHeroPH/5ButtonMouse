package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class Form extends Rectangle {

    public Form(int x, int y, String title, String value) {

        setColor(Color.decode("#dddddd"));
        setPosition(x + 90, y + 13);
        setSize(30, 25);
        setRound(10);

        Text textValue = new Text(value);
        textValue.setColor(Color.decode("#494949"));
        textValue.setFontSize(16);
        textValue.setFontFamily("Arial");
        textValue.setFontStyle(Font.BOLD);
        textValue.setPosition(x + 108, y + 13);

        Text formText = new Text(title);
        formText.setPosition(x + 20, y + 17);
        formText.setColor(Color.decode("#848484"));
        formText.setFontSize(18);
        formText.setFontFamily("Arial");
        formText.setFontStyle(Font.TRUETYPE_FONT);

        add(textValue, formText);

    }
}
