public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    public Employee getMaxWage(Integer id){
        return service.getMaxWage(id);
    }
    public Employee getMinWage(Integer id){
        return EmployeeService.getMinWage(id);
    }
}