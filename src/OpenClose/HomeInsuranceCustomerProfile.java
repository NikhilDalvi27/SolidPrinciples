package OpenClose;

import java.util.Random;

public class HomeInsuranceCustomerProfile implements CustomerProfile {
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}
