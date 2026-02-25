const API_URL = window.location.pathname.includes('/contactos-crud-jakartaee/')
    ? window.location.pathname.split('/contactos-crud-jakartaee/')[0] + '/contactos-crud-jakartaee/api/vuelos'
    : '/api/vuelos';

document.addEventListener('DOMContentLoaded', () => {
    const tablaBody = document.getElementById('tabla-vuelos');

    cargarVuelos();

    async function cargarVuelos() {
        try {
            const respuesta = await fetch(API_URL);
            if (!respuesta.ok) throw new Error('Error al cargar vuelos');
            const vuelos = await respuesta.json();
            pintarTabla(vuelos);
        } catch (error) {
            console.error(error);
            alert('No se pudieron cargar los vuelos');
        }
    }

    function pintarTabla(vuelos) {
        tablaBody.innerHTML = '';
        if (vuelos.length === 0) {
            tablaBody.innerHTML = '<tr><td colspan="6" style="text-align:center;">No hay vuelos</td></tr>';
            return;
        }
        vuelos.forEach(vuelo => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${vuelo.numero}</td>
                <td>${vuelo.compania}</td>
                <td>${vuelo.avion}</td>
                <td>${vuelo.origen}</td>
                <td>${vuelo.destino}</td>
                <td>${vuelo.salida}</td>
            `;
            tablaBody.appendChild(tr);
        });
    }
});