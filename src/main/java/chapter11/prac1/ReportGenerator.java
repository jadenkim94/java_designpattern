package chapter11.prac1;

import java.util.List;

public abstract class ReportGenerator {

    public String generate(List<Customer> customers){
        StringBuilder builder = new StringBuilder();
        List<Customer> targetCustomers = select(customers);
        builder = createReportHeader(builder, targetCustomers);
        builder = createReportBody(builder, targetCustomers);
        builder = createReportFooter(builder, targetCustomers);
        return builder.toString();
    }

    protected abstract List<Customer> select(List<Customer> customers);
    protected abstract StringBuilder createReportHeader(StringBuilder sb, List<Customer> targetCustomers);
    protected abstract StringBuilder createReportBody(StringBuilder sb, List<Customer> targetCustomers);
    protected abstract StringBuilder createReportFooter(StringBuilder sb, List<Customer> targetCustomers);
}
