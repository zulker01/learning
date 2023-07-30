package com.example.demo;

import DTO.PostDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.tags.Param;

import java.util.List;

@SpringBootApplication
@RestController
public class SimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
	@GetMapping("/demupath/haha")
	public String getj()
	{
		return "hahaha vodox";
	}
	@GetMapping("/demupath/getDTO")
	public PostDTO getdto()
	{
		return new PostDTO("2","muridemu");
	}
	@PostMapping("/demupath/postDTO")
	public PostDTO postdto(@RequestBody PostDTO postDTO)
	{
		return new PostDTO("3",postDTO.getData()+" muridemu post dto");
	}
	@PostMapping("/demupath/post")
	public String postj(@RequestParam("nam") String name)
	{
		return " helllo vodox "+name;
	}
}
