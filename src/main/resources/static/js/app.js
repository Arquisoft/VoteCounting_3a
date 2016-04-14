/*
 * 
 * */

$(document).ready(function() {
	
	// Rutas
	page('/', index);
	page('/help', help);
	page('/elecciones', list);
	page('/elecciones/:eleccion', eleccion);
	page('*', notfound);

	page();

});

var index = function () {
	
}

var help = function () {
	
}

var list = function () {
}

var eleccion = function () {
	
}

var notfound = function () {
	$("#main > .active").removeClass("active");
	$("#notfound").addClass("active");
}


