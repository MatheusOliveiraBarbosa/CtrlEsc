/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.monteiro.ads.ctrlesc.model.usefulClasses;

/**
 *
 * @author E.Wellington
 */
public class ElectionTitle {

    public ElectionTitle(int number, int section, int zone, String stateEmitter) {
        this.number = number;
        this.section = section;
        this.zone = zone;
        this.stateEmitter = stateEmitter;
    }
    
    
    
    private int number;
    
    private int section;
    
    private int zone;
    
    private String stateEmitter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getStateEmitter() {
        return stateEmitter;
    }

    public void setStateEmitter(String stateEmitter) {
        this.stateEmitter = stateEmitter;
    }
    
    
}
