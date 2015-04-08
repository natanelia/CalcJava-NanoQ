package edu.nanoq.ekspresi;

import junit.framework.TestCase;
import org.junit.Test;

public class PrefixTest extends TestCase{

    @Test
    public void test1() throws Exception {
        assertEquals((new Prefix("2")).getHasil(),"2");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new Prefix("- 2 1")).getHasil(), "1");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new Prefix("+ / - * MOD 5 4 5 -4 / 60 20 + 1 5")).getHasil(), "9.00");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new Prefix("+ - * MOD 5 4 5 / 60 20 5")).getHasil(), "7.00");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new Prefix("OR AND TRUE FALSE OR FALSE TRUE")).getHasil(), "true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new Prefix("or or not true false and not false false")).getHasil(), "false");
    }

    @Test
    public void test7() throws Exception {
        assertEquals((new Prefix("and < 3 5 not true")).getHasil(), "false");
    }
}