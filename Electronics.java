public class Electronics extends Product
{
    private boolean takeBatteries;
    private boolean includeBatteries;
    private String typeBatteries;
    
    public Electronics(String name, String description, int quantity, boolean takeBatteries, boolean includeBatteries, String typeBatteries)
    {
        super(name, description, quantity)
        this.takeBatteries = takeBatteries;
        if(takeBatteries == false)
        {
            includeBatteries = null;
            typeBatteries = "";
        }
        else
        {
            this.includeBatteries = includeBatteries;
            this.typeBatteries = typeBatteries;
        }
    }

    public boolean getTakeBatteries()
    {
        return takeBatteries;
    }

    public void setTakeBatteries(boolean takeBatteries)
    {
        this.takeBatteries = takeBatteries;
    }

    public boolean getIncludeBatteries()
    {
        return includeBatteries;
    }

    public void setIncludeBatteries(boolean includeBatteries)
    {
        this.includeBatteries = includeBatteries;
    }

    public String getTypeBatteries()
    {
        return typeBatteries;
    }

    public void setTypeBatteries(String typeBatteries)
    {
        this.typeBatteries = typeBatteries;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Takes Batteries: " + takeBatteries + " Includes Batteries: " + includeBatteries + " Type of Batteries: " typeBatteries;
    }

}