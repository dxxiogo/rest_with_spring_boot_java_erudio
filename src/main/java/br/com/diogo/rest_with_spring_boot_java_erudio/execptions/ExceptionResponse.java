package br.com.diogo.rest_with_spring_boot_java_erudio.execptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Date date;
    private String message;
    private String details;
}
