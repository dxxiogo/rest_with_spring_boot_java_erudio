package br.com.diogo.rest_with_spring_boot_java_erudio.execptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedMathOperationException extends RuntimeException{

    public UnsuportedMathOperationException (String ex) {
        super(ex);
    }
    @Serial
    private static final long serialVersionUID = 1L;
}
