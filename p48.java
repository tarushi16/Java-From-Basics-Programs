class product{
    private String itemNo;
    private String name;
    private double price;
    private short qty;

    public product(String item){
        itemNo=item;
    }
    public product(String item, String name){
        itemNo = item;
        this.name = name;
    }
    public product(String item, String name, double price, short qty){
        itemNo = item;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }
    public String getItemNo(){
        return itemNo;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(short qty) {
        this.qty = qty;
    }
}
public class p48 {

}
