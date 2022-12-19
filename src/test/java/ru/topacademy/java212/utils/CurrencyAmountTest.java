package ru.topacademy.java212.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class CurrencyAmountTest {

    @Test
    public void test_that_RU_is_default(){
        CurrencyAmount a = new CurrencyAmount(BigDecimal.TEN);
        Assertions.assertEquals(Currency.RUB, a.getCurrency());
    }

    @Test
    public void test_that_addition_is_ok_for_same_currency(){
        CurrencyAmount a1 = new CurrencyAmount(BigDecimal.TEN, Currency.EUR);
        CurrencyAmount a2 = new CurrencyAmount(BigDecimal.TEN, Currency.EUR);
        a1.add(a2);
        Assertions.assertEquals("20", a1.getAmount().toString());
    }

    @Test
    public void test_that_addition_is_ok_for_Diff_currency() {
        CurrencyAmount a1 = new CurrencyAmount(BigDecimal.TEN, Currency.RUB);
        CurrencyAmount a2 = new CurrencyAmount(BigDecimal.TEN, Currency.EUR);
        a1.add(a2);
        Assertions.assertEquals("671.1", a1.getAmount().toString());

    }

    @Test
    public void test_that_no_sort() {
        CurrencyAmount a1 = new CurrencyAmount(BigDecimal.TEN, Currency.RUB);
        CurrencyAmount a2 = new CurrencyAmount(BigDecimal.ONE, Currency.EUR);
        CurrencyAmount[] arr = {a1,a2};
        Assertions.assertThrows(ClassCastException.class,
                ()->Arrays.sort(arr)
        );
    }

    @Test
    public void test_that_sort_with_comparator() {
        CurrencyAmount a1 = new CurrencyAmount(BigDecimal.ONE, Currency.USD);
        CurrencyAmount a2 = new CurrencyAmount(BigDecimal.ONE, Currency.EUR);
        CurrencyAmount[] arr = {a1,a2};
        Arrays.sort(arr, new AmountComparator());

        Assertions.assertEquals(Currency.EUR, arr[0].getCurrency());
    }

    @Test
    public void test_that_sort_with_comparator_diff() {
        CurrencyAmount a1 = new CurrencyAmount(BigDecimal.ONE, Currency.USD);
        CurrencyAmount a2 = new CurrencyAmount(BigDecimal.ONE, Currency.EUR);
        CurrencyAmount[] arr = {a1,a2};
        class AmountComparator implements Comparator<CurrencyAmount>{
            @Override
            public int compare(CurrencyAmount o1, CurrencyAmount o2) {
                return o1.getAmount().compareTo(o2.getAmount());
            }
        }
        Arrays.sort(arr, new AmountComparator());
        Assertions.assertEquals(Currency.USD, arr[0].getCurrency());
    }

    class AmountComparator implements Comparator<CurrencyAmount>{
        @Override
        public int compare(CurrencyAmount o1, CurrencyAmount o2) {
            if(o1.getCurrency() == o2.getCurrency()){
                return o1.getAmount().compareTo(o2.getAmount());
            }
            CurrencyAmount.CurrencyConverter converter = o1.new CurrencyConverter();
            CurrencyAmount a = converter.convert(o2.getCurrency());
            return a.getAmount().compareTo(o2.getAmount());
        }
    }
}
