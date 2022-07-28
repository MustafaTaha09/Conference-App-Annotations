package com.example.conference;

import com.example.model.Speaker;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConferenceApplication {

    public static void main(String[] args) {

//        SpeakerService service = new SpeakerServiceImpl();
//
//        System.out.println(service.findall().get(0).getFirstName());
//
//        SpringApplication.run(ConferenceApplication.class, args);

      //setter injection with app configuration
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        SpeakerService service = appContext.getBean("speakerServiceBean", SpeakerService.class);
//
//        System.out.println(service.findall().get(0).getLastName());

        //Constructor injection using appConfig
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        SpeakerService service = appContext.getBean("speakerServiceBean", SpeakerService.class);
//
//        System.out.println(service.findall().get(0).getFirstName());

      //singleton/prototype test
//       ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        SpeakerService service = appContext.getBean("speakerServiceBean", SpeakerService.class);
//        SpeakerService service2 = appContext.getBean("speakerServiceBean", SpeakerService.class);
//
//        System.out.println(service);
//        System.out.println(service2);

       //Autowired setter
//        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        SpeakerService service = appContext.getBean("speakerServiceBean", SpeakerService.class);
//
//        System.out.println(service.findall().get(0).getFirstName());

        //We dont need to define each bean. we can simply define each class with its appropriate annotation
        //like Service or Repository. Then we should add componentScan at the level of the package
        // Note: @Component = @Bean
    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
    SpeakerService service = appContext.getBean("speakerServiceBean", SpeakerService.class);

        System.out.println(service.findall().get(0).getFirstName());
    }

}
