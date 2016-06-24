package org.bb.controller;

import org.bb.entity.Token;
import org.bb.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Token> setToken(@RequestBody Token token) {
        Token newToken = tokenService.saveToken(token);

        return new ResponseEntity<>(newToken, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/userid")
    public ResponseEntity<Token> getToken(@RequestParam Long userId) {
        Token token = tokenService.retrieveToken(userId);

        return new ResponseEntity<>(token, HttpStatus.OK);
    }
}
