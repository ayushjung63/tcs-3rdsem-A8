package anonyclass;



class PCGamer implements Game
{

    @Override
    public void play(String device) {
        System.out.println("I play Game in PC");
    }
}

interface Game{
    void play(String device);
}

public class AnonyMain {
    public static void main(String[] args) {
//        Game game = new PCGamer();
//        game.play();

        Game game=new Game()
        {
            @Override
            public void play(String device) {
                System.out.println("I play Game in " + device);
            }
        };

        game.play("PC");


        Game game3= (device) -> System.out.println("I play Game in my "+device);
        game3.play("PC");
    }
}
