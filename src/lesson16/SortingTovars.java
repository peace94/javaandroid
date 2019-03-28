package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortingTovars {
    public static void sortByPrice(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }

    public static void sortByPriceReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new PriceReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByBuyCount(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new BuyCount());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByBuyCountReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new BuyCountReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByRating(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new Rating());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByRatingReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new RatingReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByView(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new View());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByViewReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new ViewReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByReview(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new Review());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByReviewReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new ReviewReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByStrings(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new Strings());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }
    public static void sortByStringsReverse(HashSet<Tovar> tovary) {
        TreeSet<Tovar> result = new TreeSet<>(new StringsReverse());
        result.addAll(tovary);
        for (Tovar tov :
                result) {
            System.out.println(tov);
        }
    }


}
