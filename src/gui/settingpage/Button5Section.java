package gui.settingpage;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class Button5Section extends Rectangle {

    public Button5Section() {

        setColor(Color.decode("#848484"));
        setPosition(230, 1040);
        setSize(450, 200);

        FormSection rectangleInner = new FormSection(230, 1040, 5);

        Rectangle rectangleText = new Rectangle();
        rectangleText.setColor(Color.decode("#cccccc"));
        rectangleText.setPosition(245, 1035);
        rectangleText.setSize(88, 20);

        Text text = new Text("BUTTON 5");
        text.setPosition(260, 1032);
        text.setColor(Color.decode("#848484"));
        text.setFontSize(15);
        text.setFontStyle(Font.BOLD);
        text.setFontFamily("Arial");

        add(rectangleInner, rectangleText, text);

    }
}
