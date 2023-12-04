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
  id_pedido: number;
  id_producto:number;
  id_usuario:number;
  tarjeta:number;
}

export interface Producto{
  id_producto: number;
  nombre:string;
  descripcion:string;
  stock:number;
  precio:number;
}
