/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;


public class Timer {
    // Data members
    private long time;
    
    public Timer(){
        time = System.currentTimeMillis();
    }
    
    // getter and setter
    public String getTime(){
        long currentTime = (System.currentTimeMillis() - time) / 1000;
        
        return "The current time is: " + currentTime + " seconds!";
    }

}
