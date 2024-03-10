import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;
public class Store 
{
    static ArrayList<ArrayList<Product>> myStore = new ArrayList<ArrayList<Product>>();
    static AdvancedScanner newScanner = new AdvancedScanner();
    static ShoppingCart myCart = new ShoppingCart();
    public static void main(String[] args)
    {
        setStore();
        while(true)
        {   
            System.out.println("*** Your Local Online Store ***");
            System.out.println();
            System.out.println("To Begin Shopping Choose A Category From Below - ");
            System.out.println("   -1] Exit");
            System.out.println("    1] Food");
            System.out.println("    2] Electronics");
            System.out.println("    3] Style");
            System.out.println("    4] View Your Cart");
            System.out.println();
            System.out.print("Your Input: ");
            int categoryNumber = newScanner.getInput();
            if(categoryNumber == -1)
            {
                System.out.println("Thank U For Shopping At Your Local Online Store!");
                break;
            }
            switch (categoryNumber) {
                case 1:
                    viewShopCategory(0);
                    break;
                case 2:
                    viewShopCategory(1);
                    break;
                case 3:
                    viewShopCategory(2);
                    break;
                case 4:
                    viewYourCart();
                    break;
                default:
                    System.out.println();
                    System.out.println("Not A Valid Input!");
                    System.out.println();
                    newScanner.getScanner().nextLine();
                    continue;
            }
        }
    }

    public static void setStore()
    {
        int rows = 3;
        for(int i=0; i<rows; i++)
        {
            myStore.add(new ArrayList<Product>());
        }
        // Adding 3 Types Of Foods To The First Index/Row
        myStore.get(0).add(new Food("Cookies", "the sweet taste of chocolate and dough", 120, 12));
        myStore.get(0).add(new Food("Saltine Cracker", "the bland taste of just salt and wheat", 10, 0));
        myStore.get(0).add(new Food("Yogurt", "the taste of tangy and sourness", 300, 5));
        // Adding 3 Types Of Electronics To The Second Index/Row
        myStore.get(1).add(new Electronics("Computer", "some machine that can count from 0 to 1", false, false, ""));
        myStore.get(1).add(new Electronics("Phone", "some ancient tablet that has GUI abilities", true, true, "some sort of unreadable hieroglyphics but works some how"));
        myStore.get(1).add(new Electronics("TV", "some screen that plays stories that are visible and hearable", false, false, ""));
        // Adding 3 Types Of Styles To The Third Index/Row
        myStore.get(2).add(new Style("Shirt", "something to cover up that belly button", 16.5, "red"));
        myStore.get(2).add(new Style("Shoes", "these rubber things your feet goes in to jump higher", 10, "white"));
        myStore.get(2).add(new Style("Pants", "gotta protect the family jewels", 34.5, "tan"));
    }
    public static void viewShopCategory(int row)
    {
        
        for(int i=0; i<myStore.get(row).size(); i++)
        {
            System.out.println(i+1 + "] " + myStore.get(row).get(i));
        }
        System.out.println();
        System.out.println("Please Type The Item Number And It Will Be Added To Your Cart");
        System.out.println("Or You May Type -1 To Return To Main Page");
        System.out.println();
        System.out.print("Your Input: ");
        int categoryNumber = newScanner.getInput();
        switch (categoryNumber) {
                case -1:
                    System.out.println("Returning U Back To Main Page");
                    break;
                default:
                    try
                    {
                        myCart.addToCart(myStore.get(row).get(categoryNumber-1));
                        System.out.println(myStore.get(row).get(categoryNumber-1).getName() + " Have Been Added To Your Cart!");
                    }
                    catch(IndexOutOfBoundsException e)
                    {
                        System.out.println("That Item Number Doesn't Exist!");
                        System.out.println();
                        newScanner.getScanner().nextLine();
                        viewShopCategory(row);
                    }
        }
    } 

    public static void viewYourCart()
    {
        System.out.println();
        System.out.println("Your Items In Cart - ");
        for(int i=0; i<myCart.getMyCart().size(); i++)
        {
            System.out.println(i+1 + "] " + myCart.getMyCart().get(i));
        }
        System.out.println();
        System.out.println("Please Choose An Option By Typing In The Number - ");
        System.out.println("   -1] Exit");
        System.out.println("    1] Remove Specified Item");
        System.out.println("    2] Fully Remove A Specified Category");
        System.out.println("    3] Fully Clear Cart");
        System.out.println();
        System.out.print("Your Input: ");
        int categoryNumber = newScanner.getInput();
        switch (categoryNumber) {
            case -1:           
                System.out.println("Returning U Back To Main Page");
                break;
            case 1:
                removingItem();
                break;
            case 2:
                removeSpecifiedCategory();
                break;
            case 3:
                myCart.getMyCart().clear();
                break;
            default:
                System.out.println();
                System.out.println("Not A Valid Input!");
                System.out.println();
                newScanner.getScanner().nextLine();
                viewYourCart();
        }
    }

    public static void removingItem()
    {
        
        System.out.println("Type In The Item Number From Your Cart U Want Removed");
        System.out.println("Or You May Type -1 To Return To Main Page");
        System.out.println();
        System.out.print("Your Input: ");
        int categoryNumber = newScanner.getInput();
        switch (categoryNumber) {
            case -1:
                System.out.println("Returning U Back To Main Page");
                break;
            default:
                try
                {
                    myCart.removeFromCart(categoryNumber-1);
                    System.out.println(myCart.getMyCart().get(categoryNumber-1).getName() + "Have Been Removed From Your Cart!");
                }
                catch(IndexOutOfBoundsException e)
                {
                    System.out.println("There Is No Item Associated With That Number!");
                    newScanner.getScanner().nextLine();
                    removingItem();
                }
        }
    }

    public static void removeSpecifiedCategory()
    {
        System.out.println();
        System.out.println("Please Select A Category U Want Fully Removed");
        System.out.println("    -1] Exit");
        System.out.println("     1] Remove All Food");
        System.out.println("     2] Remove All Electronics");
        System.out.println("     3] Remove All Style");
        System.out.println();
        System.out.print("Your Input: ");
        int categoryNumber = newScanner.getInput();
        switch (categoryNumber) {
            case -1:
                System.out.println("Returning U Back To Main Page");
                break;
            case 1:
                myCart.removeAllFood();
                break;
            case 2:
                myCart.removeAllElectronics();
                break;
            case 3:
                myCart.removeALLStyle();
                break;
            default:
                System.out.println();
                System.out.println("Not A Valid Input!");
                System.out.println();
                newScanner.getScanner().nextLine();
                removeSpecifiedCategory();
        }

    }
    
}