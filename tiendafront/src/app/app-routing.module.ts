import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ObtenerPedidosComponent } from "./obtener-pedidos/obtener-pedidos.component";
import {RealizarPedidoComponent} from "./realizar-pedido/realizar-pedido.component";
import {EnviarInformeComponent} from "./enviar-informe/enviar-informe.component";
import {CancelarPedidoComponent} from "./cancelar-pedido/cancelar-pedido.component";
import {CrearCuentaComponent} from "./crear-cuenta/crear-cuenta.component";

const routes: Routes = [
  {path:"obtenerPedidos", component: ObtenerPedidosComponent},
  {path:"realizarPedido", component: RealizarPedidoComponent},
  {path:"enviarInforme", component: EnviarInformeComponent},
  {path:"cancelarPedido", component: CancelarPedidoComponent},
  {path:"crearCuenta", component: CrearCuentaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
