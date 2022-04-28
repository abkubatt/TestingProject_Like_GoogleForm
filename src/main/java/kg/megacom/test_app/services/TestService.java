package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.dto.json.TestCreateJson;
import kg.megacom.test_app.models.dto.json.TestResultJson;

import java.util.List;

public interface TestService {

    TestDto save(TestDto testDto);

    TestDto findById(Long id);

    TestDto update(TestDto testDto);

    TestDto delete(TestDto testDto);

    List<TestDto> findAllByActive();

    TestResultJson createNewTest(TestCreateJson createJson);
}
