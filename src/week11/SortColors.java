package week11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import week11.model.Color;


public class SortColors {
    private Comparator<Color> comp = null;
    private List<Color> colors = new ArrayList<>(List.of(new Color("Red"), new Color("Green"), new Color("Blue"), 
        new Color("Cyan"), new Color("Yellow"), new Color("Magenta")));
    
    public static void main(String[] args) throws Exception {
        new SortColors().run();
        
    }

    private void run() {
        System.out.println("Original list of colors");
        colors.forEach(System.out::println);
        System.out.println();
        
        //Lambda
        System.out.println("Color list sorted using a Lambda expression");
        List<Color> sortedLambda = new ArrayList<>(colors);
        sortLambda(sortedLambda);
        sortedLambda.forEach(color -> System.out.println(color.getColorName()));
        System.out.println();

        //Method Reference
        System.out.println("Color list sorted using a Method Reference expression");
        List<Color> sortedRefM = new ArrayList<>(colors);
        sortMethodRef(sortedRefM);
        sortedRefM.forEach(System.out::println);
        System.out.println();

        //original list again
        System.out.println("Original list of colors again for reference");
        colors.forEach(System.out::println);
        
    }

    private void sortLambda(List<Color> sortColors){
        comp = (c1, c2) -> Color.compareColors(c1, c2);
        sortColors.sort(comp);
    }

    private void sortMethodRef(List<Color> sortColors){
        comp = Color::compareColors;
        sortColors.sort(comp);
    }

}
