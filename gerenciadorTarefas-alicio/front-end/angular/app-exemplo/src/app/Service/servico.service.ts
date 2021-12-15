import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pessoa } from '../Model/Pessoa/entidade/entidade';
@Injectable({
  providedIn: 'root'
})
export class ServicoService {

  constructor(private http: HttpClient) { }

  urlBase = "http://localhost:8080/pessoa";

  getPessoa(){
    return this.http.get<Pessoa[]>(this.urlBase);
  }
  getPessoaById(id: Number){
    return this.http.get<Pessoa>(this.urlBase+"/"+id)
  }
  updatePessoa(pessoa: Pessoa){
    return this.http.put<Pessoa>(this.urlBase+"/"+pessoa.id,pessoa);
  }
}
