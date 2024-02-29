public class Style extends Product
{
    private double size;
    private String color;
    
    public Style(String name, String description, int quantity, double size, String color)
    {
        super(name, description, quantity);
        this.size = size;
        this.color = color;
    }

    public double getSize()
    {
        return size;
    }

    public void setSize(double size)
    {
        this.size = size;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return super.toString() + " Size: " + size + " Color: " + color;
    }
}