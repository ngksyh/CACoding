package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {

    final ClearInputBoundary userClearUseCaseInteractor;

    public ClearController(ClearInputBoundary userClearUseCaseInteractor){
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;

    }

    public void execute(){
        userClearUseCaseInteractor.execute();
    }


}
