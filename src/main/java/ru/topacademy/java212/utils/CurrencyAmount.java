package ru.topacademy.java212.utils;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

enum Currency{
    RUB,
    EUR,
    USD
}
public class CurrencyAmount {

     class CurrencyConverter{
        public static final MathContext MATH_CONTEXT = new MathContext(4,RoundingMode.UP);
        private final BigDecimal[][] rates = new BigDecimal[][]{
            { BigDecimal.ONE, new BigDecimal("66.1068"), new BigDecimal("62.6348") }, //RUB to others
            { BigDecimal.ONE.divide(new BigDecimal("66.1068"), MATH_CONTEXT), BigDecimal.ONE, new BigDecimal("0.9506") }, //EUR to others
            { BigDecimal.ONE.divide(new BigDecimal("62.6348"), MATH_CONTEXT), BigDecimal.ONE.divide(new BigDecimal("0.9506"), MATH_CONTEXT), BigDecimal.ONE } // USD to others
        };
        public CurrencyAmount convert(Currency to){
            BigDecimal result = amount.multiply(rates[currency.ordinal()][to.ordinal()]);
            return new CurrencyAmount(result.round(MATH_CONTEXT),to);
        }
    }
    private BigDecimal amount;
    private final Currency currency;

    public CurrencyAmount(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;

    }

    public CurrencyAmount(BigDecimal amount) {
        this.amount = amount;
        currency = Currency.RUB;
    }

    public CurrencyAmount(java.lang.String amount) {
        this.amount = new BigDecimal(amount);
        currency = Currency.RUB;
    }

    public void add(CurrencyAmount other){
        if(other.currency != this.currency){
            CurrencyConverter c = new CurrencyConverter();
            other = c.convert(other.currency);
        }
        amount = amount.add(other.amount);
    }

    public void subtract(CurrencyAmount other){
        if(other.currency != this.currency){
            CurrencyConverter c = new CurrencyConverter();
            other = c.convert(other.currency);
        }
        if(amount.compareTo(other.amount) > 0)
            amount = amount.subtract(other.amount);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public java.lang.String toString() {
        return "CurrencyAmount{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
