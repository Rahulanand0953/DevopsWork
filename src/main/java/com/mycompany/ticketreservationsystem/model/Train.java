/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ticketreservationsystem.model;


public class Train {
    private String trainId;
    private String model;

    public Train(String trainId, String model) {
        this.trainId = trainId;
        this.model = model;
    }

    public String getTrainId() {
        return trainId;
    }
}
