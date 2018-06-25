public class Line2D {

    private Point punkt1;
    private Point punkt2;

    public Line2D(Point punkt1, Point punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public Point getPunkt1() {
        return punkt1;
    }

    public void setPunkt1(Point punkt1) {
        this.punkt1 = punkt1;
    }

    public Point getPunkt2() {
        return punkt2;
    }

    public void setPunkt2(Point punkt2) {
        this.punkt2 = punkt2;
    }
}
