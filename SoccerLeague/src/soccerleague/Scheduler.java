/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerleague;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author MitchelKing
 * ATPQ2 Java
 */
public class Scheduler {
    public void results(Teams[] listTeams)
    {
            //Team one print out
            System.out.println("Season is over\n\n--------RESULTS--------\n");
            System.out.println("Team one");
            System.out.println("Team one total goals: "+listTeams[0].getGoalsscored());
            System.out.println("Team one total wins is: "+listTeams[0].getWintotal());
            System.out.println("Team one total Losses is: "+listTeams[0].getLosstotal());
            System.out.println("Team one total Draws is: "+listTeams[0].getTietotal()+"\n");
            //Team two
            System.out.println("Team two");
            System.out.println("Team one total goals: "+listTeams[1].getGoalsscored());
            System.out.println("Team one total wins is: "+listTeams[1].getWintotal());
            System.out.println("Team one total Losses is: "+listTeams[1].getLosstotal());
            System.out.println("Team one total Draws is: "+listTeams[1].getTietotal()+"\n");
            //Team three
            System.out.println("Team three");
            System.out.println("Team one total goals: "+listTeams[2].getGoalsscored());
            System.out.println("Team one total wins is: "+listTeams[2].getWintotal());
            System.out.println("Team one total Losses is: "+listTeams[2].getLosstotal());
            System.out.println("Team one total Draws is: "+listTeams[2].getTietotal()+"\n");
            //Team four
            System.out.println("Team four");
            System.out.println("Team one total goals: "+listTeams[3].getGoalsscored());
            System.out.println("Team one total wins is: "+listTeams[3].getWintotal());
            System.out.println("Team one total Losses is: "+listTeams[3].getLosstotal());
            System.out.println("Team one total Draws is: "+listTeams[3].getTietotal()+"\n");
            
            //Game data printout
            Games.arrayGames.forEach((game) -> System.out.println("\n"+"Game "+game.getGamenumber()+"\nTemperature: "+game.getTemp()+"\n"+game.getTeamname()+"\nGoals allowed: "+game.getGoalsallowed())); 
    }
    public void schedule()
    {
        Random rnd = new Random();
        int counter =0;
        String firstTeam = "";
        String secondTeam ="";
        String temp;
        double temperature = 0;
        Teams[] listTeams = new Teams[4];
        
        listTeams[0] = new Teams();
        listTeams[1] = new Teams();
        listTeams[2] = new Teams();
        listTeams[3] = new Teams();
        //set name so can filter for properties
        listTeams[0].setTeamname("Team one");
        listTeams[1].setTeamname("Team two");
        listTeams[2].setTeamname("Team three");
        listTeams[3].setTeamname("Team four");
        
        //array list to randomize two teams from the array of teams
        ArrayList<Teams> arrayTeams = new ArrayList<>();
                
        while(counter < 3){  
            try
            {
                temp = JOptionPane.showInputDialog(null,"Please input a temperature in celcius", "Temperature Input");
                if(temp == null)
                {
                    JOptionPane.showMessageDialog(null,"Closing Application", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(1);
                }
                temperature = Double.parseDouble(temp);
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, e+"\nPlease enter a valid temperature","Error", JOptionPane.ERROR_MESSAGE);
            }
        //double temperature = Double.parseDouble(temp);
        //add teams from list to arraylist
        for(Teams current:listTeams)
        {
            arrayTeams.add(current);
        }  
            //schedule two games        
            if(temperature > 0 && temperature <= 45)
            {               
                Games gameOne = new Games();
                Games gameTwo = new Games();
                
                Games.arrayGames.add(gameOne);
                Games.arrayGames.add(gameTwo);

                gameOne.setTemp(temperature); gameTwo.setTemp(temperature);
                //set game number according to arraylist size
                gameOne.setGamenumber(Games.arrayGames.size()-1); gameTwo.setGamenumber(Games.arrayGames.size());
                     
                //Schedule two random teams
                int randomTeam = rnd.nextInt(3);
                int randomTeam2 = rnd.nextInt(3);
                //make sure they different
                while(randomTeam == randomTeam2){
                    randomTeam2 = rnd.nextInt(3);
                }
                //play first from arrayTeams object
                gameOne.play(arrayTeams.get(randomTeam), arrayTeams.get(randomTeam2));
                //set goals scored to listTeams from arrayTeams object
                
                //dont need to reference parsed arraylist arrayTeams.goals scored and assign to listTeams.goals scored
                //they are modyfying same value, using reference or same memory location??
                //I thought it would be a new listArray with entirely new objects, which i would then need to transfer their temp values
                //below lines seem to be doubling goals scored by adding again, so they are accessing same object, tho different arrays
                
                //listTeams[randomTeam].setGoalsscored(listTeams[randomTeam].getGoalsscored()+arrayTeams.get(randomTeam).getGoalsscored());
                //listTeams[randomTeam2].setGoalsscored(listTeams[randomTeam2].getGoalsscored()+arrayTeams.get(randomTeam2).getGoalsscored());
                //
                
                //set teams who played in game object
                gameOne.setTeamname(arrayTeams.get(randomTeam).getTeamname(), arrayTeams.get(randomTeam2).getTeamname());
                //remove teams from array
                arrayTeams.remove(randomTeam); arrayTeams.remove(randomTeam2);
                //play second
                gameTwo.play(arrayTeams.get(0), arrayTeams.get(1));
                //find remaining two teams who played, set goals scored, set teamnames
                switch(arrayTeams.get(0).getTeamname())
                {                    
                    case "Team one":
                        //listTeams[0].setGoalsscored(listTeams[0].getGoalsscored()+arrayTeams.get(0).getGoalsscored());
                        firstTeam = arrayTeams.get(0).getTeamname();
                        break;
                    case "Team two":
                        //listTeams[1].setGoalsscored(listTeams[1].getGoalsscored()+arrayTeams.get(0).getGoalsscored());
                        firstTeam = arrayTeams.get(0).getTeamname();
                        break;
                    case "Team three":
                        listTeams[2].setGoalsscored(listTeams[1].getGoalsscored()+arrayTeams.get(0).getGoalsscored());
                        firstTeam = arrayTeams.get(0).getTeamname();
                        break;
                    case "Team four":
                        //listTeams[3].setGoalsscored(listTeams[3].getGoalsscored()+arrayTeams.get(0).getGoalsscored());
                        firstTeam = arrayTeams.get(0).getTeamname();
                        break;
                }
                switch(arrayTeams.get(1).getTeamname())
                {                    
                    case "Team one":
                        //listTeams[0].setGoalsscored(listTeams[0].getGoalsscored()+arrayTeams.get(1).getGoalsscored());
                        secondTeam = arrayTeams.get(1).getTeamname();
                        break;
                    case "Team two":
                        //listTeams[1].setGoalsscored(listTeams[1].getGoalsscored()+arrayTeams.get(1).getGoalsscored());
                        secondTeam = arrayTeams.get(1).getTeamname();
                        break;
                    case "Team three":
                        //listTeams[2].setGoalsscored(listTeams[2].getGoalsscored()+arrayTeams.get(1).getGoalsscored());
                        secondTeam = arrayTeams.get(1).getTeamname();
                        break;
                    case "Team four":
                        //listTeams[3].setGoalsscored(listTeams[3].getGoalsscored()+arrayTeams.get(1).getGoalsscored());
                        secondTeam = arrayTeams.get(1).getTeamname();
                        break;
                }
                arrayTeams.remove(0); arrayTeams.remove(0);
                gameTwo.setTeamname(firstTeam, secondTeam);                     
            }
            else if(temperature <= 0)
            {
                System.out.println("Too cold to play.");
                counter++;
            }
            else if(temperature >= 45)
            {
                System.out.println("Too HOT to play.");
            }
        }
        if(counter ==3)
        {
            results(listTeams);
        }                   
    }        
}
