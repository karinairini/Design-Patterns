package factories;

import buttons.Button;
import checkboxes.Checkbox;

/**
 * Abstract Factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
