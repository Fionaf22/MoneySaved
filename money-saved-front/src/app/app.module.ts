import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule  } from '@angular/forms';
import { CardModule } from 'primeng/card';
import { MegaMenuModule } from 'primeng/megamenu';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfilComponent } from './profil/profil.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AnalyseBudgetComponent } from './analyse-budget/analyse-budget.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatIconModule} from '@angular/material/icon';
@NgModule({
  declarations: [
    AppComponent,
    ProfilComponent,
    MainpageComponent,
    HeaderComponent,
    FooterComponent,
    AnalyseBudgetComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    CardModule,
    MegaMenuModule,
    BrowserAnimationsModule,
    MatIconModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
