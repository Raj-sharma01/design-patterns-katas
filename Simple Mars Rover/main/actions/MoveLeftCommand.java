package main.actions;

import main.Rover;

public class MoveLeftCommand implements Command {
    @Override
    public void execute(Rover rover) {
        rover.moveLeft();
    }
}
