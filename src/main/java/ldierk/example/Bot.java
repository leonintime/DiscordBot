package ldierk.example;

import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.lifecycle.ReadyEvent;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.Ban;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;

import java.util.Locale;

public class Bot {

    public String getToken() {
        return "ODU4MDQ5MjIwMTE1ODI0Njkw.YNYemw.RTqh1PfdSwWi4P8q0eQdg528LNw";
    }



    public static void main(String[] args) {
        Bot bot = new Bot();
        GatewayDiscordClient client = DiscordClientBuilder.create(bot.getToken())
                .build()
                .login()
                .block();


        assert client != null;
        client.getEventDispatcher().on(ReadyEvent.class)
                .subscribe(event -> {
                    final User self = event.getSelf();
                    System.out.printf(
                            "Logged in as %s#%s%n", self.getUsername(), self.getDiscriminator()
                    );
                });


        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().equalsIgnoreCase("!ping"))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage("Pong!"))
                .subscribe();


        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().equalsIgnoreCase("!pie"))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage(":yum:"))
                .subscribe();




        //Insults



        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("hurensohn"))
                .flatMap(Message::delete)
                .subscribe();




        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("arschloch"))
                .flatMap(Message::delete)
                .subscribe();




        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("pisser"))
                .flatMap(Message::delete)
                .subscribe();






        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().toLowerCase(Locale.ROOT).contains("nigger"))
                .flatMap(Message::delete)
                .subscribe();





        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("fotze"))
                .flatMap(Message::delete)
                .subscribe();






        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("cunt"))
                .flatMap(Message::delete)
                .subscribe();






        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("bitch"))
                .flatMap(Message::delete)
                .subscribe();






        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().toLowerCase(Locale.ROOT).contains("asshole"))
                .flatMap(Message::delete)
                .subscribe();



        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().toLowerCase(Locale.ROOT).contains("faggot"))
                .flatMap(Message::delete)
                .subscribe();




        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("slut"))
                .flatMap(Message::delete)
                .subscribe();


        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("wichser"))
                .flatMap(Message::delete)
                .subscribe();

        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message ->  message.getContent().toLowerCase(Locale.ROOT).contains("fick dich"))
                .flatMap(Message::delete)
                .subscribe();


        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().toLowerCase(Locale.ROOT).contains("fuck you"))
                .flatMap(Message::delete)
                .subscribe();

        client.getEventDispatcher().on(MessageCreateEvent.class)
                .map(MessageCreateEvent::getMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().equalsIgnoreCase("!help"))
                .flatMap(Message::getChannel)
            .flatMap(channel -> channel.createMessage("Alle commands: \n!ping \n!pie"))
                .subscribe();


//        client.getEventDispatcher().on(MessageCreateEvent.class)
//                .map(MessageCreateEvent::getMessage)
//                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
//                .filter(message -> message.getContent().equalsIgnoreCase("!move " + message.getAuthor()))
//                .flatMap(Message::getChannel)
//                .flatMap(channel -> channel.createMessage(""))
//                .subscribe();





        client.onDisconnect().block();

    }




}
