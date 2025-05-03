package com.example.NgoApp.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String username;
    private String content;

    @Column(name = "people_no")
    private String peopleNo;

    private String tags;
    private String category;
    private String imageName;
    private String imageType;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageDate;

}
