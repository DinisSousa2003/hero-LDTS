import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall extends Element{

    public Wall(Position position){
        super(position);
    }

    public int getWallX(){
        return getX();
    }

    public int getWallY(){
        return getY();
    }

    public void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FF0000"));
        graphics.putString(new TerminalPosition(this.getWallX(), this.getWallY()), " ");
    }
}
