public class TestClass
{

    public static void main(String[] args)
    {
        Shape cube1 = new Cube();
        Shape rectangle1 = new Rectangle();
        Shape cone1 = new Cone();
        Shape rectangle2 = new Rectangle();
        
        Drawing drawing1 = new Drawing();
        Drawing drawing2 = new Drawing();
        Drawing drawing3 = new Drawing();
        
        drawing3.add(cube1);
        drawing2.add(rectangle1);
        drawing2.add(rectangle2);
        drawing1.add(cone1);
        drawing1.add(drawing3);
        drawing1.add(drawing2);
        
        drawing1.setColour("black");
        drawing2.setColour("black");
        
        drawing2.print();
        
        drawing2.remove(rectangle1);
        
        drawing2.print();
        drawing3.print();
        
        drawing3.setColour("Red");
        
        drawing3.print();
        drawing1.setColour("bleu");
    }
}
