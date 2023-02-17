import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        begalomen begalomen = new begalomen();
        addObject(begalomen,115,344);

        pesepeda1 pesepeda1 = new pesepeda1();
        addObject(pesepeda1,573,339);
        pesepeda1.setLocation(566,336);
        pesepeda2 pesepeda2 = new pesepeda2();
        addObject(pesepeda2,566,336);
        pesepeda1.setLocation(572,349);
        pesepeda3 pesepeda3 = new pesepeda3();
        addObject(pesepeda3,572,349);
        pesepeda1.setLocation(582,344);
        polisi polisi = new polisi();
        addObject(polisi,582,344);
        Counter counter = new Counter("Skor : ");
        addObject(counter,62,31);
        CounterNyawa counterNyawa = new CounterNyawa("Nyawa : ");
        addObject(counterNyawa,39,65);
        counterNyawa.setLocation(72,67);
        begalomen.setLocation(109,260);
        begalomen.setLocation(67,341);
        removeObject(begalomen);
        removeObject(polisi);
        removeObject(pesepeda3);
        removeObject(pesepeda2);
        removeObject(pesepeda1);
        pohon pohon = new pohon();
        addObject(pohon,43,331);
        pohon pohon2 = new pohon();
        addObject(pohon2,502,331);
        pohon pohon3 = new pohon();
        addObject(pohon3,483,330);
        pohon3.setLocation(474,331);
        pohon pohon4 = new pohon();
        addObject(pohon4,474,331);
        pohon.setLocation(57,329);
        pohon pohon5 = new pohon();
        addObject(pohon5,57,329);
        pohon pohon6 = new pohon();
        addObject(pohon6,141,330);
        pohon6.setLocation(64,328);
        pohon5.setLocation(51,325);
        pohon.setLocation(32,326);
        pohon.setLocation(39,329);
        pohon.setLocation(38,329);
        pohon.setLocation(32,328);
        pohon.setLocation(30,325);
        pohon pohon7 = new pohon();
        addObject(pohon7,194,330);
        mobil mobil = new mobil();
        addObject(mobil,241,340);

        pohon5.setLocation(55,340);
        begalomen begalomen2 = new begalomen();
        addObject(begalomen2,55,340);
        pesepeda1 pesepeda12 = new pesepeda1();
        addObject(pesepeda12,581,333);
        pesepeda12.setLocation(571,327);
        pesepeda2 pesepeda22 = new pesepeda2();
        addObject(pesepeda22,571,327);
        pesepeda12.setLocation(587,336);
        pesepeda3 pesepeda32 = new pesepeda3();
        addObject(pesepeda32,587,336);
        pesepeda12.setLocation(587,338);
        polisi polisi2 = new polisi();
        addObject(polisi2,587,338);
        pohon5.setLocation(110,330);
        pohon.setLocation(93,332);
        pohon5.setLocation(58,336);
        pohon.setLocation(34,333);
        pohon6.setLocation(33,335);
        pohon6.setLocation(80,334);
        pohon.setLocation(56,327);
        pohon5.setLocation(56,327);
        pohon.setLocation(105,253);
        pohon.setLocation(42,322);
        begalomen2.setLocation(83,338);
        pohon.setLocation(40,331);
        pohon.setLocation(50,325);
        pohon6.setLocation(115,324);
        pohon.setLocation(60,323);
        pohon.setLocation(44,333);
        begalomen2.setLocation(102,332);
        pohon6.setLocation(100,329);
        pohon5.setLocation(63,329);
        pohon.setLocation(59,332);
        pohon.setLocation(57,332);
        pohon6.setLocation(117,330);
        pohon6.setLocation(118,336);
        begalomen2.setLocation(44,329);
        pohon6.setLocation(85,336);
        pohon.setLocation(17,328);
    }
}
