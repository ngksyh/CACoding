package use_case.clear_users;

// TODO Complete me

import entity.UserFactory;
import use_case.signup.SignupOutputBoundary;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                                ClearOutputBoundary clearOutputBoundary){
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        ArrayList<String> deleted;
        deleted = userDataAccessObject.clear();

        ClearOutputData clearOutputData = new ClearOutputData(deleted);
        userPresenter.prepareSuccessView(clearOutputData);
    }
}
