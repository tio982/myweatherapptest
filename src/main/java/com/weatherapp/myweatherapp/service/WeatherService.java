package com.weatherapp.myweatherapp.service;

import com.weatherapp.myweatherapp.model.CityInfo;
import com.weatherapp.myweatherapp.repository.VisualcrossingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private VisualcrossingRepository visualcrossingRepository;

    public String compareDaylightHours(String city1, String city2) {
      CityInfo cityInfo1 = visualcrossingRepository.getByCity(city1);
      CityInfo cityInfo2 = visualcrossingRepository.getByCity(city2);

      long daylightHours1 = cityInfo1.getDaylightHours();
      long daylightHours2 = cityInfo2.getDaylightHours();

      if (daylightHours1 > daylightHours2) {
        return city1;
      } else if (daylightHours2 > daylightHours1) {
        return city2;
      } else {
        return "Both cities have the same daylight hours.";
      }
    }


  public CityInfo forecastByCity(String city) {

    return visualcrossingRepository.getByCity(city);
  }
}
