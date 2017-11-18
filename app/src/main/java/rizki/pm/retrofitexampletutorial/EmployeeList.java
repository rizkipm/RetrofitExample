package rizki.pm.retrofitexampletutorial;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by rizkisyaputra on 11/18/17.
 */

public class EmployeeList {

    @SerializedName("employeeList")
    private ArrayList<Employee> employeeList;

    public ArrayList<Employee> getEmployeeArrayList() {
        return employeeList;
    }

    public void setEmployeeArrayList(ArrayList<Employee> employeeArrayList) {
        this.employeeList = employeeArrayList;
    }
}
