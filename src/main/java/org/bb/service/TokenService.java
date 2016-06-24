package org.bb.service;

import org.bb.entity.Token;
import org.bb.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TokenService {

    @Autowired
    TokenRepository tokenRepository;


    public Token saveToken(Token token) {

        return tokenRepository.save(token);
    }

    public Token retrieveToken(Long userId) {
        List<Token> tokens = tokenRepository.findByUserId(userId);

        return tokens.get(0);
    }
}
