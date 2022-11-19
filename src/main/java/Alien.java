public class Alien extends Sprite {

    private final int INITIAL_X = 600;

    public Alien(int x, int y) { //класс, у которого есть координаты получаемые при вызове
        super(x, y);

        initAlien();
    }

    private void initAlien() { //получение изображения объекта

        loadImage("src/resources/alien.png");
        getImageDimensions();
    }

    public void move() {
        //перемещение начинается с 400 и после уходит до 0, на 0 объекту даются новые координаты
        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}