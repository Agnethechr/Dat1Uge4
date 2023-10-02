/* 1.a Create a class Main with a main method. */
class Main {
	public static void main(String[] args) {
	/*1.g From the main method in the Main class, create an instance of the Team class*/
	Team teamA = new Team("TeamA");


	/*1.i From the main method, call the method setRank on the instance of Team you created in step 1.g*/
	teamA.setRank(1);


	/* 1.k From the main method, create 5 more Team instances and print them.*/
        Team teamB = new Team("TeamB");
        teamB.setRank(7);

        Team teamC = new Team("TeamC");
        teamC.setRank(14);

        Team teamD = new Team("TeamD");
        teamD.setRank(4);

        Team teamE = new Team("TeamE");
        teamE.setRank(11);

        Team teamF = new Team("TeamF");
        teamF.setRank(9);

        System.out.println(teamA.toString());
        System.out.println(teamB.toString());
        System.out.println(teamC.toString());
        System.out.println(teamD.toString());
        System.out.println(teamE.toString());
        System.out.println(teamF.toString());
    }

}