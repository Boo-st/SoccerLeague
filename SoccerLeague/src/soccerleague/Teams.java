/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerleague;

/**
 *
 * @author Mitchel King
 */
public class Teams {
    private String teamName;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int goalsScored;
    private int goalsAllowed;
    
    public void setTeamname(String name){
        teamName = name;
    }
    public String getTeamname(){
        return teamName;
    }
    
    public void setWintotal(int wins){
        winTotal = wins;
    }
    public int getWintotal(){
        return winTotal;
    }
    
    public void setLosstotal(int losses){
        lossTotal = losses;
    }
    public int getLosstotal(){
        return lossTotal;
    }
    
    public void setTietotal(int ties){
        tieTotal = ties;
    } 
    public int getTietotal(){
        return tieTotal;
    }
    
    public void setGoalsscored(int goals){
        goalsScored = goals;
    }
    public int getGoalsscored(){
        return goalsScored;
    }
    
    public void setGoalsallowed(int goals){
        goalsAllowed = goals;
    }
    public int getGoalsallowed(){
        return goalsAllowed;
    }
    
}
