package commands;

import java.util.List;

public class Commands {
  private static List<Command> list;

  public static void add(Command command) {
    list.add(command);
  }
}
