package bruv;
import java.io.IOException;
import java.util.Arrays;

public class CreateQRCode {
    public static void main(String[] args) {

        Quality quality = Quality.LEVEL_L;

        DataEncoder de = new DataEncoder();
        de.encode(quality, CharacterEncoding.BYTE, "this is a test for the omegabytes 5727 scout qr code scanning system this took way too long please kill me now"); //this is what you make the qr code into 

        int[] dataBits = de.getMessage();

        QRCodeDrawer drawer = new QRCodeDrawer(de.getVersion(), 5);

        drawer.drawQRFeatures();

        int[] formatBits = new int[15];
        Arrays.fill(formatBits, Constants.FORMAT_BIT_0);
        Masker.drawFormatString(drawer.getQrCode(), de.getVersion(), formatBits);

        drawer.drawVersionString(de.getVersionBytes());

        drawer.drawDataString(dataBits, false);



        int[] qrCode = drawer.getQrCode();

        Masker m = new Masker();
        int optimialMask = m.calculateMask(qrCode, de.getVersion(), quality);

        qrCode = m.getMask(optimialMask);

        System.out.println("Using quality: " + quality.name());
        System.out.println("Using version: " + de.getVersion().getVersion());
        System.out.println("Using mask: " + optimialMask);
        System.out.println("Size: " + de.getMessage().length);

        try {
            drawer.createImage(qrCode, "qrcode.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}