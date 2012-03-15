package org.itug.nonstopjni;
import org.junit.*;
import static org.junit.Assert.*;


public class GuardianProcedureTest {




	@Test
	public void testget48BitTimestamp() {
		GuardianProcedure gp = new GuardianProcedure();
		
		short timestamp[] = null;
		timestamp = gp.get48BitTimestamp();
		assertNotNull("get48BitTimestamp", timestamp);
		assertEquals("timestamp length", 3, timestamp.length );
        System.out.println("Timestamp Words "  + timestamp[0] + ":" + timestamp[1]+":" + timestamp[2]);
	}
}
