package commands;

import static commands.ButtonCommand.LightCommand;

public class CommandMain {
  public static void main(String[] args) {
    Commands.add(new ButtonCommand(IO.BUTTON1_ADDRESS, new LightCommand(IO.LIGHT1_ADDRESS)));
    Commands.add(new ButtonCommand(IO.BUTTON2_ADDRESS, new LightCommand(IO.LIGHT2_ADDRESS)));
    Commands.add(new ButtonCommand(IO.BUTTON3_ADDRESS, new LightCommand(IO.LIGHT3_ADDRESS)));
    Commands.add(new ButtonCommand(IO.BUTTON4_ADDRESS, new LightCommand(IO.LIGHT4_ADDRESS)));
    Commands.add(new ButtonCommand(IO.BUTTON5_ADDRESS, new LightCommand(IO.LIGHT5_ADDRESS)));
  }
}
