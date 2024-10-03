public class MainTask1{
	
public static void main (String [] args){

TeamTask1 team1 = new TeamTask1("TeamB");
TeamTask1 team2 = new TeamTask1("TeamA");
TeamTask1 team3 = new TeamTask1("TeamC");
TeamTask1 team4 = new TeamTask1("TeamD");
TeamTask1 team5 = new TeamTask1("TeamE");
TeamTask1 team6 = new TeamTask1("TeamF");

team1.setRank(1);
team2.setRank(2);
team3.setRank(3);
team3.setRank(4);
team3.setRank(5);

team1.addPlayer("Anders");
team1.addPlayer("Magnus");
team1.addPlayer("Jesper");




System.out.println(team1.toString());
System.out.println(team2.toString());
System.out.println(team3.toString());
System.out.println(team4.toString());
System.out.println(team5.toString());
	}



}