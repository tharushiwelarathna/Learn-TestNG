package simple.calculator.test;

import org.example.simple.calculator.ArithmeticOperator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ArithmeticOperatorDataProviderTest {
//dataProvider kiyla dala method ekak hadagannwa e method ekata api name ekak demu setOfData

    @Test(dataProvider = "setOFData")
    public void testSum(int input1, int input2, int expectedOutPut ) {
        Assert.assertEquals(ArithmeticOperator.calSum(input1,input2),expectedOutPut, "Failed to cal Sum");
    }
    @DataProvider(name = "setOFData")
    public Object[][] getData(){
        Object[][] data =
                {
                        {0,1,1},
                        {0,-1,-2},
                        {-2147483647,-1,-2147483648},
                        {2147483646,1,2147483647}
                };
        return  data;
    }

}