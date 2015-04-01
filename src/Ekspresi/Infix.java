/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ekspresi;

import java.util.Stack;

/**
 *
 * @author Natan
 */
public class Infix extends Postfix {
    protected String ekspresiP; /*!ekspresi dalam bentuk postfix*/

    Infix(String _ekspresi, String _operandType) {
        super(_operandType);
        ekspresiP = _ekspresi;
        convertToPost();
        super.Hitung();
    }

    public static boolean isOperator(String s) {
        return s.equalsIgnoreCase("+") ||
                s.equalsIgnoreCase("-") ||
                s.equalsIgnoreCase("*") ||
                s.equalsIgnoreCase("/") ||
                s.equalsIgnoreCase("div") ||
                s.equalsIgnoreCase("mod");
    }

    protected boolean isLowerPriority(String op1, String op2) {
        if (op1.equalsIgnoreCase("+") || op1.equalsIgnoreCase("-"))
            return !(op1.equalsIgnoreCase("+") || op2.equalsIgnoreCase("-"));
        else if (op1.equalsIgnoreCase("*") || op1.equalsIgnoreCase("/") || op1.equalsIgnoreCase("div") || op1.equalsIgnoreCase("mod"))
            return op2.equalsIgnoreCase("(");
        else if (op1.equalsIgnoreCase("("))
            return true;
        else
            return false;
    }

    protected void convertToPost(){
        //mengubah ekspresi Infix ke Postfix
        Stack<String> stk = new Stack<String>();
        StringBuilder postfix = new StringBuilder(ekspresiP.length());

        String[] infix = ekspresiP.trim().split("\\s+");

        int j=0;
        for (int i = 0; i < infix.length; i++) {
            if (infix[i].equalsIgnoreCase("("))
                stk.push(infix[i]);
            else if (infix[i].equalsIgnoreCase(")")) {
                while (!stk.empty()) {
                    if (stk.peek().equalsIgnoreCase("(")) {
                        stk.pop();
                        break;
                    }
                    postfix.append(stk.peek());
                    postfix.append(" ");
                    j++;
                    stk.pop();
                }
            } else if (isOperator(infix[i])) {
                while (!stk.empty() && !stk.peek().equalsIgnoreCase("(") && isLowerPriority(stk.peek(), infix[i])) {
                    postfix.append(stk.peek());
                    postfix.append(" ");
                    j++;
                    stk.pop();
                }
                stk.push(infix[i]);
            } else {
                postfix.append(infix[i]);
                postfix.append(" ");
                j++;
            }
        }

        while (!stk.empty()) {
            postfix.append(stk.peek());
            postfix.append(" ");
            j++;
            stk.pop();
        }
        ekspresi = postfix.toString().trim();
    }

    public String getEkspresi() { return ekspresiP; }

    public void setEkspresi(String _ekspresi) {
        ekspresiP = _ekspresi;
        convertToPost();
        super.Hitung();
    }
}
