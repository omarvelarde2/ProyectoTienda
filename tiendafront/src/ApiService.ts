import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Injectable } from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {RptaReportePedidos} from "./interfaces";


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


}
