package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJodId(){
       Job job1 = new Job();
       Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotNull(job1.getName());
        assertEquals("Product tester", job1.getName());

        assertNotNull(job1.getEmployer());
        assertEquals("ACME", job1.getEmployer().getValue());

        assertNotNull(job1.getLocation());
        assertEquals("Desert", job1.getLocation().getValue());

        assertNotNull(job1.getPositionType());
        assertEquals("Quality control", job1.getPositionType().getValue());

        assertNotNull(job1.getCoreCompetency());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }



}
