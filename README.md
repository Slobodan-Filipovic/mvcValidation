# mvc-basics

Packages: repository, service, configuration structure. Easy and intuitive way go get an idea for a folder structure for a project. 

Basic anotation and parameter passing. GET POST DELETE




DEPENDENCY INJECTIOn

INVERSION OF CONTROL

ASPECT Oriented Programming

Spring Modules

Servlet je:

U springu napravljen da radi jako brzo, mapira svaki request koji dodje na neku funkcijalnost.
Znaci mi moramo imati putanju do te neke nase funkcijalnosti.

npr localhost/veterinari

Jedan HTTP request ima jedan odgovarajuci HTTP response. Tipicna arhetektura HTTP protokola


Dispatcher servlet prosledjuje svim nasim kontrolerima sta smo mi trazili

Ide u Handle mapping 

Pa se vraca u Controller iz kojeg se vraca Model and View

Pa ide u ViewResolver odakle se vraca vise 

PA u View i onda response

KOntroler je u principu logika koja sluzi da koji ce view da se vrati

View je http stranice

Model da nam se popuni view

Controller ce uzeti Model pa ce vratiti u View pa View kad se izrenderuje Controller to uzme
pa poslaje na nasu webstranicu

