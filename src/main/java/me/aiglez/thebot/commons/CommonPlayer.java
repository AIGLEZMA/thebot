package me.aiglez.thebot.commons;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CommonPlayer {

    public static List<CommonPlayer> players = new ArrayList<>();

    private final UUID uniqueID;

    private int tempPin;

    private boolean isBanned;

    private boolean isMuted;
    private boolean isVerified;

    public CommonPlayer(UUID uniqueID) {
        this.uniqueID = uniqueID;
    }

    public CommonPlayer(UUID uniqueID, int pin) {
        this.tempPin = pin;
        this.uniqueID = uniqueID;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public int getTempPin() {
        return tempPin;
    }
}
