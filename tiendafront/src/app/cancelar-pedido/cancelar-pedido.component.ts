import {Component, OnInit} from '@angular/core';
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-cancelar-pedido',
  templateUrl: './cancelar-pedido.component.html',
  styleUrls: ['./cancelar-pedido.component.scss']
})
export class CancelarPedidoComponent implements OnInit{
  codigoPedido: number ={} as number;
  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  cancelar() :void{
    console.log("dentro del metodo cancelar pedido");

    this.api.cancelarPedido(this.codigoPedido).subscribe(retorno =>{
      console.log(this.codigoPedido+" fue eliminado exitosamente")
    });
  }
}
