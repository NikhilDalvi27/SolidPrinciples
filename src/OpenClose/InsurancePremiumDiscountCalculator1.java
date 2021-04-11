package OpenClose;

//todo This class is open for new Modification
// Since for adding a new type of Insurance
// only a Class corresponding to it needs to be added
// which implements the CustomerProfile Interface

public class InsurancePremiumDiscountCalculator1  {
    public int calculatePremiumDiscountPercent(CustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }
}
