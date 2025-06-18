package com.vomav.refresher.data.entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name="db_Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID", columnDefinition = "UUID")
   private UUID Id;
   private String email;
    private String name;
    private String surname;
    private UUID currentTenant_ID;
    private String password;
    private String previousPassword;
   private String refreshToken;
    private Boolean isActivated;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UUID getCurrentTenant_ID() {
        return currentTenant_ID;
    }

    public void setCurrentTenant_ID(UUID currentTenant_ID) {
        this.currentTenant_ID = currentTenant_ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreviousPassword() {
        return previousPassword;
    }

    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Boolean getActivated() {
        return isActivated;
    }

    public void setActivated(Boolean activated) {
        isActivated = activated;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentTenant_ID=" + currentTenant_ID +
                ", password='" + password + '\'' +
                ", previousPassword='" + previousPassword + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", isActivated=" + isActivated +
                '}';
    }
}
