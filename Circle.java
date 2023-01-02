package Labsol;


public class Circle implements IShape
{
	int radius; 
	String colour; 
	double PI = 3.14; 

	public Circle ( String colour, int radius)							
	{
		this.colour = colour;
		this.radius = radius;
	}

	@Override
	public double calculatePeremeter()									
	{
		return 2 * PI * this.radius;
	}

	@Override
	public double calculateArea()										
	{
		return PI * this.radius * this.radius; 
	}

}
