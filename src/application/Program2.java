package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("===TEST 1: department insert ====");
		Department newDepartment = new Department(5, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("===TEST 2: department update ====");
		Department department = departmentDao.findById(1);
		department.setName("Computadores");
		departmentDao.update(department);
		System.out.println("Updated completed!");
		
		
		System.out.println("===TEST 3: department findById ====");
		department = departmentDao.findById(5);
		System.out.println(department);
		
		System.out.println("===TEST 4: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");


		
		sc.close();
		
	}
}
