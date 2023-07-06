package me.zeroduck.tddtest.chap09;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Money times(int multiplier) {
        return franc(amount * multiplier);
    }
}
