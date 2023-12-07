import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MainpageComponent } from './mainpage/mainpage.component';
import { ProfilComponent } from './profil/profil.component';
import { AnalyseBudgetComponent } from './analyse-budget/analyse-budget.component';

const routes: Routes = [
  { path : 'profil', component : ProfilComponent},
  { path : 'stats', component : AnalyseBudgetComponent},
  { path: '**', component: MainpageComponent },
  
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
