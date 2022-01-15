package chapter11.prac1;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{

    @Override
    protected List<Customer> select(List<Customer> customers) {
        return customers;
    }

    @Override
    protected StringBuilder createReportHeader(StringBuilder sb, List<Customer> customers) {
        sb.append(String.format("고객 수 : %d명\n", customers.size()));
        return sb;
    }

    @Override
    protected StringBuilder createReportBody(StringBuilder sb, List<Customer> customers) {
        for(Customer customer: customers){
            sb.append(String.format("%s: %d\n", customer.getName(), customer.getPoint()));
        }
        return sb;
    }

    @Override
    protected StringBuilder createReportFooter(StringBuilder sb, List<Customer> customers) {
        return sb;
    }
}
