public class Rectangle {

    // Deklarer double variabler og sætter dem til 1
    double width = 1;
    double height = 1;

    //Constructor
    Rectangle() {

    }

    // Constructor med width og height
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // En metode der returner arealet
    double getArea() {
        return width * height;
    }

    // En metode der returner omkredsen
    double getParimeter() {
        return 2 * (width + height);
    }

}
