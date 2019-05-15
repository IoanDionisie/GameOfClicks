package practicaltest01.eim.systems.cs.pub.ro.game13;

public class Level {


    private int gridComplexity;
    private Grid grid;


    public int getGridComplexity() {
        return gridComplexity;
    }

    public void setGridComplexity(int gridComplexity) {
        this.gridComplexity = gridComplexity;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public Level(int gridComplexity) {
        this.gridComplexity = gridComplexity;
    }


}
