package ar.com.educationit.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educationit.entity.Posts;
import ar.com.educationit.feign.FeignClient;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/posts")
@RequiredArgsConstructor
public class jsonPlaceHolderResourse {

	    private final FeignClient feignClient;
	    @GetMapping
	    public ResponseEntity readData (@RequestParam(required = false) List<Posts> posts) {
	
	        return ResponseEntity.ok(feignClient.readPosts());
	    }
	
	
}
