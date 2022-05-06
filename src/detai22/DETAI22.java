/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detai22;

import java.net.*;
import java.util.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author thuhu
 */
public class DETAI22 {

    /**
     * @param args the command line arguments
     */
    public static String giaiMa(String khoa, String maHoa) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        String line;
        SecretKeySpec skeySpec = new SecretKeySpec(khoa.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
        byte[] decoded = Base64.getDecoder().decode(maHoa);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] byteDecrypted = cipher.doFinal(decoded);

        line = new String(byteDecrypted);
        line = line.toUpperCase();
        System.out.println(line);
        return line;
    }

    public static void main(String[] args) throws SocketException, IOException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {

        DatagramSocket server = new DatagramSocket(8888);
        System.out.println("server đang chạy");
        byte[] khoa = new byte[64];
        byte[] maHoa = new byte[256];
        while (true) {
            // nhận khóa
            DatagramPacket NhanKhoa = new DatagramPacket(khoa, khoa.length);
            server.receive(NhanKhoa);
            String khoa1 = new String(NhanKhoa.getData(), 0, NhanKhoa.getLength()).trim();
            // nhận văn bản đã mã hóa
            DatagramPacket VanBanDaMaHoa = new DatagramPacket(maHoa, maHoa.length);
            server.receive(VanBanDaMaHoa);
            String maHoa1 = new String(VanBanDaMaHoa.getData(), 0, VanBanDaMaHoa.getLength()).trim();
            byte[] ketQua = new byte[256];
            ketQua = giaiMa(khoa1, maHoa1).getBytes();
            DatagramPacket GuiKetQua = new DatagramPacket(ketQua, ketQua.length, NhanKhoa.getAddress(), NhanKhoa.getPort());
            server.send(GuiKetQua);
        }
    }

}
