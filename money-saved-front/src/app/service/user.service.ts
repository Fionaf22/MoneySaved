import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Utilisateur } from 'src/model/utilisateur';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  url =""
    constructor(private http: HttpClient) { }
    addUser (user : Utilisateur): Observable<Utilisateur>{
    return this.http.post<Utilisateur>(this.url,user)
  }
}
