package tn.esprit.pidev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import tn.esprit.pidev.services.EmailSenderService;

@SpringBootApplication
@EnableAspectJAutoProxy  //activer l'aspect
@EnableScheduling //activer scheduling
public class PidevApplication {

    @Autowired
    private EmailSenderService senderService;

    public static void main(String[] args) {
        SpringApplication.run(PidevApplication.class, args);
    }



}
