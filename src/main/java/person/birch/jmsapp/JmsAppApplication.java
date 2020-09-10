package person.birch.jmsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsAppApplication {


    public static void main(String[] args) throws Exception {

//        ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//            .setPersistenceEnabled(false)
//            .setJournalDirectory("target/data/journal")
//            .setSecurityEnabled(false)
//            .addAcceptorConfiguration("ivm", "vm://0"));
//
//        server.start();

        SpringApplication.run(JmsAppApplication.class, args);
    }

}
