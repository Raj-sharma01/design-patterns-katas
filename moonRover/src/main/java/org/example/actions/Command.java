package org.example.actions;

import org.example.Rover;

public interface Command {
    void execute(Rover rover);
}
