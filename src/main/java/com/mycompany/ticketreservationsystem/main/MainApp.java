/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ticketreservationsystem.main;

import com.mycompany.ticketreservationsystem.model.*;
import com.mycompany.ticketreservationsystem.service.*;
import com.mycompany.ticketreservationsystem.database.*;

public class MainApp {

    public static void main(String[] args) {
        Passenger p = new Passenger("Goyam", 22, "India");
        Train t = new Train("TR123", "Express");
        ReservationService service = new ReservationService();
        RailwayDatabase db = new RailwayDatabase();
        Ticket ticket = service.reserveTicket(p, t);
        db.save(ticket);
        Payment payment = new Payment(500);
        service.makePayment(payment);
        service.cancelTicket(ticket);
    }
}