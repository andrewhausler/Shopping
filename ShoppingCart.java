import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;

public class ShoppingCart implements Cart<Product>
{
    private ArrayList<Product> myShoppingCart;
    
    public ShoppingCart()
    {
        myShoppingCart = new ArrayList<Product>();
    }

    public ArrayList<Product> getMyCart()
    {
        return myShoppingCart;
    }
    public void addToCart(Product item)
    {
        myShoppingCart.add(item);
    } 

    public void addToCart(Product item, int index)
    {
        myShoppingCart.add(index, item);
    }

    public void removeFromCart(int index)
    {
        try
        {
            myShoppingCart.remove(index);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("That Item Number Doesn't Exist In Your Cart!");
        }
    }

    public int removeFromCart(Product product)
    {
        for(int i=0; i<myShoppingCart.size(); i++)
        {
            if(myShoppingCart.get(i).compareTo(product) == 0)
            {
                myShoppingCart.remove(i);
                return i;
            }
        }
        return -1;
    }

    public void removeAllFood()
    {
        int count = 0;
        for(int i=0; i<myShoppingCart.size(); i++)
        {
            if(myShoppingCart.get(i) instanceof Food)
            {
                myShoppingCart.remove(i);
                i--;
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("All Food Items Are Removed!");
        }
        else
        {
            System.out.println("There Are No Food Items In Your Cart!");
        }
    }

    public void removeALLStyle()
    {
        int count = 0;
        for(int i=0; i<myShoppingCart.size(); i++)
        {
            if(myShoppingCart.get(i) instanceof Style)
            {
                myShoppingCart.remove(i);
                i--;
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("All Style Items Are Removed!");
        }
        else
        {
            System.out.println("There Are No Style Items In Your Cart!");
        }
    }

    public void removeAllElectronics()
    {
        int count = 0;
        for(int i=0; i<myShoppingCart.size(); i++)
        {
            if(myShoppingCart.get(i) instanceof Electronics)
            {
                myShoppingCart.remove(i);
                i--;
                count++;
            }
        }
        if(count > 0)
        {
            System.out.println("All Electronics Items Are Removed!");
        }
        else
        {
            System.out.println("There Are No Electronics Items In Your Cart!");
        }
    }
}