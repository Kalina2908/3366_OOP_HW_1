package VendingMachines;

import java.util.ArrayList;
import java.util.List;
import Products.Product;

/** 
 * Базовый класс вендинговой машины
*/

public class VendingMachine {

    /** объем машины */
    private int volume;
    /** список продуктов */
    private List<Product> products;
    /** список записей */
    private List<String> workLog;


    /*
     * Конструктор вендинговой машины
     * @param volume объем бутылки
     */
    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    /** добавление продукта */
    public void addProduct (Product prod){
        products.add(prod);
    }

    /** добавление записей */
    public void addSales(String line){
        workLog.add(line);
    }

    /** получение всех наименований продуктов, которые загружены в машину */
    public Product getProdByName(String name){
        for(Product prod : products){
            if (prod.getName().contains(name)){
                return prod;
            }
        }
        return null;
    }

    /** получения списка из всех продуктов в машине */
    public List<Product> getProdAll(){
        return products;
    }
}
