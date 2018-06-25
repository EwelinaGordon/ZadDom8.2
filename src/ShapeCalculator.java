public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {

        if (circle != null) {
            int promien = circle.getSrednica() / 2;
            return Math.PI * (promien * promien);
        }

        return 0;
    }


    @Override
    public int rectangleArea(Rectangle rectangle) {

        if(rectangle!=null) {
            return rectangle.getBokA() * rectangle.getBokB();
        }

        return 0;
    }

    @Override
    public double ballVolume(Ball ball) {

        double ulamek = 4/3.0f;
        int promien = ball.getPromien();

        if(ball!=null) {
            return ulamek*Math.PI*(Math.pow(promien,3));
        }

        return 0;
    }

    @Override
    public double cubeVolume(Cube cube) {

        if(cube!=null) {
            return Math.pow(cube.getKrawedzSzescianu(), 3);
        }

        return 0;
    }
}
