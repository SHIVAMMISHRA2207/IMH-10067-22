class AreaCalculator {
    int side;
    int length;
     int breadth;

   
    public static AreaCalculator create(int... args) {
        return new AreaCalculator(args);
    }

   
    AreaCalculator(int... args) {
        if (args.length == 1) {
            this.side = args[0];
            this.length = 0;
            this.breadth = 0;
        } else if (args.length == 2) {
            this.length = args[0];
            this.breadth = args[1];
            this.side = 0;
        } else {
            this.side = 0;
            this.length = 0;
            this.breadth = 0;
            System.out.println("Invalid parameters provided.");
        }
    }

    

    public int calculateSquareArea(int side) {
        return side * side;
    }

    public int calculateRectangleArea(int length, int breadth) {
        return length * breadth;
    }

    public void displayAreaAndData() {
        if (this.side != 0) {
            System.out.println("Area of square with side " + this.side + " is " + calculateSquareArea(this.side));
        } else if (this.length != 0 && this.breadth != 0) {
            System.out.println("Area of rectangle with length " + this.length + " and breadth " + this.breadth + " is " + calculateRectangleArea(this.length, this.breadth));
        } else {
            System.out.println("No valid data provided to calculate area.");
        }
    }

    public static void main(String[] args) {
        
        AreaCalculator calculator1 = AreaCalculator.create(5);  
        calculator1.displayAreaAndData();

        AreaCalculator calculator2 = AreaCalculator.create(4, 6);  
        calculator2.displayAreaAndData();

        AreaCalculator calculator3 = AreaCalculator.create();  
        calculator3.displayAreaAndData();

        AreaCalculator calculator4 = AreaCalculator.create(3, 7, 8); 
        calculator4.displayAreaAndData();
    }
}

