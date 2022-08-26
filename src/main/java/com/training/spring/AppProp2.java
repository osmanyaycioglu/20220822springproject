package com.training.spring;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProp2 {
    private String info;
    private String version;
    private String commit;
    private int port;
    private Connection connection;
    private List<Connection> connectionList;
    private Map<String,Connection> connectionMap;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public Map<String, Connection> getConnectionMap() {
        return connectionMap;
    }

    public void setConnectionMap(Map<String, Connection> connectionMap) {
        this.connectionMap = connectionMap;
    }

    @Override
    public String toString() {
        return "AppProp2{" +
                "info='" + info + '\'' +
                ", version='" + version + '\'' +
                ", commit='" + commit + '\'' +
                ", port=" + port +
                ", connection=" + connection +
                ", connectionList=" + connectionList +
                ", connectionMap=" + connectionMap +
                '}';
    }
}
