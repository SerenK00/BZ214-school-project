package bm.erciyes.robotvacuumsim.model;

public class Cell {

    private int x;
    private int y;

    // Duvar veya mobilya varsa true, robot buradan geçemez (CollisionHandler kullanır)
    private boolean isObstacle;

    private boolean isVisited;

    // Kir
    private Dirt dirt;

    // Şarj istasyonu mu?
    private boolean isCharger;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.isObstacle = false;
        this.isVisited = false;
        this.dirt = null;
        this.isCharger = false;
    }

    // dirt null değilse kir vardır
    public boolean hasDirt() {
        return dirt != null;
    }

    public void removeDirt() {
        this.dirt = null;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public boolean isObstacle() { return isObstacle; }
    public void setObstacle(boolean obstacle) {
        this.isObstacle = obstacle;
    }

    public boolean isVisited() { return isVisited; }
    public void setVisited(boolean visited) {
        this.isVisited = visited;
    }

    public Dirt getDirt() { return dirt; }
    public void setDirt(Dirt dirt) { this.dirt = dirt; }

    // sarj istasyonundan tekrar tekrar geçmesini önler
    public boolean isCharger() { return isCharger; }
    public void setCharger(boolean charger) { this.isCharger = charger; }
}