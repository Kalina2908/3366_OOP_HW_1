package Products;

public class HotDrink extends Product{

    /** размер стаканчика */
    private String volume;
    /** температура напитка */
    private Double temperature;
    /** количество добавляемого сахара */
    private int sugar;
    /** количество добавляемого молока */
    private Double milk;

    /** конструктор для горячих напитков */
    public HotDrink(String name, Double price, String volume, Double temperature, int sugar, Double milk){
        super (name, price);
        this.volume = volume;
        this.temperature = temperature;
        this.sugar = sugar;
        this.milk = milk;
    }
    
    /** получение размера стаканчика (маленький, средний, большой) */
    public String getVolume(){
        return volume;
    }

    /** получаем температуру напитка */
    public Double getTemperature(){
        return temperature;
    }

    /** получаем количество сахара */
    public int getSugar(){
        return sugar;
    }

    /** получаем количество молока */
    public Double getMilk(){
        return milk;
    }

    /** перераспределяем вывод для горячих напитков */
    @Override
    public String toString(){
        return "Product{" + "name=" + super.getName() + "\"" + ", cost=" + super.getPrice() + ", volume=" + volume + 
        ", temperature=" + temperature + ", sugar=" + sugar + ", milk=" + milk + "}";
    }
    
}
