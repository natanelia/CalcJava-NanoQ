/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nanoq.perintah;

/**
 *
 * @author FiqieUlya
 */
public class CommandProcessor {	
    public void showMem(int n){
		System.out.println("Proses ShowMem " + n);
	}
	
	public void showAll(){
		System.out.println("Proses ShowMem Semua");
	}

	public void redo(int n){
		System.out.println("Proses Redo " + n);
	}

	public void undo(int n){
		System.out.println("Proses Undo " + n);
	}
        public void doCommand(String s){
            String[] input = s.split(" ");
            if (input[0].equalsIgnoreCase("REDO")){
                redo(Integer.parseInt(input[1]));
            } else if (input[0].equalsIgnoreCase("UNDO")){
                undo(Integer.parseInt(input[1]));
            } else if (input[0].equalsIgnoreCase("SHOWMEM")){
                showMem(Integer.parseInt(input[1]));
            } else if (input[0].equalsIgnoreCase("SHOW") && input[1].equalsIgnoreCase("ALL")){
                showAll();
            } else{
                throw new IllegalArgumentException(s);
            }
        }
}
