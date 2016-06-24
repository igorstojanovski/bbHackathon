package org.bb.repository;


import org.bb.entity.Token;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TokenRepository extends Repository<Token, Long> {


    List<Token> findByUserId(Long userId);

    Token save(Token token);
}
