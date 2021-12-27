import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> trans){
        this.transformers = trans;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer trans : transformers){
            trans.execute(drink);
        }
    }
}
