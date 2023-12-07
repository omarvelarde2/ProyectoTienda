import {Component, OnInit} from '@angular/core';
import {Pedido} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-realizar-pedido',
  templateUrl: './realizar-pedido.component.html',
  styleUrls: ['./realizar-pedido.component.scss']
})
export class RealizarPedidoComponent implements OnInit {
  pedido: Pedido ={} as Pedido;
  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  realizar() {
    console.log("dentro del metodo realizar pedido");
    this.api.realizarPedido(this.pedido).subscribe(retorno =>{
      console.log(retorno.id_producto+" fue pedido exitosamente")
    });
  }
}
