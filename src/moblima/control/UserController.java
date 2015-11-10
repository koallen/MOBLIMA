package moblima.control;

import moblima.entity.MovieInfo;
import moblima.entity.Review;
import moblima.entity.User;

public abstract class UserController {
    /**
     * Calculate the overall rating for the movie
     * @param movie The movie needs to be calculated
     */
    public void calculateOverallRating(MovieInfo movie) {
        int sum = 0;
        for (Review pastReview: movie.getPastReviews()) {
            sum += pastReview.getRating();
        }
        double overallRating = (double)sum / movie.getPastReviews().size();
        movie.setOverallRating(overallRating);
    }
    /**
     * Set user status as inactive
     */
    public void exit() {
        User.getInstance().setActive(false);
    }
}
