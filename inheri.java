
class Shape {

    String edgecolor;
    String fillcolor;

    public void colors() {
        System.out.println("EdgeColor : "+edgecolor+"," + " FillColor : "+fillcolor);
    }
}

class Triangle extends Shape {

    public void draw() {
        //Shape shape = new Shape();
        //shape.edgecolor = edgecolor;
        //shape.fillcolor = fillcolor;
        //shape.colors();
        System.out.println("It's a Triangle.");
    }
}

public class inheri {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.edgecolor = "Black";
        t1.fillcolor = "Blue";
        t1.colors(); // Accessing Shape Properties and method.
        t1.draw();
    }
}
