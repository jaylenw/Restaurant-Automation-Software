/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantautomation;

/**
 *  The class will contain all the information about a specific table and update
 *  as needed to accommodate for any information that will need to be added or extracted to each table
 * 
 *  Keep in mind that the 'tables' in the GUI are only buttons and DO NOT hold any
 *  data other that regular button data.
 * 
 */
class Table {
    /** Free = 0  |  Dirty = 1  |  Used = 2 */
    int availability;
    /** The total number of guests the table CAN sit */
    int maxGuests;
    /** The current number of guests the table is sitting */
    int curGuests;
    
    public Table () {
        availability = 0;
        maxGuests = 4;
        curGuests = 0;
    }

    public int getAvailability() {
        return availability;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public int getCurGuests() {
        return curGuests;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public void setCurGuests(int curGuests) {
        this.curGuests = curGuests;
    }
    
    public void addGuest () {
        this.curGuests++;
    }
    
    public void removeGuest () {
        this.curGuests--;
    }
    
}
