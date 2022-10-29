package mao.hibernate_validator_demo;

import mao.hibernate_validator_demo.config.EnableFormValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFormValidator
public class HibernateValidatorDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(HibernateValidatorDemoApplication.class, args);
    }

}
