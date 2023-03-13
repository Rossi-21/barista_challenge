import java.util.ArrayList;
public class TestOrder {
    public static void main(String[] args){

        Item item1 = new Item("Drip Coffee", 1.25);
        Item item2 = new Item("Latte", 3.75);
        Item item3 = new Item("Mocha", 4.25);
        Item item4 = new Item("Cappucino", 2.50);
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Ross");
        Order order4 = new Order("Milo");
        Order order5 = new Order("Sabine");
        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item1);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item3);
        order5.addItem(item3);
        order5.addItem(item3);
        order1.setReady(true);
        order4.setReady(true);
        //order1.display();
        //order3.display();
        //order4.display();

        System.out.println(order1.getOrderTotal());
    }
}