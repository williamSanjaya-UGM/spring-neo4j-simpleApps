package com.example.springneo4j.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Customer {

    @Id
    private int cid;
    private String name;
    private String[] address;
//    @Relationship(type = "Purchase", direction = Relationship.OUTGOING)
    @Relationship(type = "Purchase", direction = Relationship.INCOMING)
    private List<Product> products;

    public Customer() {
    }

    public Customer(int cid, String name, String[] address, List<Product> products) {
        this.cid = cid;
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
