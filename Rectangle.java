package Labsol;

public class Rectangle implements IShape{
    double hight, lenght;
    String color;

    public Rectangle(String color, double hight, double lenght){
        this.hight = hight;
        this.lenght = lenght;
        this.color = color;
    }


    @Override
    public double calculateArea(){

        return this.hight * this.lenght;
    }

    @Override
    public double calculatePeremeter(){                                                                      

        return 2*(this.hight + this.lenght);
    }
}
