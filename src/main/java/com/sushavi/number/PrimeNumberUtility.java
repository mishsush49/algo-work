package com.sushavi.number;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrimeNumberUtility {
    public static void main(String[] args) {
        log.info("Here we are checking if a number is Prime or not");

        int number = 7;
        boolean isPrime = isPrimeNumber(number);
        log.info("Is " + number + " a Prime Number? " + isPrime);

    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}