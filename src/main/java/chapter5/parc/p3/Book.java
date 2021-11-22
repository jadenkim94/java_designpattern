package chapter5.parc.p3;

import java.time.LocalDate;

public class Book {
    private String sign;
    private LocalDate publishDate;
    private int price;

    public Book(String sign, LocalDate publishDate, int price) {
        this.sign = sign;
        this.publishDate = publishDate;
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public int getPrice() {
        return price;
    }
}
