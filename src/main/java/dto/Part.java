package dto;

import java.util.Objects;

public class Part {
    private int winnerId;
    private boolean deuce;

    public Part() {
        deuce = false;
    }

    public Part(int winnerId) {
        this.winnerId = winnerId;
    }

    public int getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(int winnerId) {
        this.winnerId = winnerId;
    }

    public boolean isDeuce() {
        return deuce;
    }

    public void setDeuce(boolean deuce) {
        this.deuce = deuce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Part)) return false;
        Part part = (Part) o;
        return winnerId == part.winnerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(winnerId);
    }


}
