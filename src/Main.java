import core.page.PageManager;
import core.util.Window;
import gui.HomePage;
import gui.SideNavigationBar;

public class Main {

    public static void main(String[] args) {

        Window.create()
                .setTitle("5 Button Mouse")
                .setSize(720, 480)
                .setResizable(false)
                .run();

        Window.getPanel().add(new SideNavigationBar());
        PageManager.setCurrentPage(new HomePage());

    }

}