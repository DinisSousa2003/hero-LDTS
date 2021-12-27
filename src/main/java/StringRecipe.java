import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> trans){
        this.transformers = trans;
    }

    public void mix(StringDrink drink){
        for(StringTransformer trans : transformers){
            trans.execute(drink);
        }
    }
}
