package main.models;

public enum Direction {
    N, W, S, E ;

    public Direction moveLeft(){
        return values()[(this.ordinal()+1)%4];
    }

    public Direction moveRight(){
        return values()[(this.ordinal()-1+4)%4];
    }
}
