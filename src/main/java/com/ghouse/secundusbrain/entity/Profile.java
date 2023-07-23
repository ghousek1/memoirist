package com.ghouse.secundusbrain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("profile")
public class Profile {

    @Id
    private String userName;

    private String firstName;

    private String lastName;
    
    private String email;
    
    private String phone;

    private List<String> roles;

}
