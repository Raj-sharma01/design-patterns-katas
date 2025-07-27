package main;

import main.models.Direction;
import main.models.Position;

public class MyMain{

    public static void main(String[] args) {
        Rover simpleMoonRover = new Rover(new Position(0,0), Direction.N,10);

        String commands = "MMMMMMMMMM";

        CommandInvoker commandInvoker=new CommandInvoker();
        for(int i=0;i<commands.length();i++) {
            char command = commands.charAt(i);
            commandInvoker.executeCommand(simpleMoonRover,command);
        }

        System.out.println(simpleMoonRover);
    }
}
