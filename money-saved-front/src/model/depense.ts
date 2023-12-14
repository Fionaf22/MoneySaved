import { Categorie } from "./categorie";
import { DetailDepense } from "./detail-depense";
import { Tag } from "./tag";
import { Type } from "./type";
import { Utilisateur } from "./utilisateur";

export interface Depense {
id? :Number;
utilisateur? : Utilisateur;
listDetail? : DetailDepense[];
title? : String ;
montant?	:Number;
date? : Date;
type? : Type;
category? : Categorie;
tags?:Tag;
store ? : String;
}
