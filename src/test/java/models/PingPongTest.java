package models;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PingPongTest {
    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }

    @Test
    public void rungPingPong_CountIpToGivenNumber_ArrayList() throws Exception {
        PingPong testPingPong = new PingPong();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput,testPingPong.runPingPong(2));

    }

    @Test
    public void runPingPong_replaceMultipleOfThree_ArrayList() {

        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutPut = new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        assertEquals(expectedOutPut,testPingPong.runPingPong(3));

    }

    @Test
    public void runPingPong_replaceMultipleOf5_ArrayList() {

        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutPut = new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        assertEquals(expectedOutPut,testPingPong.runPingPong(5));
    }

    @Test
    public void runPingPong_replaceMultiplesOfThreeAndFive_ArrayList() {

        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutPut = new ArrayList<Object>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        expectedOutPut.add("ping");
        expectedOutPut.add(4);
        expectedOutPut.add("pong");
        expectedOutPut.add("ping");
        expectedOutPut.add(7);
        expectedOutPut.add(8);
        expectedOutPut.add("ping");
        expectedOutPut.add("pong");
        expectedOutPut.add(11);
        expectedOutPut.add("ping");
        expectedOutPut.add(13);
        expectedOutPut.add(14);
        expectedOutPut.add("pingpong");
        assertEquals(expectedOutPut,testPingPong.runPingPong(15));

    }
}