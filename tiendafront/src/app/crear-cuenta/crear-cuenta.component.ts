import {Component, OnInit} from '@angular/core';
import {Pedido, Usuario} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-crear-cuenta',
  templateUrl: './crear-cuenta.component.html',
  styleUrls: ['./crear-cuenta.component.scss']
})
export class CrearCuentaComponent implements OnInit {
  usuario: Usuario ={} as Usuario;
  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  crear() {
    console.log("dentro del metodo crear cuenta");
    this.api.crearCuenta(this.usuario).subscribe(retorno =>{
      console.log(retorno.nombre+", su cuenta se ha creado exitosamente")
    });
  }
}
