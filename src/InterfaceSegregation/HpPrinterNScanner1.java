package InterfaceSegregation;

public class HpPrinterNScanner1 implements IPrint,IScan {
    @Override
    public void print() {
        //Assume some printing
    }

    @Override
    public void getPrintSpoolDetails() {
        //Assume something that gets spool details
    }

    @Override
    public void scan() {
        //Assume some scanning
    }

    @Override
    public void scanPhoto() {
        //Assume some code for scanning Photo
    }

}
