package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name="TicketTable")
public class Ticket {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer ticketId;
@NonNull
private String ticketName;
@NonNull
private String ticketDescription;
@NonNull
private String ticketAssignTo;
@NonNull
private  LocalDate ticketCreatedDate;
@NonNull
private  LocalDate ticketUpdatedDate;
@NonNull
private Integer ticketEstimatedTime;
@NonNull
private Boolean showTicket=true;
@NonNull
private Integer status;
}
