package hello;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        LinkedTransferQueue l;
    }


}