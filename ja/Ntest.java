package ja.src.main;
import java.net.InetAddress;

public class Ntest {
    static volatile InetAddress localInetAddress;
    public static void main(String[] args) {
      try {
        localInetAddress = InetAddress.getLocalHost();
        System.out.println(localInetAddress);
      } catch (Exception e) {
        System.out.println(e);
      }
    }
}
