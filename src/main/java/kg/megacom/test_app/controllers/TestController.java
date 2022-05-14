package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.dto.json.check.CheckRequestBody;
import kg.megacom.test_app.models.dto.json.check.CheckResponsoBody;
import kg.megacom.test_app.models.dto.json.get.PreparedTest;
import kg.megacom.test_app.models.dto.json.create.TestCreateJson;
import kg.megacom.test_app.models.dto.json.create.TestResultJson;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @Autowired
    private TestService testService;


    @PostMapping("/save")
    public TestDto save(@RequestBody TestDto testDto) {
        return testService.save(testDto);
    }

    @GetMapping("/getById")
    public TestDto findById(@RequestParam Long id) {
        return testService.findById(id);
    }

    @PutMapping("/update")
    public TestDto update(@RequestBody TestDto testDto) {
        return testService.update(testDto);
    }

    @PutMapping("/delete")
    public TestDto delete(@RequestBody TestDto testDto) {
        return testService.delete(testDto);
    }

    @GetMapping("/findAllByActive")
    public List<TestDto> findAllByActive() {
        return testService.findAllByActive();
    }

    @PostMapping("/createNewTest")
    public TestResultJson createNewTest(@RequestBody TestCreateJson createJson) {
        return testService.createNewTest(createJson);
    }
    @GetMapping("/getTestById")
    public PreparedTest getTestById(@RequestParam Long testId){
        return testService.getTestById(testId);
    }

    @PutMapping("checkTest")
    public CheckResponsoBody checkTest(@RequestBody CheckRequestBody checkRequestBody){
        return testService.checkTest(checkRequestBody);
    }
}

