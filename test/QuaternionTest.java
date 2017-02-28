
import org.junit.Test;

import static org.junit.Assert.*;

public class QuaternionTest {

    Quaternion q1 = new Quaternion(1.0, 1.0, 1.0, 1.0);
    Quaternion q2 = new Quaternion(0.005, 1.73, 3.33, 123.123);
    Quaternion q3 = new Quaternion(-15.0, 12.45, -16.4, 0.0);

    @Test
    public void norm() throws Exception {
        assertEquals(4.0, q1.norm(), 1.0e-5);
        assertEquals(15173.354954, q2.norm(), 1.0e-5);
        assertEquals(648.962499, q3.norm(), 1.0e-5);
    }

    @Test
    public void module() throws Exception {
        assertEquals(2.0, q1.module(), 1.0e-5);
        assertEquals(123.180172, q2.module(), 1.0e-5);
        assertEquals(25.474742, q3.module(), 1.0e-5);
    }

    @Test
    public void conjugate() throws Exception {
        assertEquals(new Quaternion(1.0, -1.0, -1.0, -1.0), q1.conjugate());
        assertEquals(new Quaternion(0.005, -1.73, -3.33, -123.123), q2.conjugate());
        assertEquals(new Quaternion(-15.0, -12.45, 16.4, 0.0), q3.conjugate());
    }

    @Test
    public void plus() throws Exception {
        assertEquals(new Quaternion(1.005, 2.73, 4.33, 124.123), q1.plus(q2));
        assertEquals(new Quaternion(-14.995, 14.18, -13.07, 123.123), q3.plus(q2));
        assertEquals(new Quaternion(2.0, 2.0, 2.0, 2.0), q1.plus(q1));
        assertEquals(new Quaternion(-14.0, 13.45, -15.4, 1.0), q1.plus(q3));
    }

    @Test
    public void minus() throws Exception {
        assertEquals(new Quaternion(0.0, 0.0, 0.0, 0.0), q1.minus(q1));
        assertEquals(new Quaternion(0.995, -0.73, -2.33, -122.123), q1.minus(q2));
        assertEquals(new Quaternion(16.0, -11.45, 17.4, 1.0), q1.minus(q3));
        assertEquals(new Quaternion(-15.005, 10.72, -19.73, -123.123), q3.minus(q2));
    }

    @Test
    public void scalarMultiply() throws Exception {
        assertEquals(new Quaternion(0.0, 0.0, 0.0, 0.0), q1.scalarMultiply(0.0));
        assertEquals(new Quaternion(0.25, 86.5, 166.5, 6156.15), q2.scalarMultiply(50.0));
        assertEquals(new Quaternion(-263.4, 218.622, -287.984, 0.0), q3.scalarMultiply(17.56));
        assertEquals(new Quaternion(-222.222, -222.222, -222.222, -222.222), q1.scalarMultiply(-222.222));
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(new Quaternion(-2.0, 2.0, 2.0, 2.0), q1.multiply(q1));
        assertEquals(new Quaternion(-128.178, 121.528, -118.058, 124.728), q1.multiply(q2));
        assertEquals(new Quaternion(-11.05, -18.95, -43.85, 13.85), q3.multiply(q1));
        assertEquals(new Quaternion(-11.05, 13.85, -18.95, -43.85), q1.multiply(q3));
        assertEquals(new Quaternion(32.9985, 1993.3294, 1482.8494, -1916.6755), q2.multiply(q3));
    }

    @Test
    public void inv() throws Exception {

    }

    @Test
    public void getScalarPart() throws Exception {

    }

    @Test
    public void getVectorPart() throws Exception {

    }

    @Test
    public void createFromAxisAndAngle() throws Exception {

    }

    @Test
    public void getAxis() throws Exception {

    }

    @Test
    public void getAngle() throws Exception {

    }


}