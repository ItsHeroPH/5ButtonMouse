package gui;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class SupportPage extends Rectangle {

    public SupportPage() {

        setPosition(200, 30);
        setSize(520, 450);
        setColor(Color.decode("#cccccc"));

        Text header = new Text("Unavailable :(");
        header.setColor(Color.decode("#8b0000"));
        header.setPosition(230, 150);
        header.setFontSize(50);
        header.setFontFamily("Arial");
        header.setFontStyle(Font.BOLD);

        Text paragraph = new Text("Sorry this page is still under development.\nFeel free to come back later");
        paragraph.setColor(Color.decode("#4b4949"));
        paragraph.setPosition(230, 140);
        paragraph.setFontSize(16);
        paragraph.setFontFamily("Arial");
        paragraph.setFontStyle(Font.BOLD);

        add(header, paragraph);

    }
}
