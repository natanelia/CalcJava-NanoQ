/**
 * Author   : Nitho Alif Ibadurrahman
 * File     : Redo.java
 */
package edu.nanoq.perintah;

public class Redo implements Command {
/** The Redo receiver */
    private int Num;

    public Redo(int n){
        Num = n;
    }

    @Override
    public void execute(){
        System.out.println("Proses Redo " + Num);
    }
}
