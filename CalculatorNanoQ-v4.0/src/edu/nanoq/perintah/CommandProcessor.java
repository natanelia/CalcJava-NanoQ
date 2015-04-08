/**
 * Author   : Nitho Alif Ibadurrahman
 * File     : CommandProcessor.java
 */
package edu.nanoq.perintah;

import java.security.InvalidParameterException;

public class CommandProcessor {
/** The Command Processor wrapper */
    public CommandProcessor(String s){
        String sList[] = s.split(" ");
        System.out.println(sList[0]);
        if (isCommand(sList[0])){
            executeCmd(sList);
        } else{
            throw new InvalidParameterException();
        }
    }

    public boolean isCommand(String s){
        String cmdList = "REDO UNDO SHOWALL SHOWMEM";
        if (cmdList.contains(s.toUpperCase())){
            return true;
        } else{
            return false;            
        }
    }

    public void executeCmd(String sList[]){
    /** The Command invoker */
        if (sList[0].equalsIgnoreCase("REDO")){
            Command cmd = new Redo(Integer.parseInt(sList[1]));
            cmd.execute();
        } else if (sList[0].equalsIgnoreCase("UNDO")){
            Command cmd = new Undo(Integer.parseInt(sList[1]));
            cmd.execute();
        } else if (sList[0].equalsIgnoreCase("SHOWMEM")){
            Command cmd = new ShowMem(Integer.parseInt(sList[1]));
            cmd.execute();
        } else if (sList[0].equalsIgnoreCase("SHOW") && sList[1].equalsIgnoreCase("ALL") ){
            Command cmd = new ShowAll();
            cmd.execute();
        }
    }
}

