/*
 * 
 * */

$(document).ready(function() {

	page();

});

page('/', index);
page('/user/list', list);
page('/user/help', help);
page('/user/:eleccion', album);
page('/user/:user/album/sort', sort);
page('*', notfound);
