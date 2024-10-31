package br.com.diogo.rest_with_spring_boot_java_erudio.controllers;

import br.com.diogo.rest_with_spring_boot_java_erudio.execptions.UnsuportedMathOperationException;
import br.com.diogo.rest_with_spring_boot_java_erudio.services.NumberHandler;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SumController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!NumberHandler.isNumeric(numberOne) || !NumberHandler.isNumeric(numberTwo)) {
            throw new UnsuportedMathOperationException("Both parameters must be numeric.");
        }
        return NumberHandler.convertNumber(numberOne) + NumberHandler.convertNumber(numberTwo);
    }


}
