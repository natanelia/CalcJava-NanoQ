package edu.nanoq.ekspresi;

import junit.framework.TestCase;
import org.junit.Test;

public class ExpressionProcessorTest extends TestCase {

    @Test
    public void test1() throws Exception {
        assertEquals((new ExpressionProcessor("(1 + 1)")).toString(),"2");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new ExpressionProcessor("(2 - 1 + 8)")).toString(), "9");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new ExpressionProcessor("((5 MOD 4) * 5 - -4 + (60 / 20) / (1 + 5))")).toString(), "9");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new ExpressionProcessor("((5 MOD 4) * 5 - 60 / 20 + 5)")).toString(), "7");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new ExpressionProcessor("(true and FALSE) OR (FALSE OR TRUE)")).toString(), "true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new ExpressionProcessor("(not true or FALSE) OR (not FALSE and false)")).toString(), "false");
    }


    @Test
    public void test7() throws Exception {
        assertEquals((new ExpressionProcessor("1")).toString(),"1");
    }

    @Test
    public void test8() throws Exception {
        assertEquals((new ExpressionProcessor("2 1 -")).toString(), "1");
    }

    @Test
    public void test9() throws Exception {
        assertEquals((new ExpressionProcessor("5 4 MOD 5 * -4 - 60 20 / 1 5 + / +")).toString(), "9");
    }

    @Test
    public void test10() throws Exception {
        assertEquals((new ExpressionProcessor("5 4 MOD 5 * 60 20 / - 5 +")).toString(), "7");
    }

    @Test
    public void test11() throws Exception {
        assertEquals((new ExpressionProcessor("TRUE FALSE AND FALSE TRUE OR OR")).toString(), "true");
    }

    @Test
    public void test12() throws Exception {
        assertEquals((new ExpressionProcessor("not true false or not false false and or")).toString(), "false");
    }
    @Test
    public void test13() throws Exception {
        assertEquals((new ExpressionProcessor("2")).toString(),"2");
    }

    @Test
    public void test14() throws Exception {
        assertEquals((new ExpressionProcessor("- 2 1")).toString(), "1");
    }

    @Test
    public void test15() throws Exception {
        assertEquals((new ExpressionProcessor("+ / - * MOD 5 4 5 -4 / 60 20 + 1 5")).toString(), "9");
    }

    @Test
    public void test16() throws Exception {
        assertEquals((new ExpressionProcessor("+ - * MOD 5 4 5 / 60 20 5")).toString(), "7");
    }

    @Test
    public void test17() throws Exception {
        assertEquals((new ExpressionProcessor("OR AND TRUE FALSE OR FALSE TRUE")).toString(), "true");
    }

    @Test
    public void test18() throws Exception {
        assertEquals((new ExpressionProcessor("or or not true false and not false false")).toString(), "false");
    }

    @Test
    public void test19() throws Exception {
        assertEquals((new ExpressionProcessor("((IX - VII + VI) / I - II * I)")).toString(), "VI");
    }

    @Test
    public void test20() throws Exception {
        assertEquals((new ExpressionProcessor("(XIII - IX)")).toString(), "IV");
    }
}