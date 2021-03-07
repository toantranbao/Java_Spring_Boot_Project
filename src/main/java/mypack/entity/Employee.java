package mypack.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPLOYEE", schema = "public")
public class Employee {
	
	@Id
	@Column(name = "EMPLOYEE_ID")
	private String employeeId;
	@Column(name = "EMPLOYEE_NAME")
	private String employeeName;
	@Column(name = "BIRTH_OF_DATE")
	private Date birthday;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "ACTIVE")
	private String active;
}
