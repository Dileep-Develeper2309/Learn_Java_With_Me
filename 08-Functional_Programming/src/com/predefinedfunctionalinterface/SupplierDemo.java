package com.predefinedfunctionalinterface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //it always returns data

        Supplier<Integer> getCurrentMonth = () -> LocalDate.now().getMonthValue();

        System.out.println(getCurrentMonth.get());
    }
}
