package Module.category;

public class Category {
    
    private String id;
    private boolean isActive;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
