package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    //methanadi me wade kara ganna java walin ne me conditions statements e wenuwata testng laba dipu de thama assertion kiynne
//    testng meka eka line eken kara ganna laba dipu de thama assertion kiynne.

//    String name = "Tharushi";
//    @Test
//    public void valuesEqualCheck(){
//        if(name.equals("Tharushi")) {
//            System.out.println("Name is Equal");
//        }else {
//            System.out.println("Name is not Equal");
//        }
//    }


//    hard assertion
//public class AssertionTest {
    //    String name = "Tharushi";
//      @Test(priority = 0)
//    public void valuesEqualCheck(){
//        String expectedValue = "Tharushi";
//        System.out.println("Prior to valuesEqualCheck assertion");
//        softAssert.assertEquals(actualValue,expectedValue,"Values miss matched");
//        System.out.println("After valuesEqualCheck assertion");
//
//    }
//    @Test(priority = 1)
//    public void valuesNotEqualCheck() {
//        String expectedValue = "Learn Well";
//        System.out.println("Prior to valuesNotEqualCheck assertion");
//        Assert.assertNotEquals(actualValue, expectedValue, "values matched");
//        System.out.println("After to valuesNotEqualCheck assertion");
//
//    }
//
//    @Test(priority = 2)
//    public void trueConditionCheck() {
//        System.out.println("Prior to trueConditionCheck assertion");
//        Assert.assertTrue(actualValue.startsWith("T"), "Condition Return a False");
//        System.out.println("After to trueConditionCheck assertion");
//
//    }
//
//    @Test(priority = 3)
//    public void falseConditionCheck() {
//        System.out.println("Prior to falseConditionCheck assertion");
//        Assert.assertFalse(actualValue.isBlank(), "Condition Return a True");
//        System.out.println("After to falseConditionCheck assertion");
//
//    }
//}


SoftAssert softAssert = new SoftAssert();
    String actualValue = "Tharushi";

    @Test(priority = 0)
    public void valuesEqualCheck(){
        String expectedValue = "Tharushi";
        System.out.println("Prior to valuesEqualCheck assertion");
        softAssert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After valuesEqualCheck assertion");
        softAssert.assertAll(); //meka call karoth withrai exception ekak ghanne fail wunothin - softAssert.assertAll()

    }

    @Test(priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue = "Learn Well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        softAssert.assertNotEquals(actualValue,expectedValue,"values matched");
        System.out.println("After to valuesNotEqualCheck assertion");

    }

    @Test(priority = 2)
    public void trueConditionCheck(){
        System.out.println("Prior to trueConditionCheck assertion");
        softAssert.assertTrue(actualValue.startsWith("T"),"Condition Return a False");
        System.out.println("After to trueConditionCheck assertion");

    }

    @Test(priority = 3)
    public void falseConditionCheck(){
        System.out.println("Prior to falseConditionCheck assertion");
        softAssert.assertFalse(actualValue.isBlank(),"Condition Return a True");
        System.out.println("After to falseConditionCheck assertion");

    }



}
