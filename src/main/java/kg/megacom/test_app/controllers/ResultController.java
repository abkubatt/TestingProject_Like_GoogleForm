package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("result")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @GetMapping
    public String toSaveResult(){
        Result result = new Result();
        result.setResult("you completed an internship");
        result.setDate(new Date());
        result.setTest(new Test());
        result.setTestUser("Abdulmajit Kubatbekov");

        Result savedResult = resultService.save(result);
        return savedResult.getResult();
    }
}
