package Level3.Exercise1.Model;

import Level3.Exercise1.Model.Commands.Command;

public class Controler {
    public void executeCommand(Command command){
        command.execute();
    }
}
