import java.util.*;

class BookReview {
    String title;
    int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {
    public static void main(String[] args) {
        List<BookReview> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReview("Book1", 4));
        bookReviews.add(new BookReview("Book2", 7));
        bookReviews.add(new BookReview("Book3", 2));
        bookReviews.add(new BookReview("Book4", 8));
        bookReviews.add(new BookReview("Book5", 5));

        int[] ratingRanges = {1, 5, 6, 10};
        int[] ratingRangeCounts = new int[ratingRanges.length / 2];
        int positiveCount = 0;
        int neutralCount = 0;
        int negativeCount = 0;

        for (BookReview review : bookReviews) {
            int rating = review.getRating();
            if (rating >= 1 && rating <= 5) {
                ratingRangeCounts[0]++;
            } else if (rating >= 6 && rating <= 10) {
                ratingRangeCounts[1]++;
            }

            if (rating >= 7 && rating <= 10) {
                positiveCount++;
            } else if (rating >= 4 && rating <= 6) {
                neutralCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Books reviewed within specified rating ranges:");
        for (int i = 0; i < ratingRanges.length / 2; i++) {
            int start = ratingRanges[i * 2];
            int end = ratingRanges[i * 2 + 1];
            System.out.println(start + "-" + end + " stars: " + ratingRangeCounts[i]);
        }

        System.out.println("\nCount of books with positive, neutral, and negative reviews:");
        System.out.println("Positive: " + positiveCount);
        System.out.println("Neutral: " + neutralCount);
        System.out.println("Negative: " + negativeCount);
    }
}
