package use_case.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearOutputData {
    private final ArrayList<String> deleted;

    public ClearOutputData(ArrayList<String> deletedUsers){
        this.deleted = deletedUsers;
    }

    public ArrayList<String> getDeleted(){return deleted;}

}
