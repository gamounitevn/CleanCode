package commands;

public class ButtonCommand implements Command {
  private int buttonAddr;
  private Command onPress;

  public ButtonCommand(int buttonAddr, Command onPress) {
    this.buttonAddr = buttonAddr;
    this.onPress = onPress;
  }

  public void execute() {
    Commands.add(buttonHasBeenPressed() ? onPress : this);
  }

  private boolean buttonHasBeenPressed() {
    return (IO.in(buttonAddr) == 0);
  }

  public static class LightCommand implements Command {
    private int ioAddress;

    public LightCommand(int ioAddress) {
      this.ioAddress = ioAddress;
    }

    public void execute() {
      IO.out(ioAddress, 1);
    }
  }
}








