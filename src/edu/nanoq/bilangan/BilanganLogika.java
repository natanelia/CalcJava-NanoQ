/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.bilangan;

/**
 *
 * @author FiqieUlya
 */
public class BilanganLogika extends BilanganArab {
    
    /**
    *Konstruktor tanpa parameter
    */
    public BilanganLogika(){
        nilai=0;
    }
    
    /**
    *Konstruktor dengan parameter
    *I.S. string input berupa string 0, 1, true, false, nottrue, notfalse
    *F.S. menyimpan kedalam variabel nilai angka integer 0 dan 1
    *     true=1, false=0, nottrue=0, notfalse=1
    *@param L untuk parameter pertama
    */
    public BilanganLogika(String L){
        //precondition
        assert(L.equalsIgnoreCase("TRUE") || L.equalsIgnoreCase("FALSE") );
        ConvertToBilanganArab(L);
    }
    public void operatorNot(){
        if(nilai>0)
            nilai=0;
        else nilai=1;
    }
   
    public void ConvertToBilanganArab(String S){
        if(S.equalsIgnoreCase("true") || S.equalsIgnoreCase("1"))
            nilai=1;
        else if(S.equalsIgnoreCase("false") || S.equalsIgnoreCase("0")) nilai=0;
        else assert(!true);
    }
    
    @Override
    public String toString(){
        if(nilai==1)
            return "true";
        else return "false";
    }

    //private int nilai;/*!< sebuah integer nilai */
}
