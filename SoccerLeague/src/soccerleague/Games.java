/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerleague;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Mitchel King
 */
public class Games  {
    public static ArrayList<Games> arrayGames = new ArrayList<>();
    Random rnd = new Random();
    private int goalMax =10;
    private int gameNumber;
    private double temperature;
    private int goalsAllowed;
    private String teams;
    
    public void play(Teams teamOne, Teams teamTwo){
        
        if(this.temperature >0 && this.temperature <= 25)
        {
            this.setGoalsallowed(this.getGoalmax());
            teamOne.setGoalsallowed(this.getGoalmax());
            teamTwo.setGoalsallowed(this.getGoalmax());
            
            teamOne.setGoalsscored(teamOne.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            teamTwo.setGoalsscored(teamTwo.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            
            if(teamOne.getGoalsscored() > teamTwo.getGoalsscored())
            {
                teamOne.setWintotal(teamOne.getWintotal()+1);
                teamTwo.setLosstotal(teamTwo.getLosstotal()+1);
            }
            else if(teamTwo.getGoalsscored() > teamOne.getGoalsscored())
            {
                teamTwo.setWintotal(teamTwo.getWintotal()+1);
                teamOne.setLosstotal(teamOne.getLosstotal()+1);
            }   
            else if(teamOne.getGoalsscored() == teamTwo.getGoalsscored())
            {
                teamOne.setTietotal(teamOne.getTietotal()+1);
                teamTwo.setTietotal(teamTwo.getTietotal()+1);
            }
            
        }
         else if(this.temperature >25 && this.temperature <= 35)
        {
            int goals =4;
            this.setGoalsallowed(this.getGoalmax() - goals);
            teamOne.setGoalsallowed(this.getGoalmax() - goals);
            teamTwo.setGoalsallowed(this.getGoalmax() - goals);
            
            teamOne.setGoalsscored(teamOne.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            teamTwo.setGoalsscored(teamTwo.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            
            if(teamOne.getGoalsscored() > teamTwo.getGoalsscored())
            {
                teamOne.setWintotal(teamOne.getWintotal()+1);
                teamTwo.setLosstotal(teamTwo.getLosstotal()+1);
            }
            else if(teamTwo.getGoalsscored() > teamOne.getGoalsscored())
            {
                teamTwo.setWintotal(teamTwo.getWintotal()+1);
                teamOne.setLosstotal(teamOne.getLosstotal()+1);
            }   
            else if(teamOne.getGoalsscored() == teamTwo.getGoalsscored())
            {
                teamOne.setTietotal(teamOne.getTietotal()+1);
                teamTwo.setTietotal(teamTwo.getTietotal()+1);
            }
            
        }
        else if(this.temperature >35 && this.temperature < 45)
        {
            int goals = 6;
            this.setGoalsallowed(this.getGoalmax() - goals);
            teamOne.setGoalsallowed(this.getGoalmax() - goals);
            teamTwo.setGoalsallowed(this.getGoalmax() - goals);
            
            teamOne.setGoalsscored(teamOne.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            teamTwo.setGoalsscored(teamTwo.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            
            if(teamOne.getGoalsscored() > teamTwo.getGoalsscored())
            {
                teamOne.setWintotal(teamOne.getWintotal()+1);
                teamTwo.setLosstotal(teamTwo.getLosstotal()+1);
            }
            else if(teamTwo.getGoalsscored() > teamOne.getGoalsscored())
            {
                teamTwo.setWintotal(teamTwo.getWintotal()+1);
                teamOne.setLosstotal(teamOne.getLosstotal()+1);
            }   
            else if(teamOne.getGoalsscored() == teamTwo.getGoalsscored())
            {
                teamOne.setTietotal(teamOne.getTietotal()+1);
                teamTwo.setTietotal(teamTwo.getTietotal()+1);
            }
        }
        else if (this.temperature >= 45)
        {
            int goals =8;
            this.setGoalsallowed(this.getGoalmax() - goals);
            teamOne.setGoalsallowed(this.getGoalmax() - goals);
            teamTwo.setGoalsallowed(this.getGoalmax() - goals);
            
            teamOne.setGoalsscored(teamOne.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            teamTwo.setGoalsscored(teamTwo.getGoalsscored() + rnd.nextInt(this.getGoalsallowed()));
            
            if(teamOne.getGoalsscored() > teamTwo.getGoalsscored())
            {
                teamOne.setWintotal(teamOne.getWintotal()+1);
                teamTwo.setLosstotal(teamTwo.getLosstotal()+1);
            }
            else if(teamTwo.getGoalsscored() > teamOne.getGoalsscored())
            {
                teamTwo.setWintotal(teamTwo.getWintotal()+1);
                teamOne.setLosstotal(teamOne.getLosstotal()+1);
            }   
            else if(teamOne.getGoalsscored() == teamTwo.getGoalsscored())
            {
                teamOne.setTietotal(teamOne.getTietotal()+1);
                teamTwo.setTietotal(teamTwo.getTietotal()+1);
            }
            
        }
    }
    public void setTeamname(String teamOne, String teamTwo)
    {
        teams = (teamOne+" vs "+teamTwo);
    }
    public String getTeamname()
    {
        return teams;
    }
    public void setGoalsallowed(int goals){
        goalsAllowed = goals;
    }
    public int getGoalsallowed(){
        return goalsAllowed;
    }
    public void setGoalmax(int goal){
        goalMax = goal;
    }
    public int getGoalmax(){
        return goalMax;
    }
    
    public void setGamenumber(int game){
        gameNumber = game;
    }
    public int getGamenumber(){
        return gameNumber;
    }
    
    public void setTemp(double temp){
        temperature = temp;
    }
    public double getTemp(){
        return temperature;
    }
}
