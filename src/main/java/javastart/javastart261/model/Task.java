package javastart.javastart261.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    // private Category category;
    private boolean isReady; //wyświetla się normalnie
    private boolean isArchived; //wyświetla się tylko w archiwum

    //Date deadline
    //Time finishDate
    //Date duration


    public Task() {
    }

    public Task(String description, Category category, boolean isReady, boolean isArchived) {

        this.description = description;
        //   this.category = category;
        this.isReady = isReady;
        this.isArchived = isArchived;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setArchived(boolean archived) {
        isArchived = archived;
    }


}

