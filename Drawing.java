import java.util.ArrayList;
public class Drawing
{
    private ArrayList<Drawing> components;

    
    public Drawing()
    {
        components=new ArrayList();
    }
    
    public void setColour(String col) throws IllegalArgumentException
    {
        String input = col.toLowerCase();
        if(input.equals("black")||input.equals("blue")||input.equals("red"))
        {
            for(Drawing output:components)
            {
                output.setColour(col);     
            }
        }else{
            throw new IllegalArgumentException("Invalid colour! " + col);
        }
    }
    
    public void add(Drawing input)
    {
        components.add(input);
    }
    
    public void remove(Drawing input)
    {
        for(int i=0;i<components.size();i++){
            if(input.equals(components.get(i))){
                components.remove(i);
            }
        }
    }
    
    public void print()
    {
        for(Drawing output:components){
            output.print();
        }
    }
}
