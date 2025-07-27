package main.actions;

import main.Rover;

public interface Command {
    void execute(Rover rover);
}
