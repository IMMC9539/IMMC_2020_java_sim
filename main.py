import utils
import pandas as pd
# GIVENS:: population density and product density

#CALCULATE:: 

def total_score(population_density, product_density, max_ratio, popularity_score, visible_perimeter, total_perimeter, ppp_weight, ps_weight, v_weight, max_ppp = 15):
  drop_score = dropping_score(population_density, product_density, max_ratio)
  opening_score = opening_packaging_score(population_density, product_density, popularity_score, visible_perimeter, total_perimeter, ppp_weight, ps_weight, v_weight, max_ppp = 15)
  handling_score = rough_handling_score(total_perimeter, visible_perimeter, population_density, product_density, max_ratio, v_weight, ppp_weight)
  return drop_score + opening_score + handling_score, drop_score, opening_score, handling_score


def total_score_fp(filename, save_file, cols = ['Population Density', 'Product Density', 'Visible Perimeter', 'Total Perimeter', 'Popularity Score', 'PPP Weight', 'PS Weight', 'V Weight', 'Max PPP']):
  
  df_ = pd.DataFrame()
  df = pd.read_csv(filename)

  opening_scores = []
  dropping_scores = []
  rough_handling_scores = []
  total_scores = []

  for row in df:
    tscore, dscore, oscore, hscore = total_score(row[cols[0]], row[cols[1]], row[cols[2]], row[cols[3]], row[cols[4]], row[cols[5]], row[cols[6]], row[cols[7]], row[cols[8]]))

    opening_scores.append(oscore)
    dropping_scores.append(dscore)
    rough_handling_scores.append(hscore)
    total_scores.append(tscore)

  df_.save_csv(save_file)

  
