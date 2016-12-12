package commands;

public class ButtonCommand implements Command {
  public void execute() {
    Commands.add(buttonHasBeenPressed() ? new LightCommand() : this);
  }

  private boolean buttonHasBeenPressed() {
    return (IO.in(IO.BUTTON_ADDRESS) == 0);
  }

  class LightCommand implements Command {
    public void execute() {
      IO.out(IO.LIGHT_ADDRESS, 1);
    }
  }
}








