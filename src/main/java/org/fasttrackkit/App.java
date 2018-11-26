package org.fasttrackkit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Entertainment goingout = new Entertainment("goingout");

        Food Bacon = new Food("Bacon");
        Dog Spike = new Dog("Spike");

        Rescuer John = new Rescuer("John");
        John.feed(Bacon,Spike);

        goingout.walk(John,Spike);







    }


}