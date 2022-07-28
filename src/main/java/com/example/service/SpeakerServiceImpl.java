package com.example.service;

import com.example.model.Speaker;
import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerServiceBean")
public class SpeakerServiceImpl implements SpeakerService {



    private SpeakerRepository repository;


    public SpeakerServiceImpl(){
        System.out.println("Im in the no arg Constructor!");
    }
    public SpeakerServiceImpl(SpeakerRepository _speakerRepository){
        repository= _speakerRepository;
    }

    @Override
    public List<Speaker> findall(){

        return repository.findall();

    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("Im in the setter!");
        this.repository = repository;
    }
}
