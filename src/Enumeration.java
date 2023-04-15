class enumDemo
{
    enum GameLevel
    {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        //Assign Enum variable
        GameLevel a =GameLevel.HIGH;
        System.out.println(a);

        //USe Enum in switch case

        switch(a)
        {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM :
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }

        for(GameLevel Level:GameLevel.values())
        {
            System.out.println(Level);
        }

    }
}


