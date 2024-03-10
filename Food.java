public class Food extends Product
{
    private int calories;
    private int sugar;
    
    public Food(String name, String description, int calories, int sugar)
    {
        super(name, description);
        this.calories = calories;
        this.sugar = sugar;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    public int getSugar()
    {
        return sugar;
    }

    public void setSugar(int sugar)
    {
        this.sugar = sugar;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\t Calories: " + calories + "\t Sugar: " + sugar;
    }
}