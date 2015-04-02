/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operand;

/**
 *
 * @author FiqieUlya
 */
public class BilanganLogika extends Arab {
    
    /**
    *Konstruktor tanpa parameter
    */
    BilanganLogika(){
        nilai=0;
    }
    
    /**
    *Konstruktor dengan parameter
    *I.S. string input berupa string 0, 1, true, false, nottrue, notfalse
    *F.S. menyimpan kedalam variabel nilai angka integer 0 dan 1
    *     true=1, false=0, nottrue=0, notfalse=1
    *@param L untuk parameter pertama
    */
    BilanganLogika(String L){
        //precondition
        assert(L.equalsIgnoreCase("TRUE") || L.equalsIgnoreCase("FALSE") || L.equals("0") || L.equals("1") || L.equalsIgnoreCase("NOTFALSE")||L.equalsIgnoreCase("NOTTRUE")||L.equalsIgnoreCase("NOT0")||L.equalsIgnoreCase("NOT1"));
    if((L.equalsIgnoreCase("TRUE"))||(L.equalsIgnoreCase("1"))||(L.equalsIgnoreCase("NOTFALSE"))){
        nilai=1;
    }else nilai=0;
    }
    public void operatornot(Arab L){
        if(nilai==1)
            nilai=0;
        else nilai=1;
    }
    /**
    *Fungsi override terhadap kelas bilangan
    *operator and
    *operator dengan operand unary
    *@param O untuk parameter pertama
    */
    public void operatorand(Arab O){
        nilai*=O.getNilai();
    }

    /**
    *Fungsi override terhadap kelas bilangan
    *operator or
    *@param O untuk parameter pertama
    */
    public void operatoror(Arab O){
        nilai+=O.getNilai();
        if(nilai==2) nilai=1;
    }

    /**
    *Fungsi override terhadap kelas bilangan
    *operator and
    *operator dengan operand unary
    *@param O untuk parameter pertama
    */
    public void operatorxor(Arab O){
        if(nilai==O.getNilai())
        nilai=0;
        else nilai=1;
    }

    private double nilai;/*!< sebuah integer nilai */
}
