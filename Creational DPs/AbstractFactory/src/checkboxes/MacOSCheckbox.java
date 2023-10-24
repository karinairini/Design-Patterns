package checkboxes;

/**
 * All products families have the same varieties (macOS/Windows).
 * This is a variant of a checkbox.
 */

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Tou have created macOSCheckbox.");
    }
}
