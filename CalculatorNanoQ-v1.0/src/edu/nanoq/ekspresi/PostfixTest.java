package edu.nanoq.ekspresi;

import junit.framework.TestCase;
import org.junit.Test;

public class PostfixTest extends TestCase {

    @Test
    public void test1() throws Exception {
        assertEquals((new Postfix("(1 + 1)")).getHasil(),"2");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new Postfix("(2 - 1 + 8)")).getHasil(), "9");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new Postfix("((5 MOD 4) * 5 - -4 + (60 / 20) / (1 + 5))")).getHasil(), "9");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new Postfix("((5 MOD 4) * 5 - 60 / 20 + 5)")).getHasil(), "7");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new Postfix("(true and FALSE) OR (FALSE OR TRUE)")).getHasil(), "true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new Postfix("(not true or FALSE) OR (not FALSE and false)")).getHasil(), "false");
    }
}