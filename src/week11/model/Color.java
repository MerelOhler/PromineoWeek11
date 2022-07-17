package week11.model;


public class Color {
    private String colorName;

    public Color (String name){
        this.colorName = name;
    }

    @Override
    public String toString() {
        return colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public static int compareColors (Color c1, Color c2){

        if (c1.getColorName().compareTo(c2.getColorName()) > 0){
            return 1;
        } else if (c1.getColorName().compareTo(c2.getColorName()) < 0){
            return -1;
        }
        return 0;
    }
   
}
