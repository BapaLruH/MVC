package com.bap.ru;

import com.bap.ru.controller.Controller;
import com.bap.ru.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
