public class ZadanieTest {

    public static void main(String[] args) {

        ShapeCalculator calculator = new ShapeCalculator();

        Point punkt1 = new Point(2,3);
        Point punkt2 = new Point(5,4);
        Line2D odcinek = new Line2D(punkt1, punkt2);
        double dlugoscOdcinka = calculator.lineLength(odcinek);
        System.out.println("Dlugosc odcinka wynosi: " + dlugoscOdcinka);

        Circle kolo = new Circle(10);
        double poleKola = calculator.circleArea(kolo);
        System.out.println("Pole koła wynosi: " + poleKola);

        Rectangle kwadrat = new Rectangle(3, 3);
        Rectangle prostokat = new Rectangle(3, 5);
        int poleKwadratu = calculator.rectangleArea(kwadrat);
        int poleProstokata = calculator.rectangleArea(prostokat);

        System.out.println("Pole kwadratu wynosi: " + poleKwadratu);
        System.out.println("Pole prostokata wynosi: " + poleProstokata);

        Ball kula = new Ball(4);
        double pojemnoscKuli = calculator.ballVolume(kula);
        System.out.println("Pojemnosc kuli wynosi: " + pojemnoscKuli);

        Cube szescian = new Cube(5);
        double pojemnoscSzescianu = calculator.cubeVolume(szescian);
        System.out.println("Pojemnosc szescianu wynosi: " + pojemnoscSzescianu);
   }


}
