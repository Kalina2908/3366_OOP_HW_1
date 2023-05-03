package Products;

/** 
 * Базовый класс продукта
*/

public class Product {

    /** наименование продукта */
    private String name;
    /** цена продукта*/
    private Double price;

    /**
     * конструктор продукта 2 параметра
     * @param name наименование продукта
     * @param price цена продукта
     */

    public Product (String name, Double price) {
        if (name==""){
            throw new IllegalStateException(String.format("У продукта нет имени")); // Проверка
        }
        else{
            this.name = name;
            this.price = price;
        }

    }

    /**
     * устанавливаем цену продукта
     * @param value новая цена продукта
     */
    public void setPrice(Double value){
        if (value <= 0){
            throw new IllegalStateException(String.format("Цена некорректная!", value)); // проверка
        }
        this.price = value;
    }

    /** получаем наименование продукта */
    public String getName(){
        return name;
    }

    /** получаем цену продукта */
    public Double getPrice(){
        return price;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString(){
        return "Product{" + "name=" + name + "\"" + ", cost=" + price + "}";
    }
}
