package com.codewithdurgesh.blog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/")
    @ResponseBody
    public String home() {
        String swaggerLink = "<a href=\"/swagger-ui/index.html\">Click here to access Swagger API documentation</a>";
        String message = "<html><body style=\"background-color: #f2f2f2; text-align: center; padding: 40px;\">"
                + "<h1>Welcome to Piyush Blogging Application page!</h1>"
                + "<p>" + swaggerLink + "</p>"
                + "</body></html>";
        return message;
    }

}
