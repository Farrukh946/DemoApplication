package com.farrukhworkstation.demoapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ImageModel extends BaseModel{

    @Column
    @SerializedName("total")
    @Expose
    private Integer total;

    @Column
    @SerializedName("totalHits")
    @Expose
    private Integer totalHits;

    @SerializedName("hits")
    @Expose
    private List<Hit> hits = new ArrayList<Hit>();

    /**
     * @return The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return The totalHits
     */
    public Integer getTotalHits() {
        return totalHits;
    }

    /**
     * @param totalHits The totalHits
     */
    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    /**
     * @return The hits
     */
    public List<Hit> getHits() {
        return hits;
    }

    /**
     * @param hits The hits
     */
    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }
}