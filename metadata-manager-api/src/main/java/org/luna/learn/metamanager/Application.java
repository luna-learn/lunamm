package org.luna.learn.metamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Application
{
    // org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Application.class, args);
    }
}
