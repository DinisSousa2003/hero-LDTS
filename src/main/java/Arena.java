import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Arena {
    private int width;
    private int height;
    private Hero hero;

    public Arena(int width, int height, Hero hero){;
        this.width = width;
        this.height = height;
        this.hero = hero;
    }

    public void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    public void draw(Screen screen) throws IOException {
        screen.setCharacter(hero.getHeroX(), hero.getHeroY(), TextCharacter.fromCharacter('X')[0]);
    }

    private boolean canHeroMove(Position position){
        if(position.getX() < 0 || position.getX() >=  width){
            return false;
        }
        if(position.getY() < 0 || position.getY() >=  height){
            return false;
        }
        return true;
    }
}
