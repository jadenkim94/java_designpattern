package chapter5.parc.p3;

import java.util.ArrayList;

public class MemberDiscount implements DiscountStrategy{

    @Override
    public int discount(ArrayList<Book> books, Member member) {
        int discount = 0;
        if(member.getRentalAmount() >= 10000){
            for(Book book : books){
                discount += book.getPrice() * 0.05;
            }
        }
        return discount;
    }
}
