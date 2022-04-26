package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.TestSubjectDao;
import kg.megacom.test_app.mappers.TestSubjectMapper;
import kg.megacom.test_app.models.dto.TestSubjectDto;
import kg.megacom.test_app.models.entities.TestSubject;
import kg.megacom.test_app.services.TestSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSubjectServiceImpl implements TestSubjectService {
    @Autowired
    private TestSubjectDao testSubjectDao;
    private TestSubjectMapper testSubjectMapper = TestSubjectMapper.INSTANCE;
    @Override
    public TestSubjectDto save(TestSubjectDto testSubjectDto) {
        TestSubject testSubject = testSubjectMapper.testSubjectDtoToTestSubject(testSubjectDto);
        testSubject.setActive(true);
        TestSubject testSubjectSaved = testSubjectDao.save(testSubject);
        return testSubjectMapper.testSubjectToTestSubjectDto(testSubjectSaved);
    }

    @Override
    public TestSubjectDto findById(Long id) {
        TestSubject testSubject = testSubjectDao.findById(id).orElse(null);
        return testSubjectMapper.testSubjectToTestSubjectDto(testSubject);
    }

    @Override
    public TestSubjectDto update(TestSubjectDto testSubjectDto){
        boolean isExists = testSubjectDao.existsById(testSubjectDto.getId());
        if (!isExists){
            return null;
        }else{
            TestSubject testSubject = testSubjectMapper.testSubjectDtoToTestSubject(testSubjectDto);
            TestSubject updatedTestSubject = testSubjectDao.save(testSubject);
            return testSubjectMapper.testSubjectToTestSubjectDto(updatedTestSubject);
        }
    }

    @Override
    public TestSubjectDto delete(TestSubjectDto testSubjectDto) {
        TestSubject testSubject = testSubjectMapper.testSubjectDtoToTestSubject(testSubjectDto);
        testSubject.setActive(false);
        TestSubjectDto deletedTestSubject = update(testSubjectMapper.testSubjectToTestSubjectDto(testSubject));
        return deletedTestSubject;
    }
}
