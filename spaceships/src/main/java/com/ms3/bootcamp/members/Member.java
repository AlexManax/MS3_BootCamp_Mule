package com.ms3.bootcamp.members;

public class Member {

    private Integer idMember;
    private String nameMember;
    private int rankMember;
    private Integer idShip;

    public Member() {
    }

    public Member(Integer idMember, String nameMember, int rankMember, Integer idShip) {
        this.idMember = idMember;
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

    public Member(String nameMember, int rankMember, Integer idShip) {
        this.nameMember = nameMember;
        this.rankMember = rankMember;
        this.idShip = idShip;
    }

    public Integer getIdMember() {
        return idMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    public int getRankMember() {
        return rankMember;
    }

    public Integer getIdShip() {
        return idShip;
    }
    
    public void setIdMember(Integer idMember) {
        this.idMember = idMember;
    }
    
    public void setIdShip(Integer idShip) {
        this.idShip = idShip;
    }
}
