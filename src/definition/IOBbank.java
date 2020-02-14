package definition;

import adt.BankADT;

public class IOBbank implements BankADT {
    @Override
    public int getRateOfInterest() {
        return 50;
    }

    @Override
    public int getFixedDepositInterest() {
        return 100;
    }
}
