package br.com.diogo.rest_with_spring_boot_java_erudio.controllers;

import br.com.diogo.rest_with_spring_boot_java_erudio.execptions.UnsuportedMathOperationException;
import br.com.diogo.rest_with_spring_boot_java_erudio.services.NumberHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SquareRootController {
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/squareRoot/{number|", method = RequestMethod.GET)
    public double squareRoot(@PathVariable(value = "number") String number) throws Exception {
        if (!NumberHandler.isNumeric(number) ) {
            throw new UnsuportedMathOperationException("the numeric parameter must be numeric.");
        }
        return Math.sqrt(NumberHandler.convertNumber(number));
    }
}
