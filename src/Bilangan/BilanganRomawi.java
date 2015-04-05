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
public class BilanganRomawi extends BilanganArab {

    /**
    *Konstruktor tanpa parameter
    */
    public BilanganRomawi(){
        Nromawi="";
    }
    
    /**
    *Konstruktor dengan parameter
    *I.S. string input berupa string simbol angka Romawi dengan nilai antara I hingga MMMCMXCIX
    *F.S. menyimpan kedalam variabel nilai angka integer dan variabel nromawi angka romawi
    *@param A untuk parameter pertama
    */
    BilanganRomawi(String A)
    {
        Nromawi=A;
        ConvertToArab(A);
    }
    
    /**
    *fungsi prosedur konversi angka Romawi menjadi angka Arab
    * assert untuk fungsi prosedur kalkulasi
    * assert precondition
    * I.S. angka Romawi antara I hingga MMMCMXCIX
    * F.S. nilai di isi dengan nilai hasil konversi angka Romawi
    *@param R untuk parameter pertama
    */
    public void ConvertToArab(String R){
        Integer value[]={1,5,10,50,100,500,1000};
    char CT;

    String Roman= "IVXLCDM";
    int Sum=0;
    CT=Roman.charAt(0);
    for(int i=R.length()-1;i>=0;i--){
        assert(Roman.indexOf(R.charAt(i)) < Roman.length());
        if(Roman.indexOf(CT) > Roman.indexOf(R.charAt(i))){
            Sum-=value[Roman.indexOf(R.charAt(i))];
        }
        else{
            Sum+=value[Roman.indexOf(R.charAt(i))];
            CT=R.charAt(i);
        }

    }
    //postcondition
    assert((Sum<3999)&&(Sum>0));
    nilai=(double)Sum;
    }
    
    /**
    *fungsi prosedur konversi angka Arab ke angka Romawi
    * assert untuk fungsi prosedur kalkulasi
    * assert postcondition
    * I.S. angka Arab dari 1 hingga 3999
    * F.S. Nromawi di isi dengan nilai hasil konversi angka Arab
    *@param A untuk parameter pertama
    */
    public void ConvertToRomawi(double A){
        int value[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int CT=12;
        String Roman[]= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String Hasil= "";
    //precondition
    assert((A<3999)&&(A>0));
    while(A>0){
        if((A-value[CT])>=0){
            A-=value[CT];
            Hasil+=Roman[CT];
        }else CT--;
    }
    Nromawi=Hasil;
    }
    
    /**
    *fgetter
    */
    public String getRomawi(){
        return Nromawi;
    }


    private String Nromawi;/*!< sebuah string Romawi */
};

