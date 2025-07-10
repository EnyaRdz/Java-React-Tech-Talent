const map = L.map('map').setView([41.3879, 2.1699], 8);
const emergencias = [
  {
    titulo: 'Incendio en Paüls (Tarragona)',
    coords: [40.9615, 0.4667], // Coordenadas aproximadas de Paüls
    fecha: '7 de julio de 2025',
    detalles: 'Más de 3.000 hectáreas afectadas, confinamientos y evacuaciones parciales. Fuego cruzó el río Ebro.',
    tipo: 'Incendio forestal',
    estado: 'En curso'
  },
  {
    titulo: 'Incendio en Pinell de Solsonès (Lleida)',
    coords: [41.9282, 1.2517],
    fecha: '7 de julio de 2025',
    detalles: '35 hectáreas afectadas, estabilizado.',
    tipo: 'Incendio forestal',
    estado: 'Estabilizado'
  },
  {
    titulo: 'Incendio en Torrefeta i Florejacs (Lleida)',
    coords: [41.9964, 1.2350],
    fecha: '2 de julio de 2025',
    detalles: 'Más de 5.500 hectáreas, controlado, dos personas fallecidas.',
    tipo: 'Incendio forestal',
    estado: 'Controlado'
  },
  {
    titulo: 'Tiroteo en Calldetenes (Barcelona)',
    coords: [41.9639, 2.2828],
    fecha: '7 de julio de 2025',
    detalles: 'Hombre armado atrincherado con rehenes, dos muertos y cinco policías heridos.',
    tipo: 'Suceso policial',
    estado: 'Resuelto'
  },
  {
    titulo: 'Ola de Calor en Cataluña',
    coords: [41.6100, 1.8500], // Coordenadas centrales aproximadas para la región
    fecha: 'Finales de junio a principios de julio de 2025',
    detalles: 'Temperaturas superiores a 41°C, mínimas nocturnas altas, aumento de riesgo de incendios.',
    tipo: 'Condiciones meteorológicas',
    estado: 'Finalizada'
  },
  // Puedes agregar más emergencias reales siguiendo este formato
];

const lista = document.getElementById("lista-emergencias");
const marcadores = [];

emergencias.forEach((e) => {
  // Crear marcador en el mapa
  const marker = L.marker(e.coords)
    .addTo(map)
    .bindPopup(`<b>${e.titulo}</b>`);

  marcadores.push(marker);

  // Crear ítem en la lista
  const item = document.createElement("li");
  item.innerHTML = `<strong>${e.titulo}</strong><br><em>Haz clic para ver en el mapa</em>`;
  item.style.cursor = "pointer";
  item.style.padding = "0.5rem 0";

  // Al hacer clic en el ítem, centrar el mapa y abrir el popup
  item.addEventListener("click", () => {
    map.setView(e.coords, 11); // zoom opcional
    marker.openPopup();
  });

  lista.appendChild(item);
});