package com.pyh.base.db;

public enum DataSourceEnum {

    MASTER("masterDataSource", true),

    SLAVE("slaveDataSource", false);

    private String name;

    private boolean master;

    DataSourceEnum(String name, boolean master) {
        this.name = name;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaster() {
        return master;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    public String getDefault() {
        String defaultDataSource = "";
        for (DataSourceEnum dataSourceEnum : DataSourceEnum.values()) {
            if (!"".equals(defaultDataSource)) {
                break;
            }
            if (dataSourceEnum.master) {
                defaultDataSource = dataSourceEnum.getName();
            }
        }
        return defaultDataSource;
    }

}
