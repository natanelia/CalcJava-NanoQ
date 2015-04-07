package edu.nanoq.ekspresi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Natan
 */
public class ExpressionProcessor {
    private Postfix expression;

    public ExpressionProcessor(String exp) {
        String[] exps = exp.split(" ");
        if (Postfix.isOperator(exps[exps.length-1])) {
            expression = new Postfix(exp);
        }else if (Postfix.isOperator(exps[0])) {
            expression = new Prefix(exp);
        }
        else {
            expression = new Infix(exp);
        }
    }

    public String toString() {
        return expression.getEkspresi() + " = " + expression.getHasil();
    }
}