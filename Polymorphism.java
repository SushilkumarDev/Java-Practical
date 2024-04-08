
class Cricket{
        public String FormatName;


        public Cricket(String formatName){
            FormatName = formatName;
        }


        public String rule(){
            return "Cricket is an outdoor sport played between two teams of 11 players each";
        }


    }
    class testMatch extends Cricket{


        public testMatch(){
            super("Test Match");
        }


        public String rule(){
            return "Played for 5 days , no fixed number of overs for a team";
        }
    }


    class oneday extends Cricket{


        public oneday(){
            super("One Day International");
        }


        @Override
        public String rule() {
            // TODO Auto-generated method stub
            return "Played for 1 day ,50 overs per team";
        }


      //  public String rule(){
        //    return "Played for 1 day ,50 overs per team";
        // }


       
    }


    class T20 extends Cricket{


        public T20(){
            super("One Day International");
        }


        @Override
        public String rule() {
            // TODO Auto-generated method stub
            return "Played for 1 day ,50 overs per team";
        }
    }


        class IPL extends Cricket{


        public IPL(){
            super("IPL");
        }


        @Override
        public String rule() {
            // TODO Auto-generated method stub
            return "Played for 1 day ,50 overs per team,but not international";
        }


     }


     class Gully extends Cricket{


        public Gully(){
            super("Gully");
        }


     }




public class Polymorphism {
    public static void main (String[] args)
    {
for(int i = 1;i<11;i++){
    Cricket cricket = randomMatch();
    System.out.println("Format Type" + i + "is" + cricket.FormatName + " . The Rule is : " + cricket.rule());
}


    }
   
      public static Cricket randomMatch(){
        int randomNumber = (int)(Math.random() * 5) +1;
        System.out.println("The random number is : " + randomNumber);
        switch (randomNumber){


            case 1:
            return new testMatch();


            case 2:
            return new oneday();
           
            case 3:
            return new T20();


            case 4:
            return new IPL();


            case 5:
            return new Gully();


            default:
            return null;
        }
     


    }
}


