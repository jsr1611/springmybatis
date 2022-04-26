package online.uzdevs.springmybatis.dao;

import online.uzdevs.springmybatis.entity.Employee;
import online.uzdevs.springmybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeMapper {
    public List<Employee> getAllEmployees(){
        SqlSession session = MyBatisUtil.getSessionFactory().openSession();
        List<Employee> employeeList = session.selectList("getAllEmployees");
        session.commit();
        session.close();
        return employeeList;
    }
}
