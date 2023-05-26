package com.weatherapp.myweatherapp.repository;

import com.weatherapp.myweatherapp.model.CityInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class VisualcrossingRepository {

  @Value("${weather.visualcrossing.url}")
  String url;
  @Value("${weather.visualcrossing.key}")
  String key;


  public CityInfo getByCity(String city) {
    String uri = url + "timeline/" +city + "?key=" + key;
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(uri, CityInfo.class);

  }

  // Need methods to calculate daylight hours and whether it is raining
  long calculateDaylightHours(CityInfo cityInfo);
  boolean currentlyRaining(CityInfo cityInfo);

  // Write methods in the weatherservice class to remove warnings

}
