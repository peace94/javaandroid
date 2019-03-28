package lesson11.autoru;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMainTitle("Hyundai");
        car.setDatePublic("7 февраля");
        car.setTotalCountViews(733);
        car.setViewsToday(28);
        car.setPrice(715000);
        Photo photo1 = new Photo();
        photo1.setPuthToBigPhoto("http:sdadas");
        photo1.setPuthToSmallPhoto("httpshhhdafas");
        Photo photo2 = new Photo();
        photo1.setPuthToBigPhoto("http::///sdadas/");
        photo1.setPuthToSmallPhoto("http://sdafas");
        Photo photo3 = new Photo();
        photo1.setPuthToBigPhoto("http::///sdadas/");
        photo1.setPuthToSmallPhoto("http://sdafas");
        Photo[] photos = {photo1,photo2,photo3};
        car.setPhotos(photos);

    }
}
