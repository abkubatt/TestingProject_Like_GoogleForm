package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/save")
    public String testSaveTest(){
        TestDto test = new TestDto();
        test.setName("Java");
        test.setNavi_user("Sanzhar");

        TestDto savedTest = testService.save(test);

        return savedTest.getName();
    }
}
