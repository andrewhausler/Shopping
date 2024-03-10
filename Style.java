public class Style extends Product
{
    private double size;
    private String color;
    
    public Style(String name, String description, double size, String color)
    {
        super(name, description);
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
        return super.toString() + "\t Size: " + size + "\t Color: " + color;
    }
}