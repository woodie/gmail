import javax.microedition.midlet.MIDlet;
import javax.microedition.io.*;

public class Gmail extends MIDlet {

  public void startApp () {
    try {
      boolean must_first_exit = platformRequest("http://mail.google.com");
    } catch (ConnectionNotFoundException ex) {
      ex.printStackTrace();
    }
    destroyApp (false);
    notifyDestroyed ();
  }
  public void pauseApp () {}
  public void destroyApp (boolean unconditional) {}
}

