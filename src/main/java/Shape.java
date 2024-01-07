public interface Shape {
    void calculateArea();

    void calculatePerimeter();
}
    class Circle implements Shape {
        @Override
        public void calculateArea() {
            System.out.println("The area of the circle is defined.");
        }

        @Override
        public void calculatePerimeter() {
            System.out.println("The perimeter for circle is non-existent.");
        }
    }

    class Square implements Shape {
        @Override
        public void calculateArea() {
            System.out.println("The area of the square is 2x4.");
        }

        @Override
        public void calculatePerimeter() {
            System.out.println("The perimeter formula for square is P=4a.");
        }
    }

    class ShapeTester{
        public static void main(String[] args) {

            Circle c=new Circle();
            c.calculateArea();
            c.calculatePerimeter();

            Square s=new Square();
            s.calculateArea();
            s.calculatePerimeter();

        }
    }

