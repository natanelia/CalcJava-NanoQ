/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.kalkulator;
import edu.nanoq.perintah.CommandProcessor;
import edu.nanoq.ekspresi.ExpressionProcessor;
import java.security.InvalidParameterException;
import java.util.*;
/**
 *
 * @author FiqieUlya
 */

public class Calculator {
    public static void main (String args[]){
        int n =1;
        Scanner st = new Scanner(System.in);
        while(n!=999){
            System.out.print("> ");
            String s = st.nextLine();
            try{
                CommandProcessor cmd = new CommandProcessor(s);
            } catch (InvalidParameterException e){
                ExpressionProcessor Perhitungan = new ExpressionProcessor(s);
                System.out.println(Perhitungan.toString());
            }
        }
    }
}
