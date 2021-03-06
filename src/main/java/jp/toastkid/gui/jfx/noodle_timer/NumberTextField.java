package jp.toastkid.gui.jfx.noodle_timer;

import javafx.scene.control.TextField;

/**
 * 数値の入力だけを受け付ける TextField.
 * @author Toast kid
 * @see <a href="http://stackoverflow.com/questions/7555564/
 *what-is-the-recommended-way-to-make-a-numeric-textfield-in-javafx">
 * What is the recommended way to make a numeric TextField in JavaFX?</a>
 */
public class NumberTextField extends TextField {

    @Override
    public void replaceText(final int start, final int end, final String text) {
        if (validate(text)){
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceSelection(final String text) {
        if (validate(text)) {
            super.replaceSelection(text);
        }
    }

    /**
     * validate input text, this allow only numeric input.
     * @param text
     * @return
     */
    private boolean validate(final String text) {
        return text.matches("[0-9]*");
    }
}