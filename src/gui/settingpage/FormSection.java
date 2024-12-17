package gui.settingpage;

import configuration.Config;
import configuration.ConfigButton;
import core.gui.shapes.Rectangle;

import java.awt.*;

public class FormSection extends Rectangle {

    public FormSection(int x, int y, int button) {

        setColor(Color.decode("#cccccc"));
        setPosition(x + 5, y + 5);
        setSize(440, 190);

        ConfigButton config = Config.getButton(button);
        Form form1 = new Form(this.getX(), this.getY() + 20, "1st Click:", config.getKey(1));
        Form form2 = new Form(this.getX() + 140, this.getY() + 20, "2nd Click:", config.getKey(2));
        Form form3 = new Form(this.getX() + 280, this.getY() + 20, "3rd Click:", config.getKey(3));
        Form form4 = new Form(this.getX(), this.getY() + 70, "4th Click:", config.getKey(4));
        Form form5 = new Form(this.getX() + 140, this.getY() + 70, "5th Click:", config.getKey(5));
        Form form6 = new Form(this.getX() + 280, this.getY() + 70, "6th Click:", config.getKey(6));
        Form form7 = new Form(this.getX(), this.getY() + 120, "7th Click:", config.getKey(7));
        Form form8 = new Form(this.getX() + 140, this.getY() + 120, "8th Click:", config.getKey(8));
        Form form9 = new Form(this.getX() + 280, this.getY() + 120, "9th Click:", config.getKey(9));

        add(form1, form2, form3, form4, form5, form6, form7, form8, form9);

    }
}
