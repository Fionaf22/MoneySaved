import { Component, OnInit } from '@angular/core';
import { Depense } from 'src/model/depense';

@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.css']
})
export class MainpageComponent implements OnInit {

events: Depense[]|undefined;
ngOnInit(): void {
  this.events = [{
    id :5,
    title : 'Courses de noël',
    date :new Date(2023,11,2, 12,34,56),
    store : 'Fnac'
  },
  {id :4,
  title : 'Courses de rentrée',
  date :new Date(2023,8,23, 12,34,56),
  store : 'Cultura'
},
{id :3,
  title : 'Ingrédients pour repas de famille',
  date :new Date(2023,3,28, 22,13,42),
  store : 'Auchan'
},
{id :2,
  title : 'Cadeaux Lyle',
  date :new Date(2023,11,30, 17,13,0),
  store : 'Alberto Fasciani'
},
{id :1,
  title : 'Cadeaux Ash',
  date :new Date(2023,4,9, 9,0,0),
  store : 'Home Chef'
},
{id :0,
  title : '...',
  store : '...'
},

];
}
}
