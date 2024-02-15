```
package com.epam.edp.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Global exception handler for the application.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public ResponseEntity<String> handleAllExceptions(Exception ex) {
        // Log the exception details...
        return ResponseEntity.internalServerError().body(ex.getMessage());
    }
}
```