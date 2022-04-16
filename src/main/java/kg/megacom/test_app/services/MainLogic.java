package kg.megacom.test_app.services;

import kg.megacom.test_app.models.json.TestCreateJson;
import kg.megacom.test_app.models.json.TestResultJson;

public interface MainLogic {

    TestResultJson createNewJson(TestCreateJson testCreateJson);
}
