import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'tiendafront';
  productos = [
    {
      codigo: '000002',
      nombre: 'Teléfono inteligente',
      precio: 499.99,
      descripcion: 'Un teléfono inteligente de última generación.',
      imagen: 'https://oechsle.vteximg.com.br/arquivos/ids/8479407-1000-1000/imageUrl_1.jpg?v=637868577333630000'
    },
    {
      codigo: '000003',
      nombre: 'Tablet',
      precio: 299.99,
      descripcion: 'Una tablet potente y versátil.',
      imagen: 'https://mac-center.com.pe/cdn/shop/files/iPad_10th_generation_Wi-Fi_Blue_PDP_Image_Position-1b_COES_823x.jpg?v=1698935018'
    },
    {
      codigo: '000001',
      nombre: 'Laptop',
      precio: 2499.99,
      descripcion: 'Asus Core i5 556GB SSD 8GB RAM',
      imagen: 'https://falabella.scene7.com/is/image/FalabellaPE/882860661_1?wid=800&hei=800&qlt=70'
    },
  ];
}
