package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class Button1 extends Rectangle {

    public Button1() {

        setColor(Color.decode("#848484"));
        setPosition(230, 80);
        setSize(450, 200);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor(Color.decode("#cccccc"));
        rectangle.setPosition(235, 85);
        rectangle.setSize(440, 190);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setColor(Color.decode("#cccccc"));
        rectangle2.setPosition(245, 75);
        rectangle2.setSize(88, 20);

        Text text = new Text("BUTTON 1");
        text.setPosition(260, 72);
        text.setColor(Color.decode("#848484"));
        text.setFontSize(15);
        text.setFontStyle(Font.BOLD);
        text.setFontFamily("Arial");

        add(rectangle, rectangle2, text);

    }
}
