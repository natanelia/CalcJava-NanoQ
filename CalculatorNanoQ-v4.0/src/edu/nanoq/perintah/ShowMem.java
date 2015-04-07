/**
 * Author   : Nitho Alif Ibadurrahman
 * File     : ShowMem.java
 */
package edu.nanoq.perintah;

public class ShowMem implements Command {
/** The ShowMem receiver */
    private int Num;

    public ShowMem(int n){
        Num = n;
    }

    @Override
    public void execute(){
        System.out.println("Proses ShowMem " + Num);
    }
}
