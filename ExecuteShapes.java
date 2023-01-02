package Labsol;

public class ExecuteShapes {
    
    public static void main(String[] args){
        //Rectangle
        double rectangleArea ;
        double rectanglePeremeter ;
        
		Rectangle rectangle = new Rectangle("Red",5.2,9.1); 
            
        rectangleArea= rectangle.calculateArea();
        rectanglePeremeter = rectangle.calculatePeremeter();
        Rectangle.renderer.draw("This is Rectangle");
        Rectangle.renderer.logs("Area of rectangle is :: " + rectangleArea);
        Rectangle.renderer.logs("Peremeter of rectangle is :: " + rectanglePeremeter);

        //Tringle
        double triangleArea ;
        double trianglePeremerer ;
        
		Triangle tringle = new Triangle("Yellow",7,3.4); 
            
        triangleArea= tringle.calculateArea();
        trianglePeremerer = tringle.calculatePeremeter();
        
        tringle.renderer.draw("This is tringle");
        tringle.renderer.logs("Area of tringle is :: " + triangleArea);
        tringle.renderer.logs("Peremeter of tringle is :: " + trianglePeremerer);
        
        // Square

        double squareArea ;
        double squarePeremeter ;
        
		Square square = new Square("Blue",4.3); 
            
        squareArea= square.calculateArea();
        squarePeremeter = square.calculatePeremeter();
        
        
        square.renderer.draw("This is square");
        square.renderer.logs("Area of square is :: " + squareArea);
        square.renderer.logs("Peremeter of square is :: " + squarePeremeter);

        // Circle
        
        double circleArea ;
        double circlePeremeter ;
        
		Circle circle = new Circle("green",4); 
            
        circleArea= square.calculateArea();
        circlePeremeter = square.calculatePeremeter();
        
        circle.renderer.draw("This is circle");
        circle.renderer.logs("Area of circle is :: " + circleArea);
        circle.renderer.logs("Peremeter of circle is :: " + circlePeremeter);
        

    }   
}
