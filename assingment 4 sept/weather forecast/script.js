const weatherData = document.querySelector(".weather-data");

const apiKey = "d27960fd7b77c34cab86f6e43b0e4336"; 
const cityName = "Nandyal"; 


const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${cityName}&appid=${apiKey}&units=metric`;


function getWeather() {
  // Use the fetch method to make a request to the API
  fetch(apiUrl)
    .then((response) => {
      // Check if the response is successful
      if (response.ok) {
        // Return the response as a JSON object
        return response.json();
      } else {
        // Throw an error if the response is not successful
        throw new Error("Something went wrong");
      }
    })
    .then((data) => {
      // Extract the relevant data from the JSON object
      const temp = data.main.temp; // The current temperature in Celsius
      const feelsLike = data.main.feels_like; // The feels like temperature in Celsius
      const humidity = data.main.humidity; // The humidity percentage
      const pressure = data.main.pressure; // The atmospheric pressure in hPa
      const windSpeed = data.wind.speed; // The wind speed in meter/sec
      const windDeg = data.wind.deg; // The wind direction in degrees
      const weatherMain = data.weather[0].main; // The main weather condition
      const weatherDesc = data.weather[0].description; // The weather description
      const weatherIcon = data.weather[0].icon; // The weather icon code

      // Create a HTML string to display the weather data
      let html = `
        <h2>Weather in ${cityName}</h2>
        <div class="weather-icon">
          <img src="https://openweathermap.org/img/wn/${weatherIcon}.png" alt="${weatherDesc}">
        </div>
        <p><strong>Temperature:</strong> ${temp} °C</p>
        <p><strong>Feels Like:</strong> ${feelsLike} °C</p>
        <p><strong>Humidity:</strong> ${humidity} %</p>
        <p><strong>Pressure:</strong> ${pressure} hPa</p>
        <p><strong>Wind:</strong> ${windSpeed} m/s, ${windDeg}°</p>
        <p><strong>Condition:</strong> ${weatherMain} - ${weatherDesc}</p>
      `;

      // Update the weather data element with the HTML string
      weatherData.innerHTML = html;
    })
    .catch((error) => {
      // Display an error message if something goes wrong
      weatherData.innerHTML = `<p>${error.message}</p>`;
    });
}

// Call the getWeather function when the page loads
getWeather();
