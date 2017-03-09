package mobile.miet.alex.com.mietunofficial_v2.greenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "RESOURCE_MODEL".
 */
@Entity
public class ResourceModel {
    private Integer idLink;
    private String resourceslistjson;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public ResourceModel() {
    }

    @Generated
    public ResourceModel(Integer idLink, String resourceslistjson) {
        this.idLink = idLink;
        this.resourceslistjson = resourceslistjson;
    }

    public Integer getIdLink() {
        return idLink;
    }

    public void setIdLink(Integer idLink) {
        this.idLink = idLink;
    }

    public String getResourceslistjson() {
        return resourceslistjson;
    }

    public void setResourceslistjson(String resourceslistjson) {
        this.resourceslistjson = resourceslistjson;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
