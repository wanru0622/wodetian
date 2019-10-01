package com.ye.controller;



import com.ye.dao.DepartmentDao;
import domain.impl.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private DepartmentDao departmentDao;
//    @Autowired
//    private FeignDept feignDept;

    @RequestMapping("/index/{id}")
//    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public Department index(@PathVariable("id")int id){
//        String dept = feignDept.dept();
//        System.out.println(dept);
        Department department = departmentDao.selectByPrimaryKey(id);
//        if (department != null) {
//            throw new RuntimeException("error");
//        }
//        System.out.println(department);
//        List<ServiceInstance> instances = discoveryClient.getInstances("eureka");
//        System.out.println(instances);
        return department;
    }


    public String fallbackMethod(){
        return "fail11111";
    }

}
