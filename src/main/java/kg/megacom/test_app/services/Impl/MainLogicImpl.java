package kg.megacom.test_app.services.Impl;

import kg.megacom.test_app.models.dto.json.create.TestCreateJson;
import kg.megacom.test_app.models.dto.json.create.TestResultJson;
import kg.megacom.test_app.services.MainLogic;
import org.springframework.stereotype.Service;

@Service
public class MainLogicImpl implements MainLogic {
    @Override
    public TestResultJson createNewJson(TestCreateJson testCreateJson) {
        return null;
    }
}
