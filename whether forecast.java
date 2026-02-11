import java.util.HashMap;
import java.util.Scanner;

public class Main {

static class WeatherData {  

    String condition;  
    double temperature;  
    int humidity;  

    WeatherData(String condition, double temperature, int humidity) {  
        this.condition = condition;  
        this.temperature = temperature;  
        this.humidity = humidity;  
    }  
}  

public static void main(String[] args) {  

    Scanner scanner = new Scanner(System.in);  

    HashMap<String, WeatherData> weatherMap = new HashMap<>();  

    weatherMap.put("delhi", new WeatherData("Sunny", 30.5, 60));  
    weatherMap.put("mumbai", new WeatherData("Cloudy", 28.0, 75));  
    weatherMap.put("chennai", new WeatherData("Rainy", 27.2, 85));  
    weatherMap.put("hyderabad", new WeatherData("Clear", 29.4, 55));  
    weatherMap.put("nellore", new WeatherData("Partly Cloudy", 31.8, 70));  
    weatherMap.put("bangalore", new WeatherData("Cool", 24.3, 65));  

    System.out.println("===== Weather Forecast System =====");  

    System.out.print("Enter city name: ");  
    String city = scanner.nextLine().toLowerCase();  

    if (weatherMap.containsKey(city)) {  

        WeatherData data = weatherMap.get(city);  

        System.out.println("\nWeather Details:");  
        System.out.println("City: " + city.toUpperCase());  
        System.out.println("Condition: " + data.condition);  
        System.out.println("Temperature: " + data.temperature + " °C");  
        System.out.println("Humidity: " + data.humidity + " %");  

    } else {  

        System.out.println("\nCity not found in database.");  

    }  

    scanner.close();  
}

}