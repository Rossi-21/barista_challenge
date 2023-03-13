import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // ORDER METHODS
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public void addItem(Item item){
        items.add(item);
    }
    public void display(){
        System.out.println(this.name);
        for (Item item : items){
            System.out.println(String.format("%s - $%s", item.getName(),item.getPrice()));
        }
        System.out.println(String.format("Total: $%s",getOrderTotal()));
        System.out.println(getStatusMessage());

    }


    
    // GETTERS & SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }    
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for(Item item : items ){
            total += item.getPrice();
        }
        return total;
    }
   
}

