package com.example.conference;

import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {


//
//    @Bean(name= "speakerServiceBean")
//    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //to explicitly define it as singleton. note that it is by default a signleton bean.
//    public SpeakerService getSpeakerServiceBean(){
////        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepositoryBean());
////        service.setRepository(getSpeakerRepositoryBean());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        return service;
//    } // now why didnt we just placed new HibernateSpeakerRepoImpl instead of getSpeakerRepositoryBean on line 14?
//      // well, because it will be only created once as it is a singleton bean. if u call 100 times, it will create the same bean
//
//
//    @Bean(name = "speakerRepositoryBean")
//    public SpeakerRepository getSpeakerRepositoryBean(){
//        return new HibernateSpeakerRepositoryImpl();
//    }
}
