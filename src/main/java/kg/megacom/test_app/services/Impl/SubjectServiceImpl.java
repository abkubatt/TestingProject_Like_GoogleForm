package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.dao.SubjectDao;
import kg.megacom.test_app.mappers.LanguageMapper;
import kg.megacom.test_app.mappers.SubjectMapper;
import kg.megacom.test_app.models.dto.LanguageDto;
import kg.megacom.test_app.models.dto.SubjectDto;
import kg.megacom.test_app.models.entities.Language;
import kg.megacom.test_app.models.entities.Subject;
import kg.megacom.test_app.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    private SubjectMapper subjectMapper = SubjectMapper.INSTANCE;
    private LanguageMapper languageMapper = LanguageMapper.INSTANCE;

    @Override
    public SubjectDto save(SubjectDto subjectDto) {
        Subject subject = subjectMapper.subjectDtoToSubject(subjectDto);
        subject.setActive(true);
        Subject subjectSaved = subjectDao.save(subject);
        return subjectMapper.subjectToSubjectDto(subjectSaved);
    }

    @Override
    public SubjectDto findById(Long id) {
        Subject subject = subjectDao.findById(id).orElse(null);
        return subjectMapper.subjectToSubjectDto(subject);
    }

    @Override
    public SubjectDto update(SubjectDto subjectDto) {
        boolean isExists = subjectDao.existsById(subjectDto.getId());
        if (!isExists){
            return null;
        }
        else{
            Subject subject = subjectMapper.subjectDtoToSubject(subjectDto);
            Subject updatedSubject = subjectDao.save(subject);
            return subjectMapper.subjectToSubjectDto(updatedSubject);
        }
    }


    @Override
    public SubjectDto delete(SubjectDto subjectDto) {
        Subject subject = subjectMapper.subjectDtoToSubject(subjectDto);
        subject.setActive(false);
        SubjectDto deletedSubject = update(subjectMapper.subjectToSubjectDto(subject));
        return deletedSubject;
    }


    @Override
    public List<SubjectDto> findAllByLanguage(LanguageDto languageDto) {
        List<Subject> subjects = subjectDao.findAllByLanguageAndIsAndActiveTrue(languageDto.getId());
        return subjectMapper.subjectListToSubjectDtoList(subjects);
    }
}
