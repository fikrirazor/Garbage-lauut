/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theater;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fikrirazor
 */
public class ValidatePhoneNumber {

    private Pattern pattern;
    private Matcher matcher;

    private static final String Phone_PATTERN = "[0-9]";

    public ValidatePhoneNumber() {
        pattern = Pattern.compile(Phone_PATTERN);
    }

    /**
     * Validate hex with regular expression
     * 
     * @param hex
     *            hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}



