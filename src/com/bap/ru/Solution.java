package com.bap.ru;

import com.bap.ru.controller.Controller;
import com.bap.ru.model.MainModel;
import com.bap.ru.model.Model;
import com.bap.ru.view.EditUserView;
import com.bap.ru.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126l);
        editUserView.fireEventUserDeleted(124l);
        editUserView.fireEventUserChanged("Mombarov", 123l, 3);
        usersView.fireEventShowDeletedUsers();
        
    }
}