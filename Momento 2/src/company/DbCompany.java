package company;

import java.util.ArrayList;
import java.util.List;

public class DbCompany {
    private List<WatchMan> watchMans;
    private List<CleaningStaff> cleaningStaffs;
    private List<Accountant> accountants;
    private List<Admin> admins;
    
    public DbCompany(){
        watchMans = new ArrayList<>();
        cleaningStaffs = new ArrayList<>();
        accountants = new ArrayList<>();
        admins = new ArrayList<>();
    }
    
    public void setWatchMan(WatchMan watchMans){
        this.watchMans.add(watchMans);
    }
    
    public void setCleaningStaff(CleaningStaff cleaningStaffs){
        this.cleaningStaffs.add(cleaningStaffs);
    }
    
    public void setAccountat(Accountant accountants){
        this.accountants.add(accountants);
    }
    
    public void setAdmin(Admin admins){
        this.admins.add(admins);
    }

    public List<WatchMan> getWatchMans() {
        return watchMans;
    }

    public void setWatchMans(List<WatchMan> watchMans) {
        this.watchMans = watchMans;
    }

    public List<CleaningStaff> getCleaningStaffs() {
        return cleaningStaffs;
    }

    public void setCleaningStaffs(List<CleaningStaff> cleaningStaffs) {
        this.cleaningStaffs = cleaningStaffs;
    }

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void setAccountants(List<Accountant> accountants) {
        this.accountants = accountants;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }
    
    
    
}
