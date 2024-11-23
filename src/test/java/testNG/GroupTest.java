package testNG;

import org.testng.annotations.Test;

public class GroupTest {
    // S = smoke test
    // R = regression
    @Test(groups = {"S","R"})
    public void test01(){
        System.out.println("This is smoke and regression test case");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("This is regression test case");
    }
    @Test
    public void test03(){
        System.out.println("This is not smoke and regression test case");
    }
    @Test(groups = {"S"})
    public void test04(){
        System.out.println("This is smoke test case");
    }
    @Test(groups = {"S", "R"})
    public void test05(){
        System.out.println("This is smoke and regression test cas");
    }

}
