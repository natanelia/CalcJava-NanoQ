/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.bilangan;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author FiqieUlya
 */
public class BilanganArab {
    /**
    *Konstruktor tanpa parameter
    */
    
    protected static boolean isDouble=false;
    public BilanganArab(){
        nilai=0;
    }
    
    /**
    *Konstruktor dengan parameter
    *string input berupa string representasi integer
    *menyimpan kedalam variabel nilai nilai integer dari string yang di input
    *@param a untuk parameter pertama
    */
    public BilanganArab(String a){
        if(a.contains(".")) isDouble=true;
        Double b = Double.parseDouble(a);
        nilai= b;
        //System.out.println(""+nilai);
    }
    BilanganArab operatorequal(BilanganArab A){
        nilai=A.nilai;
        return this;
    }
    /**
    *fungsi prosedur penjumlahan override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void plus(BilanganArab A){
        nilai+=A.nilai;
    }
    
    /**
    *fungsi prosedur pengurangan override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void minus(BilanganArab A){
        nilai-=A.nilai;
    }
    
    /**
    *fungsi prosedur perkalian override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void multiplication(BilanganArab A){
        nilai*=A.nilai;
    }
    
    /**
    *fungsi prosedur pembagian override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void division(BilanganArab A){
        isDouble=true;
        nilai/=A.nilai;
    }
    
    /**
    *fungsi prosedur modulo override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void modulo(BilanganArab A){
        nilai%=A.nilai;
    }
    
    /**
    *fungsi prosedur div 
    *@param A untuk parameter pertama
    */
    public void Div(BilanganArab A){
        nilai/=A.nilai;
    }
    /**
    *fungsi kurang dari 
    *@param A untuk parameter pertama
    */
    public void kurangDari(BilanganArab A){
        nilai = ( nilai < A.nilai ) ? 1 : 0;
    }
    /**
    *fungsi lebihdari dari 
    *@param A untuk parameter pertama
    */
    public void lebihDari(BilanganArab A){
        nilai = (nilai > A.nilai) ? 1 : 0;
    }
    /**
    *fungsi samadengan 
    *@param A untuk parameter pertama
    */
    public void samaDengan(BilanganArab A){
        nilai = (nilai == A.nilai) ? 1: 0;
    }
    /**
    *fungsi kurang dari sama dengan 
    *@param A untuk parameter pertama
    */
    public void kurangDariSamaDengan(BilanganArab A){
        nilai = (( nilai < A.nilai )||(nilai == A.nilai)) ? 1 : 0;
    }
    /**
    *fungsi lebihdari dari sama dengan
    *@param A untuk parameter pertama
    */
    public void lebihDariSamaDengan(BilanganArab A){
        nilai = (( nilai > A.nilai )||(nilai == A.nilai)) ? 1 : 0;
    }
    public void tidakSamaDengan(BilanganArab A){
        
        nilai= ( nilai != A.nilai)? 1:0;
    }

    /**
    *fungsi prosedur setter nilai
    */
     /**
    *Fungsi override terhadap kelas bilangan
    *operator and
    *operator dengan operand unary
    *@param O untuk parameter pertama
    */
    public void operatorAnd(BilanganArab O){
        if(nilai> 0 && O.getNilai()>0)
            nilai=1;
        else nilai=0;
        
    }

    /**
    *Fungsi override terhadap kelas bilangan
    *operator or
    *@param O untuk parameter pertama
    */
    public void operatorOr(BilanganArab O){
        nilai+=O.getNilai();
        if(nilai>1) nilai=1;
    }

    /**
    *Fungsi override terhadap kelas bilangan
    *operator and
    *operator dengan operand unary
    *@param O untuk parameter pertama
    */
    public void operatorXor(BilanganArab O){
        if(nilai==O.getNilai())
        nilai=0;
        else nilai=1;
    }
    public double getNilai(){
        return nilai;
    }
    
    @Override
    public String toString(){
        if(isDouble){
            isDouble=false;
            NumberFormat formatter = new DecimalFormat("#0.00");     
            //System.out.println(formatter.format(nilai));
            return formatter.format(nilai);
        }
        else{
            int a=(int)(long)Math.floor(nilai );
            return Integer.toString(a);
        }
        
    }
    protected double nilai; /*!< sebuah integer nilai */
}
