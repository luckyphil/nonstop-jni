package org.itug.nonstopjni;public class GuardianProcedure{	static {		System.loadLibrary("NonstopJniNative");	}		public native short[] get48BitTimestamp();	 public static void main(String[] s) {	  GuardianProcedure gp = new GuardianProcedure();	  short timestamp[] = null;		timestamp = gp.get48BitTimestamp();		        System.out.println("Timestamp Words "  + timestamp[0] + ":" + timestamp[1]+":" + timestamp[2]);	  	 }}