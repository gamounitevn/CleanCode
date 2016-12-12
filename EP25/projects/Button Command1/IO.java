package commands;

public class IO {
  public static final int BUTTON_ADDRESS = 0x01;
  public static final int LIGHT_ADDRESS = 0x02;

  public static byte in(int ioAddress) {
    return 0; // return input byte from io address.
  }

  public static void out(int ioAddress, int data) {
    // send data byte to io address
  }
}
