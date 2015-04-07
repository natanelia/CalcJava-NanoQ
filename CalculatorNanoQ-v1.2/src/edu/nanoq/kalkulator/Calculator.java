/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.kalkulator;
import edu.nanoq.ekspresi.ExpressionProcessor;
import java.util.*;
/**
 *
 * @author FiqieUlya
 */

public class Calculator {
    public void strSplit(String in, char delimiter, Vector<String> strings) {
	strings.clear();
	int x=0;
	for (int i=1; i<in.length(); i++) {
		if (in.charAt(i)== delimiter) {
			String s = in.substring(x,i-x);
			strings.add(s);
			x = i+1;
		}
	}
	if (in.length() > 0)
		strings.add(in.substring(x, in.length()));
}
    public static void main (String args[]){
        System.out.println("> ");
        Vector<String> sp;
        int n =1;
        while(n!=999){
        Scanner st = new Scanner(System.in);
        String s = st.nextLine();
        ExpressionProcessor Perhitungan = new ExpressionProcessor(s,"BilanganArab");
        System.out.println(Perhitungan.toString());
        }
    }
}
