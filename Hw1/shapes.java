abstract class shape
{
    abstract int numberOfSides();
}
class trapezoid extends shape
{
    int s=4;
    int numberOfSides()
    {
        return s;
    }
}
class triangle extends Shape
{
    int s=3;
    int numberOfSides()
    {
        return s;
    }
}
class hexagon extends Shape
{   
    int s=6;
    int numberOfSides()
    {
        return s;
    }
}

public class shapes {

	public static void main(String[] args) {
	    Trapezoid tz = new Trapezoid();
	    Triangle tr = new Triangle();
	    Hexagon hx = new Hexagon();
	    System.out.println("Trapezoid have number of sides:"+tz.numberOfSides());
            System.out.println("Triangle have number of sides:"+tr.numberOfSides());
            System.out.println("Hexagon have number of sides:"+hx.numberOfSides());
	}

}
