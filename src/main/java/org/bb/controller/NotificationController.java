package org.bb.controller;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import org.bb.entity.Token;
import org.bb.message.MessageGenerator;
import org.bb.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/random/send/")
public class NotificationController {

    @Autowired
    TokenService tokenService;

    @Autowired
    MessageGenerator messageGenerator;

    @RequestMapping(value = "/{param}", method = RequestMethod.POST)
    public ResponseEntity<String> sendMessage(@PathVariable("param") String param) throws IOException {

        Token token = tokenService.retrieveToken((long) 1);

        Sender sender = new Sender("AIzaSyDKCQ7aOEVJ4F5EF9QBRc_F3xDSC8DGC8M");
        Message message = messageGenerator.getMessage(param);
        Result result = sender.send(message, token.getToken(), 3);

        return new ResponseEntity<>(result.getMessageId(), HttpStatus.OK);
    }
}
