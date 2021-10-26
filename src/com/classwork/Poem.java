package com.classwork;

public class Poem {
    public static void main(String[] args){
        String str = "Old MacDonald had a farm,\n" +
                "E-I-E-I-O.\n" +
                "And on his farm he had some %ANIMAL%,\n" +
                "E-I-E-I-O.\n" +
                "With a %SOUND%, %SOUND% here,\n" +
                "And a %SOUND%, %SOUND% there,\n" +
                "Here a %SOUND%, there a %SOUND%,\n" +
                "Everywhere a %SOUND%, %SOUND%,";

        str = str.replace("%ANIMAL%","Chicks");
        str = str.replace("%SOUND%" , "Chick");
        System.out.println( "****Poem on Chicks**** \n"+ str);

        str = str.replace("%ANIMAL%","Duck");
        str = str.replace("%SOUND%" , "Quack");
        System.out.println( "****Poem on Duck **** \n"+ str);

        str = str.replace("%ANIMAL%","Turkey");
        str = str.replace("%SOUND%" , "Gobble");
        System.out.println( "****Poem on Turkey **** \n"+ str);

        str = str.replace("%ANIMAL%","Cat");
        str = str.replace("%SOUND%" , "Meow,Meow");
        System.out.println( "****Poem on Cat **** \n"+ str);

        str = str.replace("%ANIMAL%","Mule");
        str = str.replace("%SOUND%" , "Heehaw");
        System.out.println( "****Poem on Mule **** \n"+ str);

        str = str.replace("%ANIMAL%","Dog");
        str = str.replace("%SOUND%" , "Bow Wow");
        System.out.println( "****Poem on Dog **** \n"+ str);

        str = str.replace("%ANIMAL%","Pig");
        str = str.replace("%SOUND%" , "oink,oink");
        System.out.println( "****Poem on Pig **** \n"+ str);

        str = str.replace("%ANIMAL%","Turtle");
        str = str.replace("%SOUND%" , "nerp,nerp");
        System.out.println( "****Poem on Turtle **** \n"+ str);

        str = str.replace("%ANIMAL%","Cow");
        str = str.replace("%SOUND%" , "moo,moo");
        System.out.println( "****Poem on Cow **** \n"+ str);
    }
}
