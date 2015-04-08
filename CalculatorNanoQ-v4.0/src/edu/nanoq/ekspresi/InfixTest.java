package edu.nanoq.ekspresi;

import junit.framework.TestCase;
import org.junit.Test;

public class InfixTest extends TestCase {

    @Test
    public void test1() throws Exception {
        assertEquals((new Infix("(1 + 1)")).getHasil(),"2");
    }

    @Test
    public void test2() throws Exception {
        assertEquals((new Infix("(2 - 1 + 8)")).getHasil(), "9");
    }

    @Test
    public void test3() throws Exception {
        assertEquals((new Infix("((5 MOD 4) * 5 - -4 + (60 / 20) / (1 + 5))")).getHasil(), "9.50");
    }

    @Test
    public void test4() throws Exception {
        assertEquals((new Infix("((5 MOD 4) * 5 - 60 / 20 + 5)")).getHasil(), "7.00");
    }

    @Test
    public void test5() throws Exception {
        assertEquals((new Infix("(true and FALSE) OR (FALSE OR TRUE)")).getHasil(), "true");
    }

    @Test
    public void test6() throws Exception {
        assertEquals((new Infix("(not true or FALSE) OR (not FALSE and false)")).getHasil(), "false");
    }

    @Test
    public void test7() throws Exception {
        assertEquals((new Infix("(3 < 5) and (not true)")).getHasil(), "false");
    }


    @Test
    public void test20() throws Exception {
        assertEquals((new ExpressionProcessor("(3 < 5) and (not true) or (1 > 2) or (1 >= (9 + 3))")).toString(), "false");
    }

    @Test
    public void test21() throws Exception {
        assertEquals((new ExpressionProcessor("((not not true and not not not false) or (not not false))")).toString(), "true");
    }
}