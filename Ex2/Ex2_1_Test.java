package Ex2.Ex2_1;

import junit.framework.*;

public class EmployeeTest extends TestCase {
    Employee aEmployee3 = new Employee("Nam", 20);
    Employee aEmployee1 = new Employee("Mai", 30);
    Employee aEmployee2 = new Employee("Minh", 102);

    public void testWage() {
    	assertEquals(aEmployee3.wage(), 240);
    	assertEquals(aEmployee1.wage(), 360);
    	assertEquals(aEmployee2.wage(), 1224);
    }

    public void testTax() {
    	assertEquals(aEmployee3.tax(), 36.0, 0.001);
    	assertEquals(aEmployee1.tax(), 54.0, 0.001);
    	assertEquals(aEmployee2.tax(), 183.6, 0.001);
    }

    public void testNetpay() {
    	assertEquals(aEmployee3.netpay(), 204.0, 0.001);
    	assertEquals(aEmployee1.netpay(), 306.0, 0.01);
    	assertEquals(aEmployee2.netpay(), 1040.4, 0.01);
    }
    
    public void testRaisedWage() {
    	assertEquals(aEmployee3.raisedWage(), 254, 0.001);
    	assertEquals(aEmployee1.raisedWage(), 374.0, 0.001);
    	assertEquals(aEmployee2.raisedWage(), 1238.0, 0.001);
    }
    
    public void testCheckOverTime() {
    	assertFalse(aEmployee3.checkOvertime());
    	assertFalse(aEmployee1.checkOvertime());
    	assertTrue(aEmployee2.checkOvertime());
    }
}
