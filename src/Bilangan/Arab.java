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
public class Arab {
    /**
    *Konstruktor tanpa parameter
    */
    public Arab(){
        nilai=0.0;
    }
    
    /**
    *Konstruktor dengan parameter
    *string input berupa string representasi integer
    *menyimpan kedalam variabel nilai nilai integer dari string yang di input
    *@param a untuk parameter pertama
    */
    public Arab(String a){
        for(int i=0;i<a.length();i++){
            //assert((a[i] >= '0' && a[i] <= '9') || a[i] == '-' || a[i] == '+');
        }
        nilai= Double.parseDouble(a);
    }
    
    /**
    *fungsi prosedur penjumlahan override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void plus(Arab A){
        nilai+=A.nilai;
    }
    
    /**
    *fungsi prosedur pengurangan override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void minus(Arab A){
        nilai-=A.nilai;
    }
    
    /**
    *fungsi prosedur perkalian override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void multiplication(Arab A){
        nilai*=A.nilai;
    }
    
    /**
    *fungsi prosedur pembagian override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void division(Arab A){
        nilai/=A.nilai;
    }
    
    /**
    *fungsi prosedur modulo override dari fungsi Operand
    *@param A untuk parameter pertama
    */
    public void modulo(Arab A){
        nilai%=A.nilai;
    }
    
    /**
    *fungsi prosedur div 
    *@param A untuk parameter pertama
    */
    public void Div(Arab A){
        nilai/=A.nilai;
    }
    /**
    *fungsi kurang dari 
    *@param A untuk parameter pertama
    */
    public boolean LessThan(Arab A){
        return nilai < A.nilai;
    }
    /**
    *fungsi lebihdari dari 
    *@param A untuk parameter pertama
    */
    public boolean MoreThan(Arab A){
        return nilai > A.nilai;
    }
    /**
    *fungsi samadengan 
    *@param A untuk parameter pertama
    */
    public boolean Equals(Arab A){
        return nilai == A.nilai;
    }
    /**
    *fungsi kurang dari sama dengan 
    *@param A untuk parameter pertama
    */
    public boolean LessThanE(Arab A){
        return this.LessThan(A)||this.Equals(A);
    }
    /**
    *fungsi lebihdari dari sama dengan
    *@param A untuk parameter pertama
    */
    public boolean MoreThanE(Arab A){
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
