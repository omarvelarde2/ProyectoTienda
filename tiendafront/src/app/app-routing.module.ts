import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ObtenerPedidosComponent } from "./obtener-pedidos/obtener-pedidos.component";

const routes: Routes = [
  {path:"obtenerPedidos", component: ObtenerPedidosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
