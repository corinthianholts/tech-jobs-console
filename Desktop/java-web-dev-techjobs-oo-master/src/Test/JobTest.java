package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

public class JobTest {
	Job test_jobA;
	Job test_jobB;
	Job test_jobC;
	Job test_jobD;
	Job test_jobE;
	Job test_jobF;
	
	@Before	
	public void createJobs() {
		test_jobA = new Job();
		test_jobB = new Job();
		test_jobC = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
		test_jobD = new Job("Web Designer", new Employer("World Wide Webs"), new Location("Denver"), new PositionType("Front-end-development"), new CoreCompetency("Design Skills"));
		test_jobE = new Job("Web Designer", new Employer("World Wide Webs"), new Location("Denver"), new PositionType("Front-end-development"), new CoreCompetency("Design Skills"));
		test_jobF = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
	}
	
	@Test
	public void testSettingJobId(){
		Assert.assertTrue(test_jobA.getId() == (test_jobB.getId() - 1));
	}
	
	
	@Test
	public void testJobConstructorSetsAllFields() {
		Assert.assertTrue(test_jobC instanceof Job);
		Assert.assertTrue(test_jobC.getEmployer().getValue() == "ACME");
		Assert.assertTrue(test_jobC.getLocation().getValue() == "Desert");
		Assert.assertTrue(test_jobC.getPositionType().getValue() == "Quality control");
		Assert.assertTrue(test_jobC.getCoreCompetency().getValue() == "Persistence");
	}
	
	
	@Test
	public void testJobsForEquality() {
		Assert.assertFalse(test_jobD.equals(test_jobE));
	}
	
	@Test
	public void testToString() {
		Assert.assertTrue(test_jobC.toString().startsWith("\n") && test_jobC.toString().endsWith("\n"));
	}
	
	@Test
	public void testToStringTwo() {
		Assert.assertEquals(test_jobC.toString(), 
				"\n" +
    			"ID: " + test_jobC.getId() + "\n" +
    			"Name: " + test_jobC.getName() + "\n" +
    			"Employer: " + test_jobC.getEmployer().getValue() + "\n" +
    			"Location: " + test_jobC.getLocation().getValue() + "\n" +
    			"Position Type: " + test_jobC.getPositionType().getValue() + "\n" +
    			"Core Competency: " + test_jobC.getCoreCompetency().getValue() +
    			"\n");
	}
	
	@Test
	public void testToStringThree() {
		Assert.assertEquals(test_jobF.toString(), 
				"\n" +
    			"ID: " + test_jobF.getId() + "\n" +
    			"Name: " + test_jobF.getName() + "\n" +
    			"Employer: " + "Data not available" + "\n" +
    			"Location: " + test_jobF.getLocation().getValue() + "\n" +
    			"Position Type: " + "Data not available" + "\n" +
    			"Core Competency: " + test_jobF.getCoreCompetency().getValue() +
    			"\n");
	}
	
	
}
