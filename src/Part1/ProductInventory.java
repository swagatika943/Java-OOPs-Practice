package Part1;

public class ProductInventory {
    int ID;
    String name;
    double price;
    int quantity;
    public ProductInventory(int ID, String name, double price, int quantity){
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculateTotalValue(){
        return  price * quantity;
    }
    public void updateQuantity(int addedQuantity){
        quantity = quantity+addedQuantity;
    }
    public void displayProductDetails(){
        System.out.println("Product ID:"+ID);
        System.out.println("Product Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
    }
}
