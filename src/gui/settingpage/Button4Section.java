package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class Button4Section extends Rectangle {

    public Button4Section() {

        setColor(Color.decode("#848484"));
        setPosition(230, 800);
        setSize(450, 200);

        FormSection rectangleInner = new FormSection(230, 800, 4);

        Rectangle rectangleText = new Rectangle();
        rectangleText.setColor(Color.decode("#cccccc"));
        rectangleText.setPosition(245, 795);
        rectangleText.setSize(88, 20);

        Text text = new Text("BUTTON 4");
        text.setPosition(260, 792);
        text.setColor(Color.decode("#848484"));
        text.setFontSize(15);
        text.setFontStyle(Font.BOLD);
        text.setFontFamily("Arial");

        add(rectangleInner, rectangleText, text);

    }
}
