import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObtenerPedidosComponent } from './obtener-pedidos.component';

describe('ObtenerPedidosComponent', () => {
  let component: ObtenerPedidosComponent;
  let fixture: ComponentFixture<ObtenerPedidosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ObtenerPedidosComponent]
    });
    fixture = TestBed.createComponent(ObtenerPedidosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
