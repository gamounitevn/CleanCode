package commands;

public class IO {
  public static final int BUTTON1_ADDRESS = 0x01;
  public static final int BUTTON2_ADDRESS = 0x02;
  public static final int BUTTON3_ADDRESS = 0x03;
  public static final int BUTTON4_ADDRESS = 0x04;
  public static final int BUTTON5_ADDRESS = 0x05;

  public static final int LIGHT1_ADDRESS = 0x11;
  public static final int LIGHT2_ADDRESS = 0x12;
  public static final int LIGHT3_ADDRESS = 0x13;
  public static final int LIGHT4_ADDRESS = 0x14;
  public static final int LIGHT5_ADDRESS = 0x15;

  public static byte in(int ioAddress) {
    return 0; // return input byte from io address.
  }

  public static void out(int ioAddress, int data) {
    // send data byte to io address
  }
}
