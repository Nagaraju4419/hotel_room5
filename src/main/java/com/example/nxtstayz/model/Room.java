
package com.example.nxtstayz.model;

import javax.persistence.*;
import com.example.nxtstayz.model.Hotel;

@Entity
@Table(name = "room")
public class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int roomId;

  @Column(name = "roomnumber")
  private String roomName;

  @Column(name = "type")
  private String type;

  @Column(name = "price")
  private double price;

  @ManyToOne
  @JoinColumn(name = "hotelid")
  private Hotel hotel;

  public Room() {
  }

  public Room(int roomId, String roomName, String type, double price, Hotel hotel) {
    this.roomId = roomId;
    this.roomName = roomName;
    this.type = type;
    this.price = price;
    this.hotel = hotel;
  }

  public int getRoomId() {
    return roomId;
  }

  public void setRoomId(int roomId) {
    this.roomId = roomId;
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Hotel getHotel() {
    return hotel;
  }

  public void setHotel(Hotel hotel) {
    this.hotel = hotel;
  }
}
