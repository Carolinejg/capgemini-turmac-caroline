import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { ListarComponent } from './Model/Pessoa/listar/listar.component';
import { EditarComponent } from './Model/Pessoa/editar/editar.component';
import { AdicionarComponent } from './Model/Pessoa/adicionar/adicionar.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    EditarComponent,
    AdicionarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
