package me.zeroduck.tddtest.chap14;

public interface Expression {
    Money reduce(Bank bank, String to);
}
