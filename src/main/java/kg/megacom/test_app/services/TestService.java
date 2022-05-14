package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.dto.json.check.CheckRequestBody;
import kg.megacom.test_app.models.dto.json.check.CheckResponsoBody;
import kg.megacom.test_app.models.dto.json.get.PreparedTest;
import kg.megacom.test_app.models.dto.json.create.TestCreateJson;
import kg.megacom.test_app.models.dto.json.create.TestResultJson;

import java.util.List;

public interface TestService {

    TestDto save(TestDto testDto);

    TestDto findById(Long id);

    TestDto update(TestDto testDto);

    TestDto delete(TestDto testDto);

    List<TestDto> findAllByActive();

    TestResultJson createNewTest(TestCreateJson createJson);

    PreparedTest getTestById(Long testId);

    CheckResponsoBody checkTest(CheckRequestBody checkRequestBody);
}
