public class StringReplacer implements StringTransformer{
    private char oldChar;
    private char newChar;

    public StringReplacer(char oldC, char newC){
        this.oldChar = oldC;
        this.newChar = newC;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        text  = text.replace(oldChar, newChar);
        drink.setText(text);
    }
}
