

public final class Quaternion {

    private final double a;
    private final double b;
    private final double c;
    private final double d;

    // [Constructor] creating new quaternion from components
    public Quaternion(final double a, final double b, final double c, final double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // returning the quiaternion norm
    public double norm() {
        return a * a + b * b + c * c + d * d;
    }

    // returning the quaternion module/length
    public double module() {
        return Math.sqrt(norm());
    }

    // returning the quaternion conjugate
    public Quaternion conjugate() {
        return new Quaternion(a, -b, -c, -d);
    }

    // returning sum of two quaternions
    public Quaternion plus(Quaternion other) {
        return new Quaternion(a + other.a, b + other.b, c + other.c, d + other.d);
    }

    // returning difference of two qutarenions
    public Quaternion minus(Quaternion other) {
        return new Quaternion(a - other.a, b - other.b, c - other.c, d - other.d);
    }

    // multiplication by a scalar
    public Quaternion scalarMultiply(final double constant) {
        return new Quaternion(a * constant, b * constant, c * constant, d * constant);
    }

    // returning multiplication of two quiaternions
    public Quaternion multiply(Quaternion other) {
        final double a1 = a * other.a - b * other.b - c * other.c - d * other.d;
        final double b1 = a * other.b + b * other.a + c * other.d - d * other.c;
        final double c1 = a * other.c - b * other.d + c * other.a + d * other.b;
        final double d1 = a * other.d + b * other.c - c * other.b + d * other.a;
        return new Quaternion(a1, b1, c1, d1);
    }

    // returning the inversion of this quaternion
    public Quaternion inv() {
        final double denominator = norm();
        return new Quaternion(a / denominator, -b / denominator, -c / denominator, -d / denominator);
    }

    // returning the scalar part of quaternion
    public Quaternion getScalarPart() {
        return new Quaternion(a, 0.0, 0.0, 0.0);
    }

    // returning the vector part of quaternion
    public Quaternion getVectorPart() {
        return new Quaternion(0.0, b, c, d);
    }

    // [Constructor] creating quaternion from given axis ang angle in degrees
    public static Quaternion setFromAxisAndAngle(final Vector axis, final double angle) {
        final double w = angle;
        final double i = axis.getX();
        final double j = axis.getY();
        final double k = axis.getZ();
        return new Quaternion(w, i, j, k);
    }

    // returning the axis from given quaternion
    public Vector getAxis() {
        return new Vector(b, c, d);
    }

    // returning the angle from given quaternion
    public double getAngle() {
        return a;
    }

    // overrides
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Quaternion) {
            final Quaternion other = (Quaternion) obj;
            return (Math.abs(a - other.a) < 1.0e-3) && (Math.abs(b - other.b) < 1.0e-3) &&
                    (Math.abs(c - other.c) < 1.0e-3) && (Math.abs(d - other.d) < 1.0e-3);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final long aLong = Double.valueOf(a).longValue();
        final long bLong = Double.valueOf(b).longValue();
        final long cLong = Double.valueOf(c).longValue();
        final long dLong = Double.valueOf(d).longValue();
        long longResult = 17;
        longResult = 31 * longResult + aLong;
        longResult = 31 * longResult + bLong;
        longResult = 31 * longResult + cLong;
        longResult = 31 * longResult + dLong;
        return (int) longResult;
    }

    @Override
    public String toString() {
        return String.format("%-8.4f%-2s%-8.4f%-4s%-8.4f%-4s%-8.4f%-1s", a, "+", b, "i +", c, "j +", d, "k");
    }
}