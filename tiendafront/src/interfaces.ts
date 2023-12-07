export interface RptaPedido {
  id_pedido: number;
  id_usuario: number;
  id_producto: number;
  estado: string;
}

export interface RptaReportePedidos{
  reportes:RptaPedido[];
}


export interface Pedido{
  id_producto:number;
  cantidad:number;
}

export interface Informe{
  tipo:String;
  asunto:String;
  descripcion:String;
}

export interface Usuario{
  nombre:String;
  telefono:number;
  direccion:String
}
