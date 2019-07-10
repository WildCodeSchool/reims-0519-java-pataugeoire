package main.java.com.wcs.entities;

public class Army{
    private String pedalo;
    private String gonflable;
    private String barque;
    private String aviron;

    public String getPedalo() {
        return pedalo;
    }

    public void setPedalo(String pedalo) {
        this.pedalo = pedalo;
    }

    public String getGonflable() {
        return gonflable;
    }

    public void setGonflable(String gonflable) {
        this.gonflable = gonflable;
    }

    public String getBarque() {
        return barque;
    }

    public void setBarque(String barque) {
        this.barque = barque;
    }

    public String getAviron() {
        return aviron;
    }

    public void setAviron(String aviron) {
        this.aviron = aviron;
    }

    public Army(String pedalo, String gonflable, String barque, String aviron) {
        this.pedalo = pedalo;
        this.gonflable = gonflable;
        this.barque = barque;
        this.aviron = aviron;
    }
    
}