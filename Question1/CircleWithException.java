import java.util.Scanner;

public class CircleWithException {
    private double radius;

    public CircleWithException(double radius){
        this.radius=radius;
    }

    public CircleWithException(){

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius<0){
            throw new IllegalArgumentException("The radius must be positive!");
        }
        else{
            this.radius=radius;
        }
    }

    public double getArea() throws Exception{
        double area=Math.PI*radius*radius;
        if(area>1000){
            throw new Exception("Area should not be bigger than 1000!");
        }
        return area;
    }

    public double getDiameter(){
        double diameter=radius+radius;
        return diameter;
    }

    public static void main(String[] args){
        try(Scanner scan=new Scanner(System.in)){
            System.out.print("Enter the Radius of the Circle: ");
            double radius=scan.nextDouble();

            try{
                CircleWithException circle= new CircleWithException();
                circle.setRadius(radius);

                System.out.println("Radius: "+circle.getRadius());
                System.out.println("Area: "+circle.getArea());
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
