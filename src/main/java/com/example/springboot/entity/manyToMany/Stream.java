package com.example.springboot.entity.manyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Stream")
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickName;

    @ManyToMany
    @JoinTable(
            name = "followed_streams",
            joinColumns = @JoinColumn(name = "stream_id"),
            inverseJoinColumns = @JoinColumn(name = "viewer_id")

    )
    @JsonManagedReference
    private List<Viewer> followers = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<Viewer> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Viewer> followers) {
        this.followers = followers;
    }
}
