package buttons;

/**
 * All products families have the same varieties (macOS/Windows).
 *
 * This is a macOS variant of a button.
 */

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created macOSButton.");
    }
}
