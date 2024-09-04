package org.example.model;

public class Cashier extends CodeBase{
    private Integer rating;


    public Cashier(String name, String gender, String id, String phoneNumber, Integer rating) {
        super(name, gender, id, phoneNumber);
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "rating=" + rating +
                '}';
    }
}
