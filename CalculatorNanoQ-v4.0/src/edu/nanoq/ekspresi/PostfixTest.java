package edu.nanoq.ekspresi;

import junit.framework.TestCase;
import org.junit.Test;

public class PostfixTest extends TestCase {

    @Test
    public void test1() throws Exception {
        assertEquals((new Postfix("1")).getHasil(),"1");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new Postfix("2 1 -")).getHasil(), "1");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new Postfix("5 4 MOD 5 * -4 - 60 20 / 1 5 + / +")).getHasil(), "9.50");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new Postfix("5 4 MOD 5 * 60 20 / - 5 +")).getHasil(), "7.00");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new Postfix("TRUE FALSE AND FALSE TRUE OR OR")).getHasil(), "true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new Postfix("not true false or not false false and or")).getHasil(), "false");
    }

    @Test
    public void test7() throws Exception {
        assertEquals((new Postfix("3 5 < not true and")).getHasil(), "false");
    }

    @Test
    public void test20() throws Exception {
        assertEquals((new ExpressionProcessor("3 5 < not true and 1 2 > or 1 9 3 + >= or")).toString(), "false");
    }

    @Test
    public void test21() throws Exception {
        assertEquals((new ExpressionProcessor("not not true not not not false and not not false or")).toString(), "true");
    }
}