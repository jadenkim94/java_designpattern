package chapter5.parc.p3;

import java.util.ArrayList;

public class Member {
    private String name;
    private int rentalAmount;

    public Member(String name, int rentalAmount) {
        this.name = name;
        this.rentalAmount = rentalAmount;
    }

    public int getRentalAmount() {
        return rentalAmount;
    }

    public void buyBook(ArrayList<Book> books, DiscountStrategy discountStrategy){
        int totalPrice = 0 ;
        for(Book book : books){
            totalPrice += book.getPrice();
        }
        int discount = discountStrategy.discount(books, this);

        System.out.println(name + " 님이 책을 구매하셨습니다. "
            + "\n총 구매 금액은: " + totalPrice + " 입니다. "
            + "\n총 할인 금액은: " + discount + " 입니다. "
            + "\n총 결제 금액은: " + (totalPrice - discount) + " 입니다. ");
        rentalAmount += totalPrice - discount;
    }
}
