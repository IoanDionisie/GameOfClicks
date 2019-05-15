package practicaltest01.eim.systems.cs.pub.ro.game13;

import java.util.Random;

public class Grid {

    private int xMax, yMax;
    private int[] firstPoint, secondPoint;

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    public int[] getSecondPoint() {
        return secondPoint;
    }

    public int[] getFirstPoint() {
        return firstPoint;
    }


    public Grid(int level) {
        this.xMax = level;
        this.yMax = level;
    }

    public int[] generateX() {
        int[] x  = new int[2];
        Random rX = new Random();
        x[0] = rX.nextInt(xMax);
        x[1] = rX.nextInt(xMax);
        return x;
    }

    public int[] generateY() {
        int[] y = new int[2];
        Random rY = new Random();
        y[0] = rY.nextInt(yMax);
        y[1] = rY.nextInt(yMax);
        return y;
    }

    public void generatePoints() {

        this.firstPoint = generateX();
        this.secondPoint = generateY();

        while(this.firstPoint[0] == this.secondPoint[0] &&
                this.firstPoint[1] == this.secondPoint[1]) {
            this.secondPoint = generateY();
        }
    }
}
