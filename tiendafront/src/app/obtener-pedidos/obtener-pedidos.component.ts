import {Component, OnInit} from '@angular/core';
import {RptaPedido} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-obtener-pedidos',
  templateUrl: './obtener-pedidos.component.html',
  styleUrls: ['./obtener-pedidos.component.scss']
})
export class ObtenerPedidosComponent implements OnInit {
  lista: RptaPedido[] = [];
  constructor(private api: ApiService){ }
  ngOnInit(): void{
    this.api.obtenerPedidos().subscribe(data =>{
      this.lista = data.reportes;
    })
  }
}
