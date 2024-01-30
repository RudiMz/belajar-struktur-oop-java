package id.player;

import id.player.jobs_class.*;

public abstract class ABSPlayer implements IJobsClass  {

    private String username = null;
    private IJobsClass jobClassPlayer;
    private String jobClassPlayerName = null;
    private int healthPlayer = 0;
    private int physicalAttackPowerPlayer = 0;
    private int magicalAttackPowerPlayer = 0;
    private int physicalDefensePowerPlayer = 0;
    private int magicalDefensePowerPlayer = 0;

    public ABSPlayer(String username) {
        this.username = username;
    }

    // getter username Player
    public String getUsername() {
        return this.username;
    }
    // setter username Player
    public void setUsername(String username) {
        this.username = username;
    }

    // setter class Player
    public void setJobClassPlayer(IJobsClass jobClassPlayer) {
        this.jobClassPlayer = jobClassPlayer;
    }
    // getter class player
    public IJobsClass getJobClassPlayer() {
        return this.jobClassPlayer;
    }

    // getter job class player name
    public String getJobClassPlayerName() {
        return this.jobClassPlayerName;
    }
    // setter job class player name
    public void setJobClassPlayerName(String jobClassPlayerName) {
        this.jobClassPlayerName = jobClassPlayerName;
    }


    // getter health Player
    public int getHealthPlayer() {
        return this.healthPlayer;
    }
    // setter health Player
    public void setHealthPlayer(int healthPlayer) {
        this.healthPlayer = healthPlayer;
    }

    // getter physical atttack power Player
    public int getPhyscalAttackPowerPlayer() {
        return this.physicalAttackPowerPlayer;
    }
    // setter physical attack power Player
    public void setPhysicalAttackPowerPlayer(int physicalAttackPowerPlayer) {
        this.physicalAttackPowerPlayer = physicalAttackPowerPlayer;
    }

    // getter magical attack power Player
    public int getMagicalAttackPowerPlayer() {
        return this.magicalAttackPowerPlayer;
    }
    // setter magical attack power Player
    public void setMagicalAttackPowerPlayer(int magicalAttackPowerPlayer) {
        this.magicalAttackPowerPlayer =  magicalAttackPowerPlayer;
    }

    // getter physical defense power Player
    public int getPhysicalDefensePowerPlayer() {
        return this.physicalDefensePowerPlayer;
    }
    // setter physical defense power Player
    public void setPhysicalDefensePowerPlayer(int physicalDefensePowerPlayer) {
        this.physicalDefensePowerPlayer = physicalDefensePowerPlayer;
    }

    // getter magical defense power Player
    public int getMagicalDefensePowerPlayer() {
        return this.magicalDefensePowerPlayer;
    }
    // setter magical defense power Player
    public void setMagicalDefensePowerPlayer(int magicalDefensePowerPlayer) {
        this.magicalDefensePowerPlayer = magicalDefensePowerPlayer;
    }
    
    // display info Player
    public void infoPlayer() {
        System.out.println("Name\t\t\t: " + this.username);
        System.out.println("Class\t\t\t: " + this.jobClassPlayerName);
        System.out.println("Health\t\t\t: " + this.healthPlayer);
        System.out.println("Physical Attack\t\t: " + this.physicalAttackPowerPlayer);
        System.out.println("Magical Attack\t\t: " + this.magicalAttackPowerPlayer);
        System.out.println("Physical Defense\t: " + this.physicalDefensePowerPlayer);
        System.out.println("Magical Defense\t\t: " + this.magicalDefensePowerPlayer);
    }
}
