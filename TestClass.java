public class TestClass
{

    public static void main(String[] args)
    {
        TestClass tc = new TestClass();
        tc.test();
    }
    
    public void test()
    {
        Shape triangle1 = new Triangle();
        Shape rectangle1 = new Rectangle();
        Shape cone1 = new Cone();
        Shape rectangle2 = new Rectangle();
        
        Drawing drawing1 = new Drawing();
        Drawing drawing2 = new Drawing();
        Drawing drawing3 = new Drawing();
        
        drawing3.add(triangle1);
        drawing2.add(rectangle1);
        drawing2.add(rectangle2);
        drawing1.add(cone1);
        drawing1.add(drawing3);
        drawing1.add(drawing2);
        
        try{
           drawing1.setColour("black"); 
        }catch(IllegalArgumentException e){
           System.out.println(e.getMessage()); 
        }
        
        try{
           drawing2.setColour("black"); 
        }catch(IllegalArgumentException e){
           System.out.println(e.getMessage()); 
        }
        
        drawing2.print();
        
        drawing2.remove(rectangle1);
        
        drawing2.print();
        drawing3.print();
        
        try{
           drawing3.setColour("Red"); 
        }catch(IllegalArgumentException e){
           System.out.println(e.getMessage()); 
        }
        
        drawing3.print();
        
        try{
           drawing1.setColour("bleu"); 
        }catch(IllegalArgumentException e){
           System.out.println(e.getMessage()); 
        }
    }
}
