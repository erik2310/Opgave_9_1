public class Main {

    public static void main(String[] args) {
        //Laver en Rectangle objekter
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        // Printer rectangle1 data
        System.out.println("Rectangle 1 data:");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getParimeter());

        //Laver luft i mellem dem
        System.out.println();

        // Printer rectangle2 data
        System.out.println("Rectangle 2 data:");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getParimeter());

    }
}
