package com.bnta.chocolate.config;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Dataloader implements ApplicationRunner {
    /*
       Spring 'glues' DBSeder with the implementation of CustomerRepository
       provided by the Spring Data Jpa project
    */
    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate e1 = new Estate("Definitely not cocaine", "Columbia");
        Estate e2 = new Estate("Equanimious", "Ecuador");
        Estate e3 = new Estate("", "Peru");
        Estate e4 = new Estate("","");
        Estate e5 = new Estate("","");

        Chocolate c1 = new Chocolate("",25,e1);
        Chocolate c12 = new Chocolate("",25,e1);
        Chocolate c13 = new Chocolate("",25,e1);
        Chocolate c14 = new Chocolate("",25,e1);
        Chocolate c2 = new Chocolate("",25,e2);
        Chocolate c21 = new Chocolate("",25,e2);
        Chocolate c22 = new Chocolate("",25,e2);
        Chocolate c23 = new Chocolate("",25,e2);
        Chocolate c24 = new Chocolate("",25,e2);
        Chocolate c25 = new Chocolate("",25,e2);
        Chocolate c3 = new Chocolate("",25,e3);
        Chocolate c31 = new Chocolate("",25,e3);
        Chocolate c32 = new Chocolate("",25,e3);
        Chocolate c33 = new Chocolate("",25,e3);
        Chocolate c34 = new Chocolate("",25,e3);
        Chocolate c35 = new Chocolate("",25,e3);
        Chocolate c36 = new Chocolate("",25,e3);
        Chocolate c37 = new Chocolate("",25,e3);
        Chocolate c38 = new Chocolate("",25,e3);
        Chocolate c39 = new Chocolate("",25,e3);
        Chocolate c30 = new Chocolate("",25,e3);
        Chocolate c311 = new Chocolate("",25,e3);
        Chocolate c4 = new Chocolate("",25,e4);
        Chocolate c41 = new Chocolate("",25,e4);
        Chocolate c42 = new Chocolate("",25,e4);
        Chocolate c43 = new Chocolate("",25,e4);
        Chocolate c5 = new Chocolate("",25,e5);
        Chocolate c51 = new Chocolate("",25,e5);
        Chocolate c52 = new Chocolate("",25,e5);
        Chocolate c53 = new Chocolate("",25,e5);
        Chocolate c54 = new Chocolate("",25,e5);
        Chocolate c55 = new Chocolate("",25,e5);

        e1.setChocolates(List.of(c1,c12,c13,c14));
        e2.setChocolates(List.of(c2,c21,c22,c23,c24,c25));
        e3.setChocolates(List.of(c3,c31,c311,c32,c33,c34,c35,c36,c37,c38,c39,c30));
        e4.setChocolates(List.of(c4,c41,c42,c43));
        e5.setChocolates(List.of(c5,c51,c52,c53,c54,c55));

        estateRepository.saveAll(List.of(e1,e2,e3,e4,e5));


    }
}