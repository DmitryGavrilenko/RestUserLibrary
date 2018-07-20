package com.user.library.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "author")
public class Author extends BaseModelForAuthorAndUser {

    private Date birthday;

    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Book> books;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "birthday=" + birthday +
                ", books=" + books +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
