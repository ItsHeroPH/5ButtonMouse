package core.page;

import core.gui.Component;
import core.util.Window;

public class PageManager {

    private static Component currentPage;

    public static void setCurrentPage(Component page) {

        if(currentPage != null) {

            Window.getPanel().remove(currentPage);

        }

        Window.getMouse().resetScrollOffset();
        Window.getPanel().add(page);
        currentPage = page;

    }

    public static Component getCurrentPage() {

        return currentPage;

    }
}
