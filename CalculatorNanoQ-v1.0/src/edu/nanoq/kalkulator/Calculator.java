/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.kalkulator;

import edu.nanoq.ekspresi.ExpressionProcessor;

import java.util.*;

/**
 * @author FiqieUlya
 */

public class Calculator {
    public static void main(String args[]) {
        Vector<String> sp;
        int n = 1;
        Scanner st = new Scanner(System.in);
        while (n != 999) {
            String s = st.nextLine();
            ExpressionProcessor Perhitungan = new ExpressionProcessor(s);
            System.out.println(Perhitungan.toString());
        }
    }
}
