package Liskov_TellDontAsk;

public class InHouseProduct1 extends Product {
    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }

    public void applyExtraDiscount(){
        discount = discount*1.5;
    }
}
