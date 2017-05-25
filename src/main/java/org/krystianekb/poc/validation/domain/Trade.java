package org.krystianekb.poc.validation.domain;

/**
 * Created by krystian on 23.05.17.
 */
public class Trade {

    String id, cparty, book;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCparty() {
        return cparty;
    }

    public void setCparty(String cparty) {
        this.cparty = cparty;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
