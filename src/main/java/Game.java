import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {
    //Attributes
    private Hero hero;
    private Screen screen;

    //Methods
    public Game(){
        try{
            TerminalSize terminalSize = new TerminalSize(40, 20);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();

            this.screen = new TerminalScreen(terminal);

            this.screen.setCursorPosition(null); //don't need a cursor
            this.screen.startScreen(); //start screen
            this.screen.doResizeIfNecessary(); //resize if needed

            Position position = new Position(10, 10);
            this.hero = new Hero(position);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void run() throws IOException{
        boolean playing = true;
        while(playing) {
            draw();
            KeyStroke key = screen.readInput();
            processKey(key);
            switch (key.getKeyType()) {
                case ArrowUp:
                    moveHero(hero.moveUp());
                    break;
                case ArrowDown:
                    moveHero(hero.moveDown());
                    break;
                case ArrowRight:
                    moveHero(hero.moveRight());
                    break;
                case ArrowLeft:
                    moveHero(hero.moveLeft());
                    break;
                case Character:
                    if(key.getCharacter() == 'q'){
                        this.screen.close();
                    }
                    break;
                case EOF:
                    playing = false;
                    break;
            }
        }
    }

    private void moveHero(Position position){
        hero.setPosition(position);
    }

    private void processKey(KeyStroke key) {
        System.out.println(key);
    }

    private void draw() throws IOException{
        this.screen.clear();
        hero.draw(screen);
        this.screen.refresh();
    }
}