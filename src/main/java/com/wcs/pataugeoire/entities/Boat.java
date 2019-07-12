package com.wcs.pataugeoire.entities;

public class Boat {
    private int x;
    private int y;
    private boolean isDestroyed;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean isDestroyed) {
        this.isDestroyed = isDestroyed;
    }

    public Boat(int x, int y) {
        this.x = x;
        this.y = y;
        this.isDestroyed = false;
    }
}