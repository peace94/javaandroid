package lesson11.autoru;

public class Tovar {
    private String mainTitle;
    private String datePublic;
    private int totalCountViews;
    private int viewsToday;
    private int price;
    private Photo[] photos = new Photo[10];
    private String mainText;
    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

    public int getTotalCountViews() {
        return totalCountViews;
    }

    public void setTotalCountViews(int totalCountViews) {
        this.totalCountViews = totalCountViews;
    }

    public int getViewsToday() {
        return viewsToday;
    }

    public void setViewsToday(int viewsToday) {
        this.viewsToday = viewsToday;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }


}
