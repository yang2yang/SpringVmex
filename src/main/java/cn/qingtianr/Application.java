package cn.qingtianr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/**
 * Created by jack on 16-6-3.
 */

@MapperScan("cn.qingtianr.dao")
@SpringBootApplication
public class Application {
        public static void main(String[] args){
                SpringApplication.run(Application.class,args);
        }
}
