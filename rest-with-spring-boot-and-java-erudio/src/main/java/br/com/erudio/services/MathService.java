package br.com.erudio.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Double convertToDouble(String strNumber) {
        if (strNumber.isBlank()) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public boolean isNumeric(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double mult(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double med(Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo)/2;
    }

    public Double quad(Double number) {
        return Math.sqrt(number);
    }
}
