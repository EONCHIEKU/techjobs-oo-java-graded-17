package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
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

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String firstChar = String.valueOf(job1.toString().charAt(0));
//        String lastChar = String.valueOf(job1.toString().charAt(job1.toString().length()-1));
//        assertEquals(firstChar, lineSeparator());
//        assertEquals(lastChar, lineSeparator());
        assertTrue(job1.toString().startsWith(lineSeparator()));
        assertTrue(job1.toString().endsWith(lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String display = lineSeparator()+
                "ID: " + job1.getId() + lineSeparator() +
                "Name: Product tester" + lineSeparator() +
                "Employer: ACME" + lineSeparator() +
                "Location: Desert" + lineSeparator() +
                "Position Type: Quality control" + lineSeparator() +
                "Core Competency: Persistence" + lineSeparator();
        assertEquals(display, job1.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType(""), new CoreCompetency("Persistence"));
        String display = lineSeparator()+
                        "ID: " + job1.getId() +lineSeparator()+
                        "Name: Product tester" + lineSeparator() +
                        "Employer: Data not available" + lineSeparator() +
                        "Location: Desert" + lineSeparator() +
                        "Position Type: Data not available" + lineSeparator() +
                        "Core Competency: Persistence" + lineSeparator();
        assertEquals(display, job1.toString());
    }



}
