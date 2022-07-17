package week11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import week11.model.Color;

public class StreamColor {

    private List<Color> colors = new ArrayList<>(List.of(new Color("Red"), new Color("Green"), new Color("Blue"), 
        new Color("Cyan"), new Color("Yellow"), new Color("Magenta")));

    public static void main(String[] args) {
        new StreamColor().run();
    }

    private void run() {

        String sortedColors = colors.stream()
            .map(Color::getColorName)
            .sorted()
            .collect(Collectors.joining(", "));
        System.out.println(sortedColors);

    }
    
}
