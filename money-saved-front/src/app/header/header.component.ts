import { Component, OnInit } from '@angular/core';
import { MegaMenuItem, MenuItem } from 'primeng/api';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  items: MenuItem[] = [];
  subitems: MenuItem[][] = [];
  i: MenuItem[] = [];

  ngOnInit(): void {
    this.items = [
      {
        label: 'Analyse Budgetaire',
        icon: 'pi pi-chart-pie',
        routerLink: ['/stats'],
      },
      {
        label: 'budget',
        icon: 'pi pi-sliders-h',
        items: [{ label: 'En cours', icon: 'pi pi-euro' }, { label: 'Historique', icon : 'pi pi-history' }],
      },
      {
        label: 'Depenses',
        icon: 'pi pi-money-bill',
        items: [
          {
            label: 'Ajouter',
            icon: 'pi pi-plus',
          },
          {
            label : 'Liste',
            icon :'pi pi-list'
          }
        ],
      },
    ];
  }
}
