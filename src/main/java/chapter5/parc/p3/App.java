package chapter5.parc.p3;

import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Member member = new Member("jaden", 10000);
        Book book1 = new Book("작가", LocalDate.of(1999,10,5), 50000);
        Book book2 = new Book("작가2", LocalDate.of(1999,10,5), 50000);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);


        member.rentBook(books, new MemberDiscount());
        System.out.println(member.getRentalAmount());


    }




}
