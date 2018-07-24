package com.user.library.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "book")
public class Book extends BaseModel{

    private String title;

    private Date publishDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @LazyCollection(LazyCollectionOption.TRUE)
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "books")
    private List<Author> authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

//    public User getUser() {
//        return user;
//    }

    public void setUser(User user) {
        this.user = user;
    }

//    public List<Author> getAuthors() {
//        return authors;
//    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishDate=" + publishDate +
                ", user=" + user +
                ", authors=" + authors +
                ", id=" + id +
                '}';
    }
}
