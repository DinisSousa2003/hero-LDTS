import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall {
    private Position position;

    public Wall(Position position){
        this.position = position;
    }

    public int getWallX(){
        return this.position.getX();
    }

    public int getWallY(){
        return this.position.getY();
    }

    public void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#FF0000"));
        graphics.putString(new TerminalPosition(this.getWallX(), this.getWallY()), " ");
    }
}
