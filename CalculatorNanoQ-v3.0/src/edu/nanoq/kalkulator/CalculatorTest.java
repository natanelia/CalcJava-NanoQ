package edu.nanoq.kalkulator;

import edu.nanoq.ekspresi.ExpressionProcessor;
import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void test1() throws Exception {
        assertEquals((new ExpressionProcessor("(1 + 1)")).toString(),"(1 + 1) = 2");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new ExpressionProcessor("(2 - 1 + 8)")).toString(), "(2 - 1 + 8) = 9");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new ExpressionProcessor("((5 MOD 4) * 5 - -4 + (60 / 20) / (1 + 5))")).toString(), "((5 MOD 4) * 5 - -4 + (60 / 20) / (1 + 5)) = 9.50");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new ExpressionProcessor("((5 MOD 4) * 5 - 60 / 20 + 5)")).toString(), "((5 MOD 4) * 5 - 60 / 20 + 5) = 7.00");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new ExpressionProcessor("(true and FALSE) OR (FALSE OR TRUE)")).toString(), "(true and FALSE) OR (FALSE OR TRUE) = true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new ExpressionProcessor("(not true or FALSE) OR (not FALSE and false)")).toString(), "(not true or FALSE) OR (not FALSE and false) = false");
    }


    @Test
    public void test7() throws Exception {
        assertEquals((new ExpressionProcessor("1")).toString(),"1 = 1");
    }

    @Test
    public void test8() throws Exception {
        assertEquals((new ExpressionProcessor("2 1 -")).toString(), "2 1 - = 1");
    }

    @Test
    public void test9() throws Exception {
        assertEquals((new ExpressionProcessor("5 4 MOD 5 * -4 - 60 20 / 1 5 + / +")).toString(), "5 4 MOD 5 * -4 - 60 20 / 1 5 + / + = 9.50");
    }

    @Test
    public void test10() throws Exception {
        assertEquals((new ExpressionProcessor("5 4 MOD 5 * 60 20 / - 5 +")).toString(), "5 4 MOD 5 * 60 20 / - 5 + = 7.00");
    }

    @Test
    public void test11() throws Exception {
        assertEquals((new ExpressionProcessor("TRUE FALSE AND FALSE TRUE OR OR")).toString(), "TRUE FALSE AND FALSE TRUE OR OR = true");
    }

    @Test
    public void test12() throws Exception {
        assertEquals((new ExpressionProcessor("not true false or not false false and or")).toString(), "not true false or not false false and or = false");
    }
    @Test
    public void test13() throws Exception {
        assertEquals((new ExpressionProcessor("2")).toString(),"2 = 2");
    }

    @Test
    public void test14() throws Exception {
        assertEquals((new ExpressionProcessor("- 2 1")).toString(), "- 2 1 = 1");
    }

    @Test
    public void test15() throws Exception {
        assertEquals((new ExpressionProcessor("+ / - * MOD 5 4 5 -4 / 60 20 + 1 5")).toString(), "+ / - * MOD 5 4 5 -4 / 60 20 + 1 5 = 9.00");
    }

    @Test
    public void test16() throws Exception {
        assertEquals((new ExpressionProcessor("+ - * MOD 5 4 5 / 60 20 5")).toString(), "+ - * MOD 5 4 5 / 60 20 5 = 7.00");
    }

    @Test
    public void test17() throws Exception {
        assertEquals((new ExpressionProcessor("OR AND TRUE FALSE OR FALSE TRUE")).toString(), "OR AND TRUE FALSE OR FALSE TRUE = true");
    }

    @Test
    public void test18() throws Exception {
        assertEquals((new ExpressionProcessor("or or not true false and not false false")).toString(), "or or not true false and not false false = false");
    }

    @Test
    public void test19() throws Exception {
        assertEquals((new ExpressionProcessor("3 5 < not true and")).toString(), "3 5 < not true and = false");
    }

    @Test
    public void test20() throws Exception {
        assertEquals((new ExpressionProcessor("(3 < 5) and (not true)")).toString(), "(3 < 5) and (not true) = false");
    }

    @Test
    public void test21() throws Exception {
        assertEquals((new ExpressionProcessor("and < 3 5 not true")).toString(), "and < 3 5 not true = false");
    }

}