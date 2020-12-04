package dto;

import java.util.Objects;

public class SimplePart {
    private int winnerId;

    public SimplePart() {
    }

    public SimplePart(int winnerId) {
        this.winnerId = winnerId;
    }

    public int getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(int winnerId) {
        this.winnerId = winnerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimplePart)) return false;
        SimplePart simplePart = (SimplePart) o;
        return winnerId == simplePart.winnerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(winnerId);
    }
}
