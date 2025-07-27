package main.actions;

import main.Rover;

public class MoveRightCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveRight();
    }
}
