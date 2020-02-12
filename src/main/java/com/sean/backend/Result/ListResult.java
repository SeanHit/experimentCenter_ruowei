package com.sean.backend.Result;

import com.sean.backend.entity.userModule.Admin;

import java.util.List;

public class ListResult {
    private int status;
    private List<Data> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
