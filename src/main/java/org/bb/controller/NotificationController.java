package org.bb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/random/send/")
public class NotificationController {

    @RequestMapping(value = "/{param}", method = RequestMethod.POST)
    public ResponseEntity<String> getMessage(@PathVariable("param") String param) {

        return new ResponseEntity<>(param, HttpStatus.OK);
    }
}
