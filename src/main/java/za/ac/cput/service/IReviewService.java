package za.ac.cput.service;

import za.ac.cput.domain.Review;
import Java.util.List;

public interface IReviewService extends IService<Review, Integer>{
  public List<Review> getAll();
}
