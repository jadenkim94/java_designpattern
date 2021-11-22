package chapter5.parc.p3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OldBookDiscount implements DiscountStrategy{

    @Override
    public int discount(ArrayList<Book> books, Member member) {
        int discount = 0 ;

        List<Book> oldBooks = books.stream().filter(it -> it.getPublishDate().isBefore(LocalDate.now().minusYears(10)))
            .collect(Collectors.toList());

        for(Book oldBook : oldBooks){
            discount += oldBook.getPrice() * 0.1;
        }

        return discount;
    }
}
