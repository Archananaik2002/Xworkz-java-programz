package com.xworkz.encapsulation.app;

public class Pubg {
    
    protected String playerName;
    protected String playerID;
    protected int level;
    protected int experience;
    protected int matchesPlayed;
    protected int kills;
    protected int wins;
    protected double kdRatio;
    protected String clanName;
    protected String serverRegion;
    protected boolean isBattlePassActive;
    protected int battlePassLevel;
    protected boolean isMicEnabled;
    protected boolean isSquadPlayEnabled;

   
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public double getKdRatio() {
        return kdRatio;
    }

    public void setKdRatio(double kdRatio) {
        this.kdRatio = kdRatio;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public String getServerRegion() {
        return serverRegion;
    }

    public void setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
    }

    public boolean isBattlePassActive() {
        return isBattlePassActive;
    }

    public void setBattlePassActive(boolean isBattlePassActive) {
        this.isBattlePassActive = isBattlePassActive;
    }

    public int getBattlePassLevel() {
        return battlePassLevel;
    }

    public void setBattlePassLevel(int battlePassLevel) {
        this.battlePassLevel = battlePassLevel;
    }

    public boolean isMicEnabled() {
        return isMicEnabled;
    }

    public void setMicEnabled(boolean isMicEnabled) {
        this.isMicEnabled = isMicEnabled;
    }

    public boolean isSquadPlayEnabled() {
        return isSquadPlayEnabled;
    }

    public void setSquadPlayEnabled(boolean isSquadPlayEnabled) {
        this.isSquadPlayEnabled = isSquadPlayEnabled;
    }

    
}
