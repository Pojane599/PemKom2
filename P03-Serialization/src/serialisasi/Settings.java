package serialisasi;

import java.io.Serializable;

public class Settings implements Serializable {
    private boolean setting1;
    private int setting2;
    private String shoeColor;
    private int shoeSize;

    public Settings(boolean setting1, int setting2, String shoeColor, int shoeSize) {
        this.setting1 = setting1;
        this.setting2 = setting2;
        this.shoeColor = shoeColor;
        this.shoeSize = shoeSize;
    }

    // Getter dan setter untuk pengaturan-pengaturan

    public boolean isSetting1() {
        return setting1;
    }

    public void setSetting1(boolean setting1) {
        this.setting1 = setting1;
    }

    public int getSetting2() {
        return setting2;
    }

    public void setSetting2(int setting2) {
        this.setting2 = setting2;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}