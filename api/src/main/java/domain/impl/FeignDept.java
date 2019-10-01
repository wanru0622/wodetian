package domain.impl;


import domain.fallback.DeptException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("DEPT")
@FeignClient(value = "DEPT",fallbackFactory = DeptException.class)
public interface FeignDept {

    @RequestMapping("/index/{id}")
    String dept(@PathVariable("id") int id);


    @RequestMapping("/index2")
    String dept2();


}
