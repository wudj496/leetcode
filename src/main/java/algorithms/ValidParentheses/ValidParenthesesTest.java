package algorithms.ValidParentheses;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.02
 */
public class ValidParenthesesTest extends TestCase {

    @Test
    public void test() {
        ValidParentheses validParentheses = new ValidParentheses();

        Assert.assertFalse(validParentheses.isValid(""));
        Assert.assertFalse(validParentheses.isValid("(("));
        Assert.assertFalse(validParentheses.isValid("]]"));
        Assert.assertFalse(validParentheses.isValid("("));
        Assert.assertTrue(validParentheses.isValid("()"));
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
        Assert.assertTrue(validParentheses.isValid("{[]}"));
        Assert.assertFalse(validParentheses.isValid("(]"));
        Assert.assertFalse(validParentheses.isValid("([)]"));

        Assert.assertFalse(validParentheses.isValid2(""));
        Assert.assertFalse(validParentheses.isValid2("(("));
        Assert.assertFalse(validParentheses.isValid2("]]"));
        Assert.assertFalse(validParentheses.isValid2("("));
        Assert.assertTrue(validParentheses.isValid2("()"));
        Assert.assertTrue(validParentheses.isValid2("()[]{}"));
        Assert.assertTrue(validParentheses.isValid2("{[]}"));
        Assert.assertFalse(validParentheses.isValid2("(]"));
        Assert.assertFalse(validParentheses.isValid2("([)]"));
    }
}
