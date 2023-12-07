import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Injectable } from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {Informe, Pedido, RptaReportePedidos, Usuario} from "./interfaces";


@Injectable({providedIn: 'root'})
export class ApiService {
  httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json;charset=utf-8'})};

  constructor(private http: HttpClient) {
  }

  errorHandl(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  obtenerPedidos():Observable<RptaReportePedidos>{
    return this.http.post<RptaReportePedidos>("http://localhost:8080/obtenerPedidos", null,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  realizarPedido(data: Pedido):Observable<Pedido>{
    return this.http.post<Pedido>("http://localhost:8080/realizarPedido", data,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  enviarInforme(data: Informe):Observable<Informe>{
    return this.http.post<Informe>("http://localhost:8080/enviarInforme", data,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  cancelarPedido(data: number):Observable<number>{
    return this.http.post<number>("http://localhost:8080/cancelarPedido", data,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  crearCuenta(data: Usuario):Observable<Usuario>{
    return this.http.post<Usuario>("http://localhost:8080/crearCuenta", data,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }
}
