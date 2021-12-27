import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    List<StringDrink> savedDrink = new ArrayList<>();
    List<StringRecipe> savedRecipe = new ArrayList<>();
    List<StringBar> savedBar = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink, recipe);
        }
        else{
            savedDrink.add(drink);
            savedRecipe.add(recipe);
            savedBar.add(bar);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(int i = 0; i < savedDrink.size(); i++){
            if(savedBar.get(i) == bar){
                bar.order(savedDrink.get(i), savedRecipe.get(i));
            }
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
