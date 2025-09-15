package sport;

public enum Pozicija {
    GOLMAN,
    ODBRAMBENI,
    NAPADAC;

    public String toString() {
        return switch (this) {
            case GOLMAN -> "golman";
            case ODBRAMBENI -> "odbrambeni";
            case NAPADAC -> "napadac";
        };
    }
}
