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
public class BilanganArab {
    /**
    *Konstruktor tanpa parameter
    */
    public BilanganArab(){
        nilai=0.0;
    }
    
    /**
    *Konstruktor dengan parameter
    *string input berupa string representasi integer
    *menyimpan kedalam variabel nilai nilai integer dari string yang di input
    *@param a untuk parameter pertama
    */
    public BilanganArab(String a){
        for(int i=0;i<a.length();i++){
            //assert((a[i] >= '0' && a[i] <= '9') || a[i] == '-' || a[i] == '+');
        }
        nilai= Double.parseDouble(a);
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
    public boolean LessThan(BilanganArab A){
        return nilai < A.nilai;
    }
    /**
    *fungsi lebihdari dari 
    *@param A untuk parameter pertama
    */
    public boolean MoreThan(BilanganArab A){
        return nilai > A.nilai;
    }
    /**
    *fungsi samadengan 
    *@param A untuk parameter pertama
    */
    public boolean Equals(BilanganArab A){
        return nilai == A.nilai;
    }
    /**
    *fungsi kurang dari sama dengan 
    *@param A untuk parameter pertama
    */
    public boolean LessThanE(BilanganArab A){
        return this.LessThan(A)||this.Equals(A);
    }
    /**
    *fungsi lebihdari dari sama dengan
    *@param A untuk parameter pertama
    */
    public boolean MoreThanE(BilanganArab A){
        return this.MoreThan(A)|| this.Equals(A);
    }
    /**
    *fungsi prosedur setter nilai
    *@param n untuk parameter pertama
    */
    public void setNilai(Double n){
        nilai=n;
    }
    
    /**
    *fungsi prosedur setter nilai
    */
    public Double getNilai(){
        return nilai;
    }
    protected Double nilai; /*!< sebuah integer nilai */
}
