package com.example.soapconsumer.model;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class Alert{
    public String sender_name;
    public String event;
    public int start;
    public int end;
    public String description;
    public ArrayList<Object> tags;
}

