package com.example.iprwc_springapi.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    private boolean alreadySeeded = false;

    @Autowired
    private ProductSeeder productSeeder;


    @EventListener
    public void seed(ContextRefreshedEvent event){
        if(alreadySeeded){
            return;
        }

        productSeeder.seed();
        
        this.alreadySeeded = true;
    }
}