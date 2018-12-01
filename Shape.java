public abstract class Shape extends Drawing
{
    String colour ="black";
    public Shape(){
        super();
    }
    
    @Override
    public void print()
    {
        System.out.println("Drawing "+this.getClass().getSimpleName()+" with colour "+this.getColour());
    }
    
    public String getColour()
    {
        return colour;
    }
    
    @Override
    public void setColour(String col) throws IllegalArgumentException
    {
        String input = col.toLowerCase();
        if(input.equals("black")||input.equals("blue")||input.equals("red"))
        {
                this.colour=col;
        }else{
            throw new IllegalArgumentException("Invalid colour! " + col);
        }
    }
}
