/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

/**
 *
 * @author mf291
 */
import java.io.Serializable;

public class SerializedClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nonTransientField; // Data member tanpa keyword transient
    private transient String transientField; // Data member dengan keyword transient
    private static String staticField; // Data member dengan keyword static
    private final String finalField = "This is a final field"; // Data member dengan keyword final

    // Constructor
    public SerializedClass(String nonTransientField, String transientField) {
        this.nonTransientField = nonTransientField;
        this.transientField = transientField;
    }

    // Getters and setters
    public String getNonTransientField() {
        return nonTransientField;
    }

    public void setNonTransientField(String nonTransientField) {
        this.nonTransientField = nonTransientField;
    }

    public String getTransientField() {
        return transientField;
    }

    public static String getStaticField() {
        return staticField;
    }

    public static void setStaticField(String staticField) {
        SerializedClass.staticField = staticField;
    }

    public String getFinalField() {
        return finalField;
    }
}
