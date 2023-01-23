package br.com.erudio.controllers;

import br.com.erudio.exceptions.UnsuportedMathOperationException;
import br.com.erudio.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/math")
public class MathController {

    private static final AtomicLong counter = new AtomicLong();

    @Autowired
    MathService mathService;

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.sum(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    @GetMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.sub(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    @GetMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.mult(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    @GetMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.div(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    @GetMapping("/med/{numberOne}/{numberTwo}")
    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.med(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    @GetMapping("/quad/{number}")
    public Double quad(
            @PathVariable(value = "number") String number
    ) throws Exception{
        if (!mathService.isNumeric(number)) {
            throw new UnsuportedMathOperationException("Please set a numeric value!");
        }
        return mathService.quad(mathService.convertToDouble(number));
    }

}
