import java.util.ArrayList;

public class ShoppingCart implements Cart<Product>
{
    private ArrayList<Product> myShoppingCart;
    
    public ShoppingCart()
    {
        myShoppingCart = new ArrayList<Product>();
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
        myShoppingCart.remove(index);
    }
}