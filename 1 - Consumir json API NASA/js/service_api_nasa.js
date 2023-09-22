const apiKey = 'h49iQ4hQvG5SNIEKLb3DuzYHh6e0XMgby6CRo583';
const sol = 1000; // El número de sol que deseas consultar

// URL del API de la NASA
const apiUrl = `https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=${sol}&api_key=${apiKey}`;

// Realizar una solicitud GET utilizando Fetch API
fetch(apiUrl)
  .then((response) => {
    if (!response.ok) {
      throw new Error('Error en la solicitud al API');
    }
    return response.json();
  })
  .then((data) => {
    // Los datos de las fotos se encuentran en el objeto 'data'
    console.log(data);
    // Aquí puedes procesar los datos o mostrar las imágenes en tu aplicación
    data[0].img_src;
    data[0].camera.full_name;    
    data[0].earth_date;
    // FOR 0 A N-1
    // Y PINTAR 50 IMÁGENES DEL API
    document.getElementById("img").src = data[0].img_src;
    
  })
  .catch((error) => {
    console.error('Ocurrió un error:', error);
  });