package com.test_amigo;

import com.test_amigo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args)
    {
        SpringApplication.run(Main.class,args);
    }
  // return only string
    //@GetMapping("/ha")
    public String get()
    {
        return "hello";
    }

    // return json object
    @GetMapping("/hajson")
    public test_json_response getj()
    {
        return new test_json_response("haha",List.of("java","c","cpp"),new Person("masud",21,5123.45));
    }

    //record test_json_response(String msg){}

    // using record or this below class does the same work does with jackson library
   /* class test_json_response
    {
        private final  String msg;

        test_json_response(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

//edi ken dilo ke jane
        @Override
        public String toString() {
            return "test_json_response{" +
                    "msg='" + msg + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            test_json_response that = (test_json_response) o;
            return Objects.equals(msg, that.msg);
        }

        @Override
        public int hashCode() {
            return Objects.hash(msg);
        }


    }*/
    record Person(String name,int age,double salary){}
    record test_json_response(String msg, List<String> fav_animal,Person person){}



    @GetMapping("/studentmain")
    public List<Student> hello(){
        return List.of(new Student("mas",12,1));
    }

}
