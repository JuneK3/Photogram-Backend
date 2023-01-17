package com.rootlab.photogram.handler;

import com.rootlab.photogram.handler.exception.CustomValidationException;
import com.rootlab.photogram.util.GoBackToPreviousPage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(CustomValidationException.class)
    public String validationExceptionHandler(CustomValidationException e) {
//        return new CommonResponseDto<>(-1, e.getMessage(), e.getErrorMap());
        return GoBackToPreviousPage.alert(e.getErrorMap().toString());
    }
}