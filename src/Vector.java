

public final class Vector {

    private final double x;
    private final double y;
    private final double z;

    public Vector(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("%2f %2f %2f", x, y, z);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj instanceof Vector) {
            final Vector other = (Vector) obj;
            return (Math.abs(x - other.x) < 1.0e-3) && (Math.abs(y - other.y) < 1.0e-3) &&
                    (Math.abs(z - other.z) < 1.0e-3);
        }
        return false;
    }
}

