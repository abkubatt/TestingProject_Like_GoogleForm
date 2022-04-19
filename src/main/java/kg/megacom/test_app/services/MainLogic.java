package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.json.TestCreateJson;
import kg.megacom.test_app.models.dto.json.TestResultJson;

public interface MainLogic {

    TestResultJson createNewJson(TestCreateJson testCreateJson);
}
