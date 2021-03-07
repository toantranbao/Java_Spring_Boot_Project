package mypack;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {

   @GetMapping(value = "/api/test")
    public ResponseEntity<String> testSpringBoot() {
        return ResponseEntity.ok("Success");
    }
   
   /*
    * This function is using to ....
    * Developed by Vuong
    * Date: 
    * */
   @GetMapping(value = "/api/read/employees")
   public ResponseEntity<String> r_employees() {
       return ResponseEntity.ok("Success");
   }
   
   /*
    * This function is using to ....
    * Developed by Quan
    * Date: 
    * */
   @GetMapping(value = "/api/write/employee")
   public ResponseEntity<String> w_employee() {
       return ResponseEntity.ok("Success");
   }
   
   /*
    * This function is using to ....
    * Developed by Len
    * Date: 
    * */
   @GetMapping(value = "/api/read/employeeByName")
   public ResponseEntity<String> r_employeeByName() {
       return ResponseEntity.ok("Success");
   }
}