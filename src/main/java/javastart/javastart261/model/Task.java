package javastart.javastart261.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private Category category;
    private boolean isReady;
    private boolean isArchived;

    private LocalDate deadline;
    private LocalDate finishDate;
    private int durationInDays;

    public Task() {
    }

    public Task(String description, Category category, boolean isReady, boolean isArchived, LocalDate deadline, LocalDate finishDate) {
        this.description = description;
        this.category = category;
        this.isReady = isReady;
        this.isArchived = isArchived;
        this.deadline = deadline;
        this.finishDate = finishDate;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

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

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public void calculateDuration(){

    }

    @Override
    public String toString() {
        return "id=" + id +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", isReady=" + isReady +
                ", isArchived=" + isArchived +
                ", deadline=" + deadline +
                ", finishDate=" + finishDate +
                ", durationInDays=" + durationInDays ;

    }


}

