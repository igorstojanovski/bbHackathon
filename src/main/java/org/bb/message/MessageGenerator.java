package org.bb.message;

import com.google.android.gcm.server.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageGenerator {

    public Message getMessage(String param) {
        Message message = null;

        if ("2".equals(param)) {
            message = new Message.Builder()
                    .addData("message", "big sale!")
                    .addData("title", "Clarks Sale tot 50%")
                    .addData("route", "2")
                    .addData("id", "2")
                    .build();
        } else if ("3".equals(param)) {
            message = new Message.Builder()
                    .addData("message", "Heineken promotion")
                    .addData("title", "15% off in Molly Malone's Irish Pub")
                    .addData("route", "3")
                    .addData("id", "3")
                    .build();
        }

        return message;
    }
}
