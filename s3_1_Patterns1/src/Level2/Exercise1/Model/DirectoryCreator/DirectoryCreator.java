package Level2.Exercise1.Model.DirectoryCreator;

import Level2.Exercise1.Model.Agenda;
import Level2.Exercise1.Model.Factories.DirectoriesFactory;

public class DirectoryCreator {

    public void insertAddressAndPhone (Agenda agenda, DirectoriesFactory factory){
        agenda.addAddress(factory.makeAddress("Pol's House","Gemüse Strase","4","10115","Berlin"));
        agenda.addPhoneNumber(factory.makeTelephoneNumber("691487743"));
    }
}
