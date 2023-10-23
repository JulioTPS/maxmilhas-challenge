// package com.maxmilhas.controllers.errors;

// import java.sql.SQLIntegrityConstraintViolationException;

// import org.springframework.core.Ordered;
// import org.springframework.core.annotation.Order;
// import org.springframework.data.mongodb.core.MongoDataIntegrityViolationException;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// import jakarta.servlet.http.HttpServletRequest;

// @Order(Ordered.HIGHEST_PRECEDENCE)
// @ControllerAdvice()
// public class RestExeptionHandler extends ResponseEntityExceptionHandler{
    
//     @ExceptionHandler(IllegalStateException.class)
//     public ResponseEntity<Object> InvalidCpfException(HttpServletRequest req, MongoDataIntegrityViolationException ex){
//         String error = "Cpf invalido: " + ex;
//         return buildResponseEntity(new ErrorResponse(HttpStatus.BAD_REQUEST, error));
//     }

//     @ExceptionHandler(IllegalStateException.class)
//     public ResponseEntity<Object> ExistsCpfException(HttpServletRequest req, MongoDataIntegrityViolationException ex){
//         ErrorResponse response = new ErrorResponse(HttpStatus.CONFLICT);
//         response.setMessage("Cpf já existente: " + ex);
//         return buildResponseEntity(response);
//     }

//     private ResponseEntity<Object> buildResponseEntity(ErrorResponse errorResponse){
//         return new ResponseEntity<Object>(errorResponse, errorResponse.getStatus());
//     }
// }
