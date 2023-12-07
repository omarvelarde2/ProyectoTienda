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

export interface Producto{
  id_producto: number;
  nombre:string;
  descripcion:string;
  stock:number;
  precio:number;
}
