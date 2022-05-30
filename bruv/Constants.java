package bruv;
import java.awt.*;

public interface Constants {
    int FINAL_BIT_0 = QRCodeDrawer.getIntFromColor(Color.WHITE);
    int FINAL_BIT_1 = QRCodeDrawer.getIntFromColor(Color.BLACK);
    int DATA_BIT_0 = QRCodeDrawer.getIntFromColor(Color.GREEN);
    int DATA_BIT_1 = QRCodeDrawer.getIntFromColor(Color.PINK);
    int FORMAT_BIT_0 = QRCodeDrawer.getIntFromColor(Color.BLUE);
    int FORMAT_BIT_1 = QRCodeDrawer.getIntFromColor(Color.YELLOW);
    int VERSION_BIT_0 = QRCodeDrawer.getIntFromColor(Color.RED);
    int VERSION_BIT_1 = QRCodeDrawer.getIntFromColor(Color.CYAN);

    String[] LOW_ECC_MASKS = new String[] {
        "111011111000100",
        "111001011110011",
        "111110110101010",
        "111100010011101",
        "110011000101111",
        "110001100011000",
        "110110001000001",
        "110100101110110",
    };

    String[] MID_ECC_MASKS = new String[] {
        "101010000010010",
        "101000100100101",
        "101111001111100",
        "101101101001011",
        "100010111111001",
        "100000011001110",
        "100111110010111",
        "100101010100000",
    };


    String[] QUALITY_ECC_MASKS = new String[] {
        "011010101011111",
        "011000001101000",
        "011111100110001",
        "011101000000110",
        "010010010110100",
        "010000110000011",
        "010111011011010",
        "010101111101101",
    };

    String[] HIGH_ECC_MASKS = new String[] {
        "001011010001001",
        "001001110111110",
        "001110011100111",
        "001100111010000",
        "000011101100010",
        "000001001010101",
        "000110100001100",
        "000100000111011",
    };
}