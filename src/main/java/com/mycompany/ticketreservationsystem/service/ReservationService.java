/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreservationsystem.service;

import com.mycompany.ticketreservationsystem.model.*;

public class ReservationService {

    public Ticket reserveTicket(Passenger passenger, Train train) {
        System.out.println("Reserving ticket...");
        return new Ticket("T" + System.currentTimeMillis(), passenger, train);
    }

    public void cancelTicket(Ticket ticket) {
        System.out.println("Ticket cancelled: " + ticket.getTicketNo());
    }

    public void makePayment(Payment payment) {
        payment.processPayment();
    }
}