package main;

import main.models.Direction;
import main.models.Position;

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
            case d.N:
                p.setPosY((p.getPosY()+1)%gridSize);
                break;
            case d.W:
                p.setPosX((p.getPosX()-1+gridSize)%gridSize);
                break;
            case d.S:
                p.setPosY((p.getPosY()+1)%gridSize);
                break;
            case d.E:
                p.setPosX((p.getPosX()-1+gridSize)%gridSize);
                break;
            default:
                System.out.println("Wrong Command");
        }
    }

    public void moveLeft(){
        d.moveLeft();
    }

    public void moveRight(){
        d.moveRight();
    }


}
