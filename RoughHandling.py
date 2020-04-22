import utils

#Calculates the probability of products being roughly handled in a given department.

def rough_handling_score(total_perimeter, visible_perimeter, population_density, product_density, max_ratio, v_weight, ppp_weight):
  ppp = people_per_product_metric(population_density, product_density, max_ratio)
  visibility = cashier_visibility(total_perimeter, visible_perimeter)
  score = ppp * ppp_weight + visibility * v_weight
  return score

