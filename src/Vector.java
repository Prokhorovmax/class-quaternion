

public final class Vector {

    public final double x;
    public final double y;
    public final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("%2f %2f %2f", x, y, z);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Vector) {
            Vector other = (Vector) obj;
            return (Math.abs(x - other.x) < 1.0e-3) && (Math.abs(y - other.y) < 1.0e-3) &&
                    (Math.abs(z - other.z) < 1.0e-3);
        }
        return false;
    }
}

