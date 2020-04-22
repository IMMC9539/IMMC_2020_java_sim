import utils

# Calculates a score to represent the probability of product falling or being dropped in a given department.

def dropping_score(population_density, product_density, max_ratio):
  """
  Calculates a score to represent the probability of product falling or being dropped in a given department.
  :param population_density:
  :param product_density:
  :param max_ratio:
  :return:
  """
  return people_per_product_metric(population_density, product_density, max_ratio)