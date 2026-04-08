/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreservationsystem.model;

public class Ticket {
    private String ticketNo;
    private Passenger passenger;
    private Train train;

    public Ticket(String ticketNo, Passenger passenger, Train train) {
        this.ticketNo = ticketNo;
        this.passenger = passenger;
        this.train = train;
    }

    public String getTicketNo() {
        return ticketNo;
    }
}
