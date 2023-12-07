import {Component, OnInit} from '@angular/core';
import {Informe, Pedido} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-enviar-informe',
  templateUrl: './enviar-informe.component.html',
  styleUrls: ['./enviar-informe.component.scss']
})
export class EnviarInformeComponent implements OnInit {
  informe: Informe ={} as Informe;
  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  enviar() {
    console.log("dentro del metodo enviar informe");
    this.api.enviarInforme(this.informe).subscribe(retorno =>{
      console.log(retorno.tipo+" fue enviado exitosamente")
    });
  }
}
