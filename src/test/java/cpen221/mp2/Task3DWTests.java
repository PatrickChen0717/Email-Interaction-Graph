package cpen221.mp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Task3DWTests {

    private static DWInteractionGraph dwig1;
    private static DWInteractionGraph dwig2;
    private static DWInteractionGraph dwig3;
    private static DWInteractionGraph dwig4;
    private static DWInteractionGraph dwig5;
    private static DWInteractionGraph dwig6;
    private static DWInteractionGraph dwig7;
    private static DWInteractionGraph dwig8;
    private static DWInteractionGraph dwig9;

    @BeforeAll
    public static void setupTests() {
        dwig1 = new DWInteractionGraph("resources/Task3Transactions1.txt");
        dwig2 = new DWInteractionGraph("resources/Task3Transactions2.txt");
        dwig3=  new DWInteractionGraph("resources/email-Eu-core-temporal-Dept1.txt");
        dwig4=  new DWInteractionGraph("resources/Task3self1.txt");
        dwig5=  new DWInteractionGraph("resources/email-Eu-core-temporal-Dept3.txt");
        dwig7=  new DWInteractionGraph("resources/email-Eu-core-temporal-Dept4.txt");
        dwig8=  new DWInteractionGraph("resources/email-Eu-core-temporal-Dept2.txt");
        dwig9=  new DWInteractionGraph("resources/email-Eu-core-temporal.txt");
    }

    @Test
    public void testBFSGraph1() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6);
        Assertions.assertEquals(expected, dwig1.BFS(1, 6));
    }

    @Test
    public void testDFSGraph1() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6);
        Assertions.assertEquals(expected, dwig1.DFS(1, 6));
    }

    @Test
    public void testBFSGraph2() {
        List<Integer> expected = Arrays.asList(1, 3, 5, 6, 4, 8, 7, 2, 9, 10);
        Assertions.assertEquals(expected, dwig2.BFS(1, 10));
    }

    @Test
    public void testDFSGraph2() {
        List<Integer> expected = Arrays.asList(1, 3, 4, 8, 5, 7,2,9);
        Assertions.assertEquals(expected, dwig2.DFS(1, 9 ));
    }
    @Test
    public void try1(){
      //  System.out.println(dwig3.DFS(6,314));
    }
    @Test
    public  void try2(){
      //  System.out.println(dwig3.BFS(6,314));
    }
    @Test
    public  void try3(){
       //System.out.println(dwig4.DFS(5,6));
       // System.out.println(dwig4.BFS(5,10));
        System.out.println("--------------");
        System.out.println("--------------");
       // System.out.println(dwig5.DFS(11,83));
        //System.out.println(dwig5.BFS(11,83));
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println(dwig9.DFS(18,933));
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println(dwig9.BFS(18,933));

    }
}
