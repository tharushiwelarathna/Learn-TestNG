package testNG.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {


    @DataProvider
//    array object ekak return karana nisa void dnna baha
    public Object[][] getData(){
        Object[][] data = {
                {"abc@gmail.com","abc123"},{"def@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}
        };
        return data;
    }
}
