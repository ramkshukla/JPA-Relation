package com.example.springboot.model.manyToMany;

import com.example.springboot.entity.manyToMany.Stream;
import com.example.springboot.entity.manyToMany.Viewer;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreamViewerDTO {
    private String message;
    private String status;
    private Iterable<Stream> streams;
    private Iterable<Viewer> viewers;

    public StreamViewerDTO() {

    }

    public StreamViewerDTO(String message, String status, Iterable<Stream> streams, Iterable<Viewer> viewers) {
        this.message = message;
        this.status = status;
        this.streams = streams;
        this.viewers = viewers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Iterable<Stream> getStreams() {
        return streams;
    }

    public void setStreams(Iterable<Stream> streams) {
        this.streams = streams;
    }

    public Iterable<Viewer> getViewers() {
        return viewers;
    }

    public void setViewers(Iterable<Viewer> viewers) {
        this.viewers = viewers;
    }
}
