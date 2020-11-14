package ReportSystem;
/**
 *
 * @author HyunSung <gus005479@daum.net>
 */
public class ReceiptAdapter implements Report {

    private Receipt receipt;
    String name, birth;

    public ReceiptAdapter(Receipt receipt) {
        this.receipt = receipt;
    }

    public void viewReport(String name, String birth) {
        this.name = name;
        this.birth = birth;
        receipt.viewReceipt(name, birth);
    }

    public void print() {
        receipt.print();
    }

}
