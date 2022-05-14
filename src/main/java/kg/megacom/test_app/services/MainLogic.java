package kg.megacom.test_app.services;

import kg.megacom.test_app.models.dto.json.create.TestCreateJson;
import kg.megacom.test_app.models.dto.json.create.TestResultJson;

public interface MainLogic {

    TestResultJson createNewJson(TestCreateJson testCreateJson);
}
