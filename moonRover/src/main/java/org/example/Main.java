package org.example;

import org.example.models.Direction;
import org.example.models.Position;

public class Main {
    public static void main(String[] args) {
        Rover simpleMoonRover = new Rover(new Position(0,0), Direction.N,10);

        String commands = "MMMMMMMMMM";
//        String commands = "RMMLM";
//        String commands = "MMRMMLM";

        CommandInvoker commandInvoker=new CommandInvoker();
        for(int i=0;i<commands.length();i++) {
            char command = commands.charAt(i);
            commandInvoker.executeCommand(simpleMoonRover,command);
        }

        System.out.println(simpleMoonRover);
    }
}