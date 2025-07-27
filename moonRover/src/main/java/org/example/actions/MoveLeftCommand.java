package org.example.actions;

import org.example.Rover;

public class MoveLeftCommand implements Command {
    @Override
    public void execute(org.example.Rover rover) {
        rover.moveLeft();
    }
}
