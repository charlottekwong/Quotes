package com.example.quotes;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//this class was generated using jsonschema2pojo.org

public class Quotes implements Parcelable
{

    @SerializedName("categories")
    @Expose
    private List<String> categories = null;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("value")
    @Expose
    private String value;
    public final static Parcelable.Creator<Quotes> CREATOR = new Creator<Quotes>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Quotes createFromParcel(Parcel in) {
            return new Quotes(in);
        }

        public Quotes[] newArray(int size) {
            return (new Quotes[size]);
        }

    }
            ;

    protected Quotes(Parcel in) {
        in.readList(this.categories, (java.lang.String.class.getClassLoader()));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.iconUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.value = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Quotes() {
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(categories);
        dest.writeValue(createdAt);
        dest.writeValue(iconUrl);
        dest.writeValue(id);
        dest.writeValue(updatedAt);
        dest.writeValue(url);
        dest.writeValue(value);
    }

    public int describeContents() {
        return 0;
    }

}