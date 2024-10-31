package br.com.diogo.rest_with_spring_boot_java_erudio.controllers;

import br.com.diogo.rest_with_spring_boot_java_erudio.execptions.UnsuportedMathOperationException;
import br.com.diogo.rest_with_spring_boot_java_erudio.services.NumberHandler;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class AvarageController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping(value = "/avarage/", method = RequestMethod.GET)
    public double avarage(@RequestParam Map<String, String> values) throws Exception {

        int count = 0;
        double sum = 0;

        values.forEach((key, value) -> {
            if (!NumberHandler.isNumeric(value)) {
                throw new UnsuportedMathOperationException("Both parameters must be numeric.");
            }
        });

        return 0;
    }




}
