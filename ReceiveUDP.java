public class ReceiveUDP {
  public static void main (String[] args) throws Exception {
    //Création du socket et du packet
      DatagramSocket socket = new DatagramSocket(Integer.parseInt(args[0]));
      DatagramPacket packet = new DatagramPacket(new byte[512], 512);
    //Reception du packet
      socket.receive(packet);
    //Impression du message contenu dans le packet
      byte buffer[] = packet.getData();
      String message = new String(buffer);
      System.out.println(message);
    //Fermeture du socker
      socket.close();
  }
}
