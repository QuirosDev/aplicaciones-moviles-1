package herenciaarraylist;

import java.util.ArrayList;
import java.util.List;

public class DbShop {
    private List<Cpu> cpus;
    private List<Monitor> monitores;
    private List<Mouse> mice;
    
    public DbShop(){
        cpus = new ArrayList<>();
        monitores = new ArrayList<>();
        mice = new ArrayList<>();
    }
    
    public void setCpu(Cpu cpu){
        cpus.add(cpu);
    }
    
    public void setMonitor(Monitor monitor){
        monitores.add(monitor);
    }
    
    public void setMouse(Mouse mice){
        this.mice.add(mice);
    }
    
    public List<Cpu> getCpus() {
        return cpus;
    }

    public void setCpus(List<Cpu> cpus) {
        this.cpus = cpus;
    }

    public List<Monitor> getMonitores() {
        return monitores;
    }

    public void setMonitores(List<Monitor> monitores) {
        this.monitores = monitores;
    }

    public List<Mouse> getMice() {
        return mice;
    }

    public void setMice(List<Mouse> mice) {
        this.mice = mice;
    }
    
    

}
