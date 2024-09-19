from selenium import webdriver
from selenium.webdriver.common.by import By


with webdriver.Firefox() as driver:
   
    actions = webdriver.ActionChains(driver)

  
    driver.get("https://v1.training-support.net/selenium/input-events")

  
    print("Page title is: ", driver.title)

   
    actions.click().perform()
    
    active_side = driver.find_element(By.CLASS_NAME, "active")
   
    print("Active side number after left click: ", active_side.text)
    
  
    actions.double_click().perform()
   
    active_side = driver.find_element(By.CLASS_NAME, "active")
   
    print("Active side number after double click: ", active_side.text)

    actions.context_click().perform()
   
    active_side = driver.find_element(By.CLASS_NAME, "active")
   
    print("Active side number after right click: ", active_side.text)
