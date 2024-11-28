package com.cg.factorydesign;

public class UseFactory {
	public static void main(String[] args)
	{
		ShapesFactory sf = new ShapesFactory();
		Shapes s1 = sf.getshape("CIRCLE");
		s1.draw();
		
		Shapes s2 = sf.getshape("RECTANGLE");
		s2.draw();
		
		Shapes s3 = sf.getshape("SQUARE");
		s3.draw();
	}
}
