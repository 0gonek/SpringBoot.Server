package com.ogonek.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;
    @Column(name = "longitude", nullable = false)
    private double longitude;
    @Column(name = "latitude", nullable = false)
    private double latitude;
    @Column(name = "name", nullable = false, length = 50)  // Or will bw taken from the field's name
    private String name;
    @Column(name = "description", nullable = true, length = 300)
    private String description;
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;
    @Column(name = "price", nullable = true)
    private Integer price;
    @Column(name = "duration", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date duration;
    @Column(name = "ownerID", nullable = false)
    private long ownerID;
    @Column(name = "groupID", nullable = true)
    private Long groupID;
    @Column(name = "membersID", nullable = true)
    private Long[] membersID;

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setOwnerID(long ownerID) {
        this.ownerID = ownerID;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public long getOwnerID() {
        return ownerID;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public void setMembersID(Long[] membersID) {
        this.membersID = membersID;
    }

    public Long[] getMembersID() {

        return membersID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public Long getGroupID() {

        return groupID;
    }

    public Date getDuration() {

        return duration;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {

        return price;
    }

    public Event() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getEventDate() {
        return eventDate;
    }
}