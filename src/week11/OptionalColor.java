package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import week11.model.Color;

public class OptionalColor {
    private List<Color> colors = new ArrayList<>(List.of(new Color("Red"), new Color("Green"), new Color("Blue"), 
    new Color("Cyan"), new Color("Yellow"), new Color("Magenta")));
    public static void main(String[] args) {
        
        new OptionalColor().methodB();
    }

    private Color colorMethod(Optional<Color> optionalColor){
        return optionalColor.orElseThrow(() -> new NoSuchElementException("This color isn't in our list!"));
    }
    
    private void methodB() {
        try {
            System.out.println("The color you selected was: " + colorMethod(Optional.of(colors.get(2))).toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("The color you selected was: " + colorMethod(Optional.empty()).toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
