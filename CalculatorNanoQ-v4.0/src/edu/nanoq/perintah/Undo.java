/**
 * Author   : Nitho Alif Ibadurrahman
 * File     : Undo.java
 */
package edu.nanoq.perintah;

public class Undo implements Command {
/** The Undo receiver */
    private int Num;

    public Undo(int n){
        Num = n;
    }

    @Override
    public void execute(){
        System.out.println("Proses Undo " + Num);
    }
}
