/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.ekspresi;

import edu.nanoq.bilangan.BilanganLogika;
import edu.nanoq.bilangan.BilanganArab;

import java.util.*;

/**
 * @author FiqieUlya
 */
public class Postfix {
    protected String ekspresi; /*!ekspresi dalam bentuk postfix*/
    protected BilanganArab hasil; /*!hasil '=' perhitungan*/

    Postfix() { //ctor
        ekspresi = "";
        hasil = new BilanganArab();
    }

    Postfix(String _ekspresi) { //ctor
        ekspresi = _ekspresi;
        Hitung();
    }

    public static boolean isOperator(String s) {
        return s.equalsIgnoreCase("+") ||
                s.equalsIgnoreCase("-") ||
                s.equalsIgnoreCase("*") ||
                s.equalsIgnoreCase("/") ||
                s.equalsIgnoreCase("div") ||
                s.equalsIgnoreCase("mod") ||
                s.equalsIgnoreCase("or") ||
                s.equalsIgnoreCase("xor") ||
                s.equalsIgnoreCase("and") ||
                s.equalsIgnoreCase("not") ||
                s.equalsIgnoreCase("<") ||
                s.equalsIgnoreCase(">") ||
                s.equalsIgnoreCase("<>") ||
                s.equalsIgnoreCase("<=") ||
                s.equalsIgnoreCase(">=") ||
                s.equalsIgnoreCase("==");
    }

    public Postfix operatorequal(Postfix P) { //assign
        ekspresi = P.ekspresi;
        hasil = P.hasil;
        return this;
    }

    protected void Hitung() {
        //melakukan perhitungan berdasarkan ekspresi yang menghasilkan Operand hasil
        Stack<BilanganArab> tabEkspresi = new Stack<BilanganArab>();
        BilanganArab temp;

        String[] Strings = ekspresi.trim().split("\\s+");

        for (int i = 0; i < Strings.length; i++) {
            if (isOperator(Strings[i])) {
                if (Strings[i].equalsIgnoreCase("not")) {
                    if (Strings[i + 1].equalsIgnoreCase("not")) i++;
                    else {
                        BilanganLogika bl = new BilanganLogika(Strings[++i]);
                        bl.operatorNot();
                        tabEkspresi.push(bl);
                    }
                } else {
                    assert (!tabEkspresi.empty());
                    temp = tabEkspresi.peek();
                    tabEkspresi.pop();
                    assert (!tabEkspresi.empty());
                    if (Strings[i].equals("+")) {   // .compare("+") == 0) {
                        tabEkspresi.peek().plus(temp);
                    } else if (Strings[i].equals("-")) {
                        tabEkspresi.peek().minus(temp);
                    } else if (Strings[i].equals("*")) {
                        tabEkspresi.peek().multiplication(temp);
                    } else if (Strings[i].equals("/")) {
                        tabEkspresi.peek().division(temp);
                    } else if (Strings[i].equalsIgnoreCase("DIV")) {
                        tabEkspresi.peek().Div(temp);
                    } else if (Strings[i].equalsIgnoreCase("MOD")) {
                        tabEkspresi.peek().modulo(temp);
                    } else if (Strings[i].equalsIgnoreCase("AND")) {
                        tabEkspresi.peek().operatorAnd((temp));
                    } else if (Strings[i].equalsIgnoreCase("OR")) {
                        tabEkspresi.peek().operatorOr((temp));
                    } else if (Strings[i].equalsIgnoreCase("XOR")) {
                        tabEkspresi.peek().operatorXor((temp));
                    } else {
                        if (Strings[i].equalsIgnoreCase("<")) {
                            tabEkspresi.peek().kurangDari(temp);
                        } else if (Strings[i].equalsIgnoreCase(">")) {
                            tabEkspresi.peek().lebihDari(temp);
                        } else if (Strings[i].equalsIgnoreCase("<>")) {
                            tabEkspresi.peek().tidakSamaDengan(temp);
                        } else if (Strings[i].equalsIgnoreCase("==")) {
                            tabEkspresi.peek().samaDengan(temp);
                        } else if (Strings[i].equalsIgnoreCase("<=")) {
                            tabEkspresi.peek().kurangDariSamaDengan(temp);
                        } else if (Strings[i].equalsIgnoreCase(">=")) {
                            tabEkspresi.peek().lebihDariSamaDengan(temp);
                        }
                        BilanganLogika lg = new BilanganLogika(tabEkspresi.peek().toString());
                        tabEkspresi.pop();
                        tabEkspresi.push(lg);
                    }
                }
            } else {//Operand
                //Memasukkan operand ke dalam stack
                if (Strings[i].equalsIgnoreCase("false") || Strings[i].equalsIgnoreCase("true"))
                    tabEkspresi.push(new BilanganLogika(Strings[i]));
                else {
                    tabEkspresi.push(new BilanganArab(Strings[i]));
                }
            }

        }
        assert (!tabEkspresi.empty());
        hasil = tabEkspresi.peek();
    }

    public String getHasil() {
        return hasil.toString();
    }

    public String getEkspresi() {
        return ekspresi;
    } //mengembalikan string ekspresi postfix


}










