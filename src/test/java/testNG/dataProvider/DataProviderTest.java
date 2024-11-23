package testNG.dataProvider;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
//    same class ekenma data pass krnwa ape test method ekta
//    @Test(dataProvider = "getData")
//    public void loginTest(String name, String pass){
//        System.out.println(name + " " + pass);
//    }
//    @DataProvider
////    array object ekak return karana nisa void dnna baha
////    string values methenta danwanm string kiyla dnnath puluwan Object[][] wenuwata
////    object danmama thiyena wasiya apata multiple data types assign krnna puluwan string dnmoth strin withrai
//    public Object[][] getData(){
////        object ekata return krnna data kiyla variable ekak hadagannwa
//        Object[][] data = {
////                multiple set of data me widiyta thiyan inna puluwan
//                {"abc@gmail.com","abc123"},{"def@gmail.com","abc123"},{"xyz@gmail.com","xyz123"}
//        };
//    public void nathnm aniwarenma ekata adala data eka return wenna ona
//        return data;
//    }

//    ......................................................

//    wena class ekakin provide karana test data ganna nisa methanadi thawa parameter ekak pass karanna ona dataProviderClass kiyla
    @Test(dataProvider = "getData", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String name, String pass){
        System.out.println(name + " " + pass);
    }
}
