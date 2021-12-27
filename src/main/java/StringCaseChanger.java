public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String newString = "";
        String text = drink.getText();
        for(int i = 0; i < text.length(); i++){
            if(Character.isLowerCase(text.charAt(i))){
                newString += Character.toUpperCase(text.charAt(i));
            }
            else {
                newString += Character.toLowerCase(text.charAt(i));
            }
        }
        drink.setText(newString);
    }
}
