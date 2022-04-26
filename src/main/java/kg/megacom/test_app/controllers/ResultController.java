package kg.megacom.test_app.controllers;

import kg.megacom.test_app.models.dto.ResultDto;
import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Result;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/result")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping("/save")
    public ResultDto save(@RequestBody ResultDto resultDto){
        return resultService.save(resultDto);
    }

    @GetMapping("/getById")
    public ResultDto findById(@RequestParam Long id){
        return resultService.findById(id);
    }

    @PutMapping("/update")
    public ResultDto update(@RequestBody ResultDto resultDto){
        return resultService.update(resultDto);
    }
    @PutMapping("/delete")
    public ResultDto delete(@RequestBody ResultDto resultDto){
        return resultService.delete(resultDto);
    }

}
