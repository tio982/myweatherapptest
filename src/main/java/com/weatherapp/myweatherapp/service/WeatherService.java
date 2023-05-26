package com.weatherapp.myweatherapp.service;

import com.weatherapp.myweatherapp.model.CityInfo;
import com.weatherapp.myweatherapp.repository.VisualcrossingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private VisualcrossingRepository visualcrossingRepository;

    public String calculateDaylightHours(String city1, String city2) {
      CityInfo cityInfo1 = visualcrossingRepository.getByCity(city1);
      CityInfo cityInfo2 = visualcrossingRepository.getByCity(city2);

      long daylightHours1 = cityInfo1.getDaylightHours(); // Obstructed by error in the Cityinfo Class
      long daylightHours2 = cityInfo2.getDaylightHours();

      if (daylightHours1 > daylightHours2) {
        return city1;
      } else if (daylightHours2 > daylightHours1) {
        return city2;
      } else {
        return "Both cities have the same daylight hours.";
      }
    }

    public String checkRain(String city1, String city2) {
        CityInfo cityInfo1 = visualcrossingRepository.getByCity(city1);
        CityInfo cityInfo2 = visualcrossingRepository.getByCity(city2);

        boolean isRainingInCity1 = cityInfo1.isCurrentlyRaining(); // Obstructed by errors in the city info class
        boolean isRainingInCity2 = cityInfo2.isCurrentlyRaining();

        if (isRainingInCity1 && !isRainingInCity2) {
            return city1;
        } else if (isRainingInCity2 && !isRainingInCity1) {
            return city2;
        } else if (isRainingInCity1 && isRainingInCity2) {
            return "Both cities are currently experiencing rain.";
        } else {
            return "Neither city is currently experiencing rain.";
        }
    }

  public CityInfo forecastByCity(String city) {

    return visualcrossingRepository.getByCity(city);
  }
}
