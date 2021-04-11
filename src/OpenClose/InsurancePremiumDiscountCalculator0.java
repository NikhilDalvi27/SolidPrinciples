package OpenClose;

//todo this class is Closed for Extension
// since every time we add a new type of Insurance
// the calculatePremiumDiscountPercent method needs to be overriden
// i.e. the existing Class needs to be Modified which is not good
// This class also represents TIGHT COUPLING

public class InsurancePremiumDiscountCalculator0 {

    public int calculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }

    public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer){
        if(customer.isLoyalCustomer()){
            return 20;
        }
        return 0;
    }

}
