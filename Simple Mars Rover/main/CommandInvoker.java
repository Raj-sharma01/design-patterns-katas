package main;

public class CommandInvoker {
    public void executeCommand(Rover rover, char command) {
        switch (command) {
            case 'L':
                rover.moveLeft();
                break;
            case 'R':
                rover.moveRight();
                break;
            case 'M':
                rover.moveForward();
                break;
            default:
                System.out.println("wrong command :" + command);
        }
    }
}

