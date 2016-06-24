package org.bb.message;

import com.google.android.gcm.server.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class MessageGenerator {

    private ArrayList<Message> messages = getMessages();
    private Random random = new Random();

    public Message generateRandomMessage() {
        return messages.get(random.nextInt(messages.size()));
    }


    public ArrayList<Message> getMessages() {

        ArrayList<Message> list = new ArrayList<>();

        list.add(new Message.Builder()
                .addData("message", "this is the message")
                .addData("title", "20% off in ZARA")
                .addData("route", "")
                .addData("other-parameter", "some value")
                .build());

        list.add(new Message.Builder()
                .addData("message", "this is the message")
                .addData("title", "50% off in Target")
                .addData("route", "")
                .addData("other-parameter", "some value")
                .build());

        list.add(new Message.Builder()
                .addData("message", "this is the message")
                .addData("title", "51% for Brexit ! ! ! ")
                .addData("route", "")
                .addData("other-parameter", "some value")
                .build());

        list.add(new Message.Builder()
                .addData("message", "this is the message")
                .addData("title", "VMROOO")
                .addData("route", "")
                .addData("other-parameter", "some value")
                .build());
        return list;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}