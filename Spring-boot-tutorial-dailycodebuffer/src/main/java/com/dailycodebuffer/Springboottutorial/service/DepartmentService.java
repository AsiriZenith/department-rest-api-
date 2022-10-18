package com.dailycodebuffer.Springboottutorial.service;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.exception.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
    public Department fetchDepartmentByName(String departmentName);
    public void deleteDepartmentById(Long departmentId);
    public Department updateDepartment(Long departmentId, Department department);
}
