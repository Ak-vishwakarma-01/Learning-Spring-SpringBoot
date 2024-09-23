package com.example._howtouploadfile.responseentity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    @GetMapping("/get")
    public ResponseEntity<List<String>> hello() {
        List<String> list = new ArrayList<String>(Arrays.asList("Ankit","ramehs","sdfgh"));
        Collections.addAll(list,"naya","purana","dhurana");

        HttpHeaders headers = new HttpHeaders();
        headers.add("ankit","info");
        if(list.isEmpty()){
            return new ResponseEntity<List<String>>(Arrays.asList(("nahi mila error hai mtlab empyt hia")),headers, HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<List<String>>(list,headers, HttpStatus.OK);
        }

    }

    @GetMapping("/hi")
    public ResponseEntity<String>hii(){
        return ResponseEntity.ok("hello");
    }
}
