package Products;

public class BottleOfWater extends Product{

    /** объем бутылки */
    private int volume;

    /** конструктор продукта - бутылок с жидкостью */
    public BottleOfWater(String name, Double price, int volume){
        super (name, price);
        this.volume = volume;
    }
    
    /** получение объема бутылки */
    public int getVolume(){
        return volume;
    }

    /** переопределение вывода продукта (бутылок с жидкостью) */
    @Override
    public String toString(){
        return "Product{" + "name=" + super.getName() + "\"" + ", cost=" + super.getPrice() + ", volume=" + volume + "}";
    }
}
