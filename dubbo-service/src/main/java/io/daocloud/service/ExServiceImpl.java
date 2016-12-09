package io.daocloud.service;

import java.net.InetAddress;

public class ExServiceImpl implements ExService {

    public String getName() {
        String ip;
        try {
            InetAddress addr = InetAddress.getLocalHost();
            ip = addr.getHostAddress();
        } catch(Exception ex) {
            ip = "";
        }

        return ip;
    }

}
