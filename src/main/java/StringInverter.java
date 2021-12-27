public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink){
        String text = drink.getText();
        String invertedText = "";

        for(int i = 0; i < text.length(); i++){
            invertedText = text.charAt(i) + invertedText;
        }
        drink.setText(invertedText);
    }
}
