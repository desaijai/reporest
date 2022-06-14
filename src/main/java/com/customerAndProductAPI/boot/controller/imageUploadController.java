package com.customerAndProductAPI.boot.controller;

import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
@RequestMapping("/uploadimage")
public class imageUploadController {

    @PostMapping
    public String uploadImage(@RequestParam("file") MultipartFile file)throws Exception{
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getName());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());

  //first way :-
//         String path_directory="/home/itcpu066/Jay/customerAndProductAPI/src/main/resources/static/image";
        //second way is below which is more dynamic
        String path_directory=new ClassPathResource("/static/image/").getFile().getAbsolutePath();
        Files.copy(file.getInputStream(), Paths.get(path_directory+ File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

        return "successfully image upload!";
    }

}
