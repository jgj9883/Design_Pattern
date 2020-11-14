package ReportSystem;
/**
 *
 * @author HyunSung <gus005479@daum.net>
 */
public class ReportAdapter implements Receipt {

    private Report report;
    String name, birth;

    public ReportAdapter(Report report) {
        this.report = report;
    }

    public void viewReceipt(String name, String birth) {
        this.name = name;
        this.birth = birth;
        report.viewReport(name, birth);
    }

    public void print() {
        report.print();
    }
}
