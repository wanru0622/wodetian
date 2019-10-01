package domain.fallback;


import domain.impl.FeignDept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class DeptException implements FallbackFactory<FeignDept> {

    public FeignDept create(final Throwable cause) {
        return new FeignDept() {
            public String dept(@PathVariable("id") int id) {
                cause.printStackTrace();
                return "FallbackFactory---dept";
            }

            public String dept2() {
                return null;
            }
        };
    }
}
