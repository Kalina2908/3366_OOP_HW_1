import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Product("Шоколадка",88.0);
        //System.out.println(item1.toString());


        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Чипсы", 60.0));
        itemMachine.addProduct(new Product("Булочка с маком", 80.0));
        itemMachine.addProduct(new BottleOfWater("Water", 150.0, 2));
        itemMachine.addProduct(new BottleOfWater("Cola", 120.0, 1));
        itemMachine.addProduct(new HotDrink("Латте", 110.0, "средний", 80.0, 2, 50.5));
        itemMachine.addProduct(new HotDrink("Американо", 130.0, "большой", 85.0, 0, 0.0));
        itemMachine.addProduct(new HotDrink("Чай", 70.5, "средний", 85.5, 1, 0.0));


        for (Product prod : itemMachine.getProdAll()){
            System.out.println(prod.toString());
        }


    }

    
}
