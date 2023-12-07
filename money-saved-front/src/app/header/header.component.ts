import { Component, OnInit } from '@angular/core';
import { MegaMenuItem, MenuItem } from 'primeng/api';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  items: MegaMenuItem[]=[];
  subitems : MenuItem[][]=[]
  i: MenuItem[]=[];

  ngOnInit(): void {
    this.i=[
      {label:'title submenu',
    items : [{
      label :'submenu',
      icon :'pi pi-user'
    },
  {
    label : 'submenu 2',
    badge : 'monitoring',
    badgeStyleClass:'material-symbols-outlined'
  }]},
      {label : '2'}]

    this.subitems =[
this.i,this.i
];


      this.items=[
        {
          label :   "Analyse Budgetaire",
          icon : 'home',
          routerLink: ['/stats'],
          items : this.subitems,
        },
        {label : 'budget'},

      ]
  }

}
