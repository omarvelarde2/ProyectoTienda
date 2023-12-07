import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ObtenerPedidosComponent } from './obtener-pedidos/obtener-pedidos.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { RealizarPedidoComponent } from './realizar-pedido/realizar-pedido.component';
import { EnviarInformeComponent } from './enviar-informe/enviar-informe.component';
import { CancelarPedidoComponent } from './cancelar-pedido/cancelar-pedido.component';
import { CrearCuentaComponent } from './crear-cuenta/crear-cuenta.component';

@NgModule({
  declarations: [
    AppComponent,
    ObtenerPedidosComponent,
    RealizarPedidoComponent,
    EnviarInformeComponent,
    CancelarPedidoComponent,
    CrearCuentaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
