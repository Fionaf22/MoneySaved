import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Utilisateur } from 'src/model/utilisateur';
import { UserService } from '../user.service';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css'],
})
export class ProfilComponent {
  service!: UserService;
usernim!:Utilisateur;
formProfilGroup = new FormGroup({
  nom : new FormControl('', Validators.required),
  prenom : new FormControl('', Validators.required),
  email : new FormControl('', Validators.required)
});

click(a : FormGroup){
  console.log(a.value)
this.service.addUser(this.usernim).subscribe(u => this.usernim)
}
}
