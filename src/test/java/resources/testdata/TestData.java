package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "jobcriteria")
    public Object[][] getData(){
        Object[][] data =  new Object[][]{
                {"Tester","Harrow","up to 5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Developer","Hampshire","up to 7 miles","32000","51000","Per annum","Permanent","Permanent Developer jobs in Hampshire"},
//                {"Test Engineer","Hertfordshire","up to 10 miles","35000","55000","Per annum","Permanent","Permanent Test Engineer jobs in Hertfordshire"},
//                {"Test Manager","Longford County","up to 15 miles","37000","60000","Per annum","Permanent","Permanent Test Manager jobs in Longford County"},
//                {"Test Technician","Heston, Greater London","up to 10 miles","40000","60000","Per annum","Permanent","Permanent Test Technician jobs in Heston"},

                       };
        return data;
    }
}
