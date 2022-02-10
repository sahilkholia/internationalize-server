package com.server.internationalize.controller;
import com.server.internationalize.entity.Survey;
import com.server.internationalize.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/survey")
public class Controller {
    @Autowired
    SurveyRepo surveyRepo;

    //add data
    @PostMapping
    public Survey addSurvey(@RequestBody Survey survey){
        return surveyRepo.save(survey);
    }

    //Get all surveys
    @GetMapping
    public List<Survey> getSurvey(){
        return surveyRepo.findAll();
    }

    //Initial Data
    @PostConstruct
    public void initialData(){
        Survey s = new Survey("On a scale from 1 to 5, how much do you like coffee?", "1 से 5 के पैमाने पर आप कितना कॉफी पसंद करते हैं?", "En una escala del 1 al 5, ¿cuánto te gusta el café?");
        surveyRepo.save(s);
        s = new Survey("On a scale from 1 to 5, how physically active are you?", "1 से 5 के पैमाने पर आप कितने शारीरिक रूप से सक्रिय हैं?", "En una escala del 1 al 5, ¿qué tan activo eres físicamente?");
        surveyRepo.save(s);
    }

}
