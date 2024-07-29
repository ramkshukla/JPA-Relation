package com.example.springboot.entity.manyToMany;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Viewer")
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "followers")
    private Set<Stream> followerStream = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Stream> getFollowerStream() {
        return followerStream;
    }

    public void setFollowerStream(Set<Stream> followerStream) {
        this.followerStream = followerStream;
    }
}
