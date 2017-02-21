
import org.junit.Test;

import static org.junit.Assert.*;

public class QuaternionTest {

    @Test
    public void norm() throws Exception {
        assertEquals(4.0, new Quaternion(1.0, 1.0, 1.0, 1.0).norm(), 1.0e-5);
        assertEquals(21.0, new Quaternion(0.0, 2.0, 1.0, 4.0).norm(), 1.0e-5);
        assertEquals(140.7443, new Quaternion(5.15, 10.0, 1.77, 3.33).norm(), 1.0e-5);
    }

    @Test
    public void module() throws Exception {
        assertEquals(1.0, new Quaternion(1.0, 0.0, 0.0, 0.0).module(), 1.0e-5);
        assertEquals(2.0, new Quaternion(1.0, 1.0, 1.0, 1.0).module(), 1.0e-5);
        assertEquals(19.952, new Quaternion(1.25, 15.0, 3.33, 12.666).module(), 1.0e-3);
    }

    @Test
    public void conjugate() throws Exception {

    }

    @Test
    public void plus() throws Exception {

    }

    @Test
    public void minus() throws Exception {

    }

    @Test
    public void scalarMultiply() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

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