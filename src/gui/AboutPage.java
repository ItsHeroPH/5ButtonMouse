package gui;

import core.gui.shapes.Rectangle;
import core.gui.text.Text;

import java.awt.*;

public class AboutPage extends Rectangle {

    public AboutPage() {

        super.setColor("#cccccc")
                .setPosition(200, 0)
                .setSize(520, 480)
                .add(
                        new Text()
                                .setPosition(this.getX() + 20, 60)
                                .setColor("#4b4949")
                                .setText("About")
                                .setFontFamily("Arial")
                                .setFontSize(40)
                                .setFontStyle(Font.BOLD),

                        new Text()
                                .setPosition(this.getX() + 15, 110)
                                .setColor("#000000")
                                .setFontFamily("Arial")
                                .setFontSize(14)
                                .setFontStyle(Font.LAYOUT_LEFT_TO_RIGHT)
                                .setText("This program based on java using the swing package. This is"),

                        new Text()
                                .setPosition(this.getX() + 15, 127)
                                .setColor("#000000")
                                .setFontFamily("Arial")
                                .setFontSize(14)
                                .setFontStyle(Font.LAYOUT_LEFT_TO_RIGHT)
                                .setText("programed by the various of developers for their school project."),

                        new Text()
                                .setPosition(this.getX() + 15, 144)
                                .setColor("#000000")
                                .setFontFamily("Arial")
                                .setFontSize(14)
                                .setFontStyle(Font.LAYOUT_LEFT_TO_RIGHT)
                                .setText("The goal of this program is to help blind people to be able to type"),

                        new Text()
                                .setPosition(this.getX() + 15, 161)
                                .setColor("#000000")
                                .setFontFamily("Arial")
                                .setFontSize(14)
                                .setFontStyle(Font.LAYOUT_LEFT_TO_RIGHT)
                                .setText("using only the 5 button in the mouse.")
                );

    }
}
