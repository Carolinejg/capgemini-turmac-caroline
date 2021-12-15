import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServicoService } from 'src/app/Service/servico.service';
import { Pessoa } from '../entidade/entidade';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html'
})
export class ListarComponent implements OnInit{
  
  listaPessoa:Pessoa[] = [];
  constructor(private service: ServicoService) { }
  ngOnInit(){
    this.service.getPessoa()
    .subscribe(data=>{
      this.listaPessoa = data;
    })
  }

  editar(){
    
  }

  

}
