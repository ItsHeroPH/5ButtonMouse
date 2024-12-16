package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class Button1 extends Rectangle {

    public Button1() {

        setColor(Color.decode("#848484"));
        setPosition(30, 50);
        setSize(450, 200);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor(Color.decode("#cccccc"));
        rectangle.setPosition(5, 5);
        rectangle.setSize(440, 190);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setColor(Color.decode("#cccccc"));
        rectangle2.setPosition(15, -5);
        rectangle2.setSize(88, 20);

        Text text = new Text("BUTTON 1");
        text.setPosition(30, -8);
        text.setColor(Color.decode("#848484"));
        text.setFontSize(15);
        text.setFontStyle(Font.BOLD);
        text.setFontFamily("Arial");

        add(rectangle, rectangle2, text);

    }
}
