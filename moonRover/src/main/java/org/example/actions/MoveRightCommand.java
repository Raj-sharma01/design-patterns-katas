package org.example.actions;

import org.example.Rover;

public class MoveRightCommand implements Command {
    @Override
    public void execute(org.example.Rover rover) {
        rover.moveRight();
    }
}
