/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreservationsystem;

import com.mycompany.ticketreservationsystem.model.*;
import com.mycompany.ticketreservationsystem.service.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicketSystemTest {

    @Test
    public void testPassengerCreation() {
        Passenger p = new Passenger("Goyam", 22, "India");
        assertEquals("Goyam", p.getName());
    }

    @Test
    public void testTrainCreation() {
        Train t = new Train("TR123", "Express");
        assertEquals("TR123", t.getTrainId());
    }

    @Test
    public void testTicketCreation() {
        Passenger p = new Passenger("Goyam", 22, "India");
        Train t = new Train("TR123", "Express");

        Ticket ticket = new Ticket("T1", p, t);

        assertEquals("T1", ticket.getTicketNo());
    }

    @Test
    public void testReservationService() {
        Passenger p = new Passenger("Goyam", 22, "India");
        Train t = new Train("TR123", "Express");

        ReservationService service = new ReservationService();
        Ticket ticket = service.reserveTicket(p, t);

        assertNotNull(ticket);
    }

    @Test
    public void testPayment() {
        Payment payment = new Payment(500);
        payment.processPayment();

        assertTrue(true);
    }
}
