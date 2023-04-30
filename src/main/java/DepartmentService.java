import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
public class DepartmentService {
    public static List<Employee> getAllInDepart(){
        return Arrays.stream(EmployeeService.employees)
                .sorted(Comparator.comparingInt(Employee::getDepartment))
                .collect(Collectors.toList());

    }
    public static List<Employee> getAllByDepart(int id){
        return Arrays.stream(EmployeeService.employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartment() == id )
                .collect(Collectors.toList());

    }
}
