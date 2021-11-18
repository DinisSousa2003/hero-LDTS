import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arena {
    private int width;
    private int height;
    private Hero hero;
    private List<Wall> walls;


    public Arena(int width, int height, Hero hero){;
        this.width = width;
        this.height = height;
        this.hero = hero;
        this.walls = createWalls();
    }

    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    public void paintArena(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#AAAAAA"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');

        hero.draw(graphics);

        for (Wall wall : walls){
            wall.draw(graphics);
        }
    }

    private boolean canHeroMove(Position position){
        if(position.getX() < 0 || position.getX() >=  width){
            return false;
        }
        if(position.getY() < 0 || position.getY() >=  height){
            return false;
        }

        for(Wall wall : walls) {
            if (wall.getWallX() == position.getX() && wall.getWallY() == position.getY()) {
                return false;
            }
        }

        return true;
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < width; c++) {
            walls.add(new Wall(new Position(c, 0)));
            walls.add(new Wall(new Position(c, height -1)));
        }
        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(new Position(0, r)));
            walls.add(new Wall(new Position(width -1, r)));
        }
        return walls;
    }
}
