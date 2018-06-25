public class Rectangle extends GeometricShape {

    private int bokA;
    private int bokB;

    public Rectangle(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }
}
