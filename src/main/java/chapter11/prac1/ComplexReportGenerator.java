package chapter11.prac1;

import java.util.List;
import java.util.stream.Collectors;

public class ComplexReportGenerator extends ReportGenerator{

    @Override
    protected List<Customer> select(List<Customer> customers) {
        return customers.stream().filter(customer -> customer.getPoint() >= 100)
            .collect(Collectors.toList());
    }

    @Override
    protected StringBuilder createReportHeader(StringBuilder sb, List<Customer> customers) {
        sb.append(String.format("고객 수 : %d명입니다\n", customers.size()));
        return sb;
    }

    @Override
    protected StringBuilder createReportBody(StringBuilder sb, List<Customer> customers) {
        for(Customer customer : customers){
            sb.append(String.format("%d: %s\n", customer.getPoint(), customer.getName()));

        }
        return sb;
    }

    @Override
    protected StringBuilder createReportFooter(StringBuilder sb, List<Customer> customers) {
        int totalPoint = 0;
        for(Customer customer : customers){
            totalPoint += customer.getPoint();
        }
        return sb.append(String.format("점수 합계: %d", totalPoint));
    }
}
