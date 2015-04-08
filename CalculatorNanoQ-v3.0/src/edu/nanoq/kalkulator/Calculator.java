/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.kalkulator;
import edu.nanoq.perintah.CommandProcessor;
import edu.nanoq.ekspresi.ExpressionProcessor;
import java.util.*;
/**
 *
 * @author FiqieUlya
 */

public class Calculator {
    public static void main (String args[]){
        CommandProcessor cmd = new CommandProcessor();
        int n =1;
        Scanner st = new Scanner(System.in);
        while(n!=999){
            System.out.print("> ");
            String s = st.nextLine();
            try{
                cmd.doCommand(s);
            } catch (IllegalArgumentException e){
                ExpressionProcessor Perhitungan = new ExpressionProcessor(e.getMessage());
                System.out.println(Perhitungan.toString());
            }
        }
    }
}
