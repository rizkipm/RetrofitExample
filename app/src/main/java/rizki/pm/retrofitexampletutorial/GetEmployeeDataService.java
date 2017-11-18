package rizki.pm.retrofitexampletutorial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rizkisyaputra on 11/18/17.
 */

public class GetEmployeeDataService {
    @GET("retrofit-demo.php")
    Call<EmployeeList> getEmployeeData(@Query("company_no") int companyNo) {
        return null;
    }
}
