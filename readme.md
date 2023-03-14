# Основные классы:

**Controller** сводит все функции всех классов в один и отвечает за все происходящее в программе.
Все действия описаны комментариями в коде


**Program** - выполнение функции контроллера

**Toy** - класс игрушек, с экземплярами которого будем работать. Свойства класса: ID - уникальный,
присваивается при создании нового экземпляра; название игрушки; количество игрушек - есть метод для 
изменения (в большую сторону при добавлении игрушек, в меньшую при выигрыше игрушки); 
вес игрушки - вероятность выпадения игрушки (величина относительная другим экземплярам игрушки)


# Пакет Services:

**Raffler** - при создании экземпляра класса мы передаем ему список 
экземпляров класса Toy, которые будут участвовать в розыгрыше. 
Также класс содержит метод raffleToy(), который в переданный ему 
список выигранных игрушек (вероятность выпадения игрушки соответствует ее весу относительно 
других игрушек)

**PlayMachine** - класс машины для розыгрыша. Содержит метод playRaffle(), который вызывает 
метод для розыгрыша raffleToy(). Аттрибутами передаются: список игрушек для розыгрыша; количество
розыгрышей, которые надо провести; список выигранных игрушек

**ToysGiver** - содержит метод giveToys(), который из списка выигранных игрушек (передается аттрибутом)
"извлекает" количество игрушек (тоже передается аттрибутом) и записывает их в текстовый файл


# Пакет Utils:

**WriteGivenToys** -  для записи игрушек в файл txt



