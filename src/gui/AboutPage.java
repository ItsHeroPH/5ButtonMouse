package gui;

import core.gui.components.Text;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class AboutPage extends Rectangle {

    public AboutPage() {

        setPosition(200, 30);
        setSize(520, 450);
        setColor(Color.decode("#cccccc"));

        Text header = new Text("About");
        header.setPosition(230, 100);
        header.setColor(Color.decode("#4b4949"));
        header.setFontStyle(Font.BOLD);
        header.setFontFamily("Arial");
        header.setFontSize(40);

        Text paragraph = new Text(
                """
                        This program based on java using the swing package. This is
                        programmed by the various of developers for their school project.
                        The goal of this program is to help blind people to be able to type
                        a text using only the 5 buttons in the mouse.
                        """
        );
        paragraph.setColor(Color.decode("#000000"));
        paragraph.setPosition(230, 140);
        paragraph.setFontFamily("Arial");
        paragraph.setFontSize(14);
        paragraph.setFontStyle(Font.TRUETYPE_FONT);



        add(header, paragraph);

    }

}
