/**
 * Interface for shopping the basic requirements 
 * Takes any reference type
 */
public interface Cart<Type>
{
    /**
     * Add an item to cart
     * @param item The item that you want to buy
     */
    public void addToCart(Type item);
    
    /**
     * Adds an item to cart in specific index
     * @param item The item that you want to buy
     * @param index The position in the array or shopping cart
     */
    public void addToCart(Type item, int index);

    /**
     * Remove a specific item from cart
     * @param index The specific item you want removed
     */
    public void removeFromCart(int index);
}