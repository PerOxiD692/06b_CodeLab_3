import java.time.LocalDate;

public class Service {
    
static int rechner (int hiredYear){
    LocalDate today = LocalDate.now();
    int currentYear = today.getYear();
    int years = currentYear-hiredYear;
    return years;
} //end rechner

} //end Class
