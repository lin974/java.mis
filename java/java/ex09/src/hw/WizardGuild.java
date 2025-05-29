package hw;

import java.util.List;
import java.util.ArrayList;

public class WizardGuild {
    
    private List<Wizard> wizards = new ArrayList<>();

    
    public void addWizard(Wizard wizard) {
        wizards.add(wizard);
    }

    
    public Wizard findWizardByName(String name) {
        for (Wizard w : wizards) {
            if (w.getName().equals(name)) {
                return w;
            }
        }
        return null;
    }
    public void removeWizardByName(String name){
         for (Wizard w : wizards) {
            if (w.getName().equals(name)) {
                wizards.remove(w);
            }
        }

    }
    public void listAllWizards(){
          for (Wizard w : wizards) {
            System.out.println(w);
    
         }
    }
    public void castGuildSpell(){
        for (Wizard w : wizards) {
                System.out.println(w.castSpell());
            }

    }
    
}
