package gui;

import core.gui.Component;

public class SideNavigationBar extends Component {

    public SideNavigationBar() {

        super.setSize(250, 480)
                .setPosition(0, 0)
                .setColor("#dddddd");

    }

    /**
     * Leaved it black because we do not do any action when it clicked
     */
    @Override
    public void onClick() {}

    /**
     * Leaved it black because we do not do any action when it hovered
     */
    @Override
    public void onHovered() {}
}
