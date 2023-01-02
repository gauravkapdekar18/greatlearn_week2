package Labsol;

public class Triangle  implements IShape{
    double hight, base;
    String color;

    public Triangle(String color, double hight, double base){
        this.hight = hight;
        this.base = base;
        this.color = color;
    }


    @Override
    public double calculateArea(){

        return this.hight * this.base;
    }

    @Override
    public double calculatePeremeter()                                                                      // Calculating Perimeter
    {
        return (this.hight + this.base) + Math.sqrt((this.hight * this.hight) + (this.base * this.base));
    }
}
