package LLD_HLD.LowLevelDesign.DesignPatterns.Creational.FactoryPattern;

public class Main {

    public static void main(String[] args){
        ShapeFactory shape = new ShapeFactory();

        Shape circleObj = shape.getShape("CIRCLE");
        circleObj.draw();

        Shape rectangleObj = shape.getShape("RECTANGLE");
        rectangleObj.draw();

//        Shape randomObj = shape.getShape("RANDOM");
//        randomObj.draw();//null pointer exception
    }
}
