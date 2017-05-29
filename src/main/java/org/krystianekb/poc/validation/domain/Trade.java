package org.krystianekb.poc.validation.domain;

import java.util.UUID;

public class Trade {

    private String cparty, book;
    private UUID uuid = UUID.randomUUID();

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

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "cparty='" + cparty + '\'' +
                ", book='" + book + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
