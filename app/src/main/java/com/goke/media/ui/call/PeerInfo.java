package com.goke.media.ui.call;

public class PeerInfo {
    private int port;
    private String addr;

    PeerInfo(String addr, int port){
        this.addr = addr;
        this.port = port;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
