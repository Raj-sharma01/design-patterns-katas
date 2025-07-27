package org.example;

import org.example.models.Direction;
import org.example.models.Position;

public class Rover {
    private Position p;
    private Direction d;
    private int gridSize;

    public Rover(Position p, Direction d, int gridSize) {
        this.p = p;
        this.d = d;
        this.gridSize = gridSize;
    }

    public void moveForward(){
        switch (d) {
            case N:
                p.setPosY((p.getPosY()+1)%gridSize);
                break;
            case W:
                p.setPosX((p.getPosX()-1+gridSize)%gridSize);
                break;
            case S:
                p.setPosY((p.getPosY()-1+gridSize)%gridSize);
                break;
            case E:
                p.setPosX((p.getPosX()+1)%gridSize);
                break;
            default:
                System.out.println("Wrong Command");
        }
    }

    public void moveLeft(){
        d=d.moveLeft();
    }

    public void moveRight(){
        d=d.moveRight();
    }

    public String toString(){
        return p.getPosX() + ":" + p.getPosY() + ":" + d;
    }

}
