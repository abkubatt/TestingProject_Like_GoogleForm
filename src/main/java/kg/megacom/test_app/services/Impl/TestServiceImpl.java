package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestDao;
import kg.megacom.test_app.mappers.TestMapper;
import kg.megacom.test_app.models.dto.TestDto;
import kg.megacom.test_app.models.entities.Test;
import kg.megacom.test_app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    private TestMapper testMapper = TestMapper.INSTANCE;


    @Override
    public TestDto save(TestDto testDto) {
        Test test = testMapper.testDtoToTest(testDto);
        test.setActive(true);
        Test testSaved = testDao.save(test);
        return testMapper.testToTestDto(testSaved);
    }

    @Override
    public TestDto findById(Long id) {
        Test test = testDao.findById(id).orElse(null);
        return testMapper.testToTestDto(test);
    }

    @Override
    public TestDto update(TestDto testDto) {
        boolean isExists = testDao.existsById(testDto.getId());
        if (!isExists){
            return null;
        }else{
            Test test = testMapper.testDtoToTest(testDto);
            Test updatedTest = testDao.save(test);
            return testMapper.testToTestDto(updatedTest);
        }
    }

    @Override
    public TestDto delete(TestDto testDto) {
        Test test = testMapper.testDtoToTest(testDto);
        test.setActive(false);
        TestDto deletedTest = update(testMapper.testToTestDto(test));
        return deletedTest;
    }

    @Override
    public List<TestDto> findAllByActive() {
        List<Test> tests = testDao.findAllByActive();
        return testMapper.testListToTestDtoList(tests);
    }
}
