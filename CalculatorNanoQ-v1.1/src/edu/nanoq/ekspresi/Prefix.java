/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.ekspresi;

import java.util.Stack;

/**
 * @author FiqieUlya
 */
public class Prefix extends Postfix {
    protected String ekspresiP; /*!ekspresi dalam bentuk postfix*/

    Prefix(String _ekspresi) {
        super();
        ekspresiP = _ekspresi;
        convertToPost();
        super.Hitung();
    }

    public void convertToPost() { //melakukan konversi ekspresi prefix ke postfix dan mengupdate string ekspresi (Postfix)
        Stack<String> stk = new Stack<String>();
        String[] post = ekspresiP.trim().split("\\s+");
        ekspresi = "";

        int x = 0;
        for (int i = 0; i < post.length; i++) {
            if (Postfix.isOperator(post[i])) {
                if (post[i].equalsIgnoreCase("not")) {
                    ekspresi = ekspresi + post[i] + " " + post[++i] + " ";
                    while (!stk.empty() && stk.peek().equals("#")) {
                        stk.pop();
                        ekspresi = ekspresi + stk.peek() + " ";
                        stk.pop();
                    }
                    stk.push("#");
                } else
                    stk.push(post[i]);
            } else {
                ekspresi = ekspresi + post[i] + " ";
                while (!stk.empty() && stk.peek().equals("#")) {
                    stk.pop();
                    ekspresi = ekspresi + stk.peek() + " ";
                    stk.pop();
                }
                stk.push("#");
            }
        }
        ekspresi = ekspresi.trim();
    }

    public String getEkspresi() {
        return ekspresiP;
    } //mengembalikan string ekspresi prefix}
}