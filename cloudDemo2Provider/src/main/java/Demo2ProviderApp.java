import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2019/9/20.
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(value = "com.lanxin")
@MapperScan(value = "com.lanxin.dao")
public class Demo2ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(Demo2ProviderApp.class,args);
    }
}
