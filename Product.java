public abstract class Product implements Comparable<Product>
{
    private String name;
    private String description;
    
    public Product(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public int compareTo(Product product)
    {
        if(this.name.compareTo(product.getName()) >= 1)
        {
            return 1;
        }
        else if(this.name.compareTo(product.getName()) == 0)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    public String toString()
    {
        return "Name: " + name + "\t Description: " + description;
    }
}