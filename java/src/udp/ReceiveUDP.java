package udp;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class ReceiveUDP {
  public static void main (String[] args) throws Exception {
    
	 // Création de l'adresse
	  InetAddress ad = InetAddress.getByName("127.0.0.1");
	  
	 //Création du socket et du packet
      DatagramSocket socket = new DatagramSocket(7654);
      DatagramPacket packet = new DatagramPacket(new byte[512], 512, ad, 7654);
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
