package org.example.reto.model;

import java.util.Objects;

public class Email {

    private String email;
    private String domain; // Dominio del correo
    private String send;
    private Boolean status; // Estado

    public Email(String email, String domain, String send, Boolean status) {
        this.email = email;
        this.domain = domain;
        this.send = send;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getSend() {
        return send;
    }

    public String getDomain() {
        return domain;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", domain='" + domain + '\'' +
                ", send='" + send + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;
        Email email1 = (Email) o;
        return Objects.equals(getEmail(), email1.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}
