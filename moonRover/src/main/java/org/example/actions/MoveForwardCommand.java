package org.example.actions;


import org.example.Rover;

public class MoveForwardCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveForward();
    }
}
