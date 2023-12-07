import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ObtenerPedidosComponent } from "./obtener-pedidos/obtener-pedidos.component";
import {RealizarPedidoComponent} from "./realizar-pedido/realizar-pedido.component";

const routes: Routes = [
  {path:"obtenerPedidos", component: ObtenerPedidosComponent},
  {path:"realizarPedido", component: RealizarPedidoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
