package chapter5.parc.p3;

import java.util.ArrayList;

public interface DiscountStrategy {
    int discount(ArrayList<Book> books, Member member);

}
