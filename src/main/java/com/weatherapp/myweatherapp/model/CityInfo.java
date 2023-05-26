package com.weatherapp.myweatherapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.List;

public class CityInfo {

  @JsonProperty("address")
  String address;

  @JsonProperty("description")
  String description;

  @JsonProperty("currentConditions")
  CurrentConditions currentConditions;

  @JsonProperty("days")
  List<Days> days;


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CurrentConditions getCurrentConditions() {
    return currentConditions;
  }

  public void setCurrentConditions(CurrentConditions currentConditions) {
    this.currentConditions = currentConditions;
  }

  public List<Days> getDays() {
    return days;
  }

  public void setDays(List<Days> days) {
    this.days = days;
  }

//  public Duration getDaylightHours() {
//    Temporal sunrise = null;
//    return Duration.between(sunrise, sunset);
//  }


  static class CurrentConditions {
    @JsonProperty("daylightHours")
    long daylightHours;
    @JsonProperty("currentlyRaining")
    boolean currentlyRaining;
    @JsonProperty("temp")
    String currentTemperature;

    @JsonProperty("sunrise")
    String sunrise;

    @JsonProperty("sunset")
    String sunset;

    @JsonProperty("feelslike")
    String feelslike;

    @JsonProperty("humidity")
    String humidity;

    @JsonProperty("conditions")
    String conditions;

    public String getCurrentTemperature() {
      return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
      this.currentTemperature = currentTemperature;
    }

    public String getSunrise() {
      return sunrise;
    }

    public String setSunrise(String sunrise) {
      this.sunrise = sunrise;
    return sunrise;
    }

    // Needed to convert sunrise and sunset to temporals to configure daylight hours

    public String getSunset() {
      return sunset;
    }

    public void setSunset(String sunset) {
      this.sunset = sunset;
    }

    public String getFeelslike() {
      return feelslike;
    }

    public void setFeelslike(String feelslike) {
      this.feelslike = feelslike;
    }

    public String getHumidity() {
      return humidity;
    }

    public void setHumidity(String humidity) {
      this.humidity = humidity;
    }

    public String getConditions() {
      return conditions;
    }

    public void setConditions(String conditions) {
      this.conditions = conditions;
    }
    public Duration getDaylightHours() {
      return Duration.between(this.sunrise, this.sunset);
    }

    public void setDaylightHours(long daylightHours) {
      this.daylightHours = daylightHours;
    }

    public boolean isCurrentlyRaining() {
      return currentlyRaining;
    }

    public void setCurrentlyRaining(boolean currentlyRaining) {
      this.currentlyRaining = currentlyRaining;
    }
  }

  static class Days {

    @JsonProperty("datetime")
    String date;

    @JsonProperty("temp")
    String currentTemperature;

    @JsonProperty("tempmax")
    String maxTemperature;

    @JsonProperty("tempmin")
    String minTemperature;

    @JsonProperty("conditions")
    String conditions;

    @JsonProperty("description")
    String description;

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getCurrentTemperature() {
      return currentTemperature;
    }

    public void setCurrentTemperature(String currentTemperature) {
      this.currentTemperature = currentTemperature;
    }

    public String getMaxTemperature() {
      return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
      this.maxTemperature = maxTemperature;
    }

    public String getMinTemperature() {
      return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
      this.minTemperature = minTemperature;
    }

    public String getConditions() {
      return conditions;
    }

    public void setConditions(String conditions) {
      this.conditions = conditions;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
  }

}
