import utils

def opening_packaging_score(population_density, product_density, popularity_score, visible_perimeter, total_perimeter, ppp_weight, ps_weight, v_weight, max_ppp = 15):
  ppp = people_per_product_metric(population_density, product_density, max_ratio)
  vp = cashier_visibility(visible_perimeter, total_perimeter)

  score = ppp_weight*ppp + ps_weight*popularity_score + v_weight*vp
  return score

  
