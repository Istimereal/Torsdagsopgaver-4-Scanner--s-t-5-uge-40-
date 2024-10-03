 import java.util.ArrayList;

 class TeamTask1{

private String teamName;
private int teamRank;
private String nameOfPlayer;
private int recievedRanking;

ArrayList<String> playerNames = new ArrayList<String>();

/*playersNames.add("Anders");
playersNames.add("Magnus");
playersNames.add("Niki");
playersNames.add("Jesper");
playersNames.add("Nicoline");
playersNames.add("Styrbjørn");*/


public TeamTask1(String teamName){
this.teamName = teamName;
}
public int setRank(int recievedRanking){
 teamRank = recievedRanking;
 return teamRank;
}

@Override
public String toString( ){
String s = "Hold: " + this.teamName + " Rang: " + this.teamRank + "\n"
+ "Player: " + "\n"+ this.playerNames.get(0) + "\n" + 
this.playerNames.get(1) +"\n" + this.playerNames.get(2);
  return  s;
}

public void addPlayer(String nameOfPlayer ){

	this.playerNames.add(nameOfPlayer);

}

}

