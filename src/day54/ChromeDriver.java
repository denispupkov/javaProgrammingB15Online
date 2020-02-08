package day54;

public class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("navigating to " + url + " using Chrome");
    }

    @Override
    public void maximize() {
        System.out.println("maximizing Chrome window");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome");
    }
}
