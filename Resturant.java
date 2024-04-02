import java.util.*;

class Restaurant {
    String name;
    double rating;

    public Restaurant(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}

public class RestaurantRatingAnalyzer {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Restaurant1", 4.5));
        restaurants.add(new Restaurant("Restaurant2", 7.2));
        restaurants.add(new Restaurant("Restaurant3", 3.8));
        restaurants.add(new Restaurant("Restaurant4", 8.5));
        restaurants.add(new Restaurant("Restaurant5", 6.7));

        int[] ratingRanges = {1, 5, 6, 10};
        double[] ratingSums = new double[ratingRanges.length / 2];
        int[] ratingCounts = new int[ratingRanges.length / 2];

        for (Restaurant restaurant : restaurants) {
            double rating = restaurant.getRating();
            for (int i = 0; i < ratingRanges.length / 2; i++) {
                if (rating >= ratingRanges[i * 2] && rating <= ratingRanges[i * 2 + 1]) {
                    ratingSums[i] += rating;
                    ratingCounts[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < ratingRanges.length / 2; i++) {
            double rangeAverage = ratingCounts[i] == 0 ? 0 : ratingSums[i] / ratingCounts[i];
            System.out.println("Rating range " + ratingRanges[i * 2] + "-" + ratingRanges[i * 2 + 1] +
                    ", Number of restaurants: " + ratingCounts[i] + ", Average rating: " + rangeAverage);
        }
    }
}
