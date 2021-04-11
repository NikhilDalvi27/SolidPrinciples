package InterfaceSegregation;

public class XeroxWorkCenter1 implements IPrint,IScan,IFax {
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

    @Override
    public void fax() {
        //Assume some code for fax
    }

    @Override
    public void internetFax() {
        //Assume some code for internet fax
    }
}
