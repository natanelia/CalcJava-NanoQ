package Ekspresi;

import Bilangan.Arab;

/**
 * @author Natan
 */
public class ExpressionProcessor {
    private Postfix expression;

    ExpressionProcessor(String exp, String operandType) {
        String[] exps = exp.split(" ");
        if (Infix.isOperator(exps[0])) {
            expression = new Prefix(exp,operandType);
        } else if (Infix.isOperator(exps[exps.length-1])) {
            expression = new Postfix(exp,operandType);
        } else {
            expression = new Infix(exp,operandType);
        }
    }

    public String toString() {
        return expression.getEkspresi() + " = " + expression.getHasil();
    }
}