public class LineCalc {

    public double lineLength(Line2D line) {
        if (line != null) {
            Point punkt1 = line.getPunkt1();
            Point punkt2 = line.getPunkt2();
            return Math.sqrt((punkt1.getX() - punkt2.getX()) *
                            (punkt1.getX() - punkt2.getX()) +
                            (punkt1.getY() - punkt2.getY()) *
                            (punkt1.getY() - punkt2.getY()));
        }
        return 0;
    }

}
