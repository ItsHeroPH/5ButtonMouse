package core.gui.components;

import core.gui.Component;
import core.gui.shapes.Rectangle;
import core.util.Window;

import java.awt.*;

public class ScrollablePanel extends Rectangle {

    @Override
    public void update() {

        super.update();
        Window.getMouse().setScrollOffsetMax((getHeight() - Window.getFrame().getHeight()) + 30);

    }

    @Override
    public void onRepaint(Graphics2D graphics2D) {

        super.onRepaint(graphics2D);

        if(graphics2D.getTransform().getTranslateY() - Window.getMouse().getScrollOffset() > 0) return;


        for (Component child : getChildren()) {

            graphics2D.translate(0, -Window.getMouse().getScrollOffset());
            child.onRepaint(graphics2D);
            graphics2D.translate(0, Window.getMouse().getScrollOffset());

        }

    }
}
