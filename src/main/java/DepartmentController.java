import java.util.List;
public class DepartmentController {
    public List<Employee> getAllInDepart(){
        return DepartmentService.getAllInDepart();
    }
    public List<Employee> getAllByDepart(Integer id) {
        return DepartmentService.getAllByDepart(id);
    }
}
