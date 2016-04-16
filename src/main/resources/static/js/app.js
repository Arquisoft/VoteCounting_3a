/*
 * 
 * */

$(document).ready(function() {
	
	// Rutas
	page('/', index);
	page('/help', help);
	page('/administrar', administrar);
	page('/elecciones', list);
	page('/elecciones/:eleccion', eleccion);
	page('*', notfound);

	page();

});

/* Activa los enlaces del NAV con determinado href */
var navTo = function(href, idPage) {
	$("#navbar .navbar-nav .active").removeClass("active");
	$('#navbar .navbar-nav a[href$="'+href+'"]').parent().addClass("active");
	$("#main > .page.active").removeClass("active");
	$("#" + idPage).addClass("active");
}

var index = function () {
	navTo("/", "index");
}

var help = function () {
	navTo("/help", "help");
}

var administrar = function () {
	navTo("/administrar", "administrar");
}

var list = function () {
	navTo("/elecciones", "list");
}

var eleccion = function () {
	navTo("/elecion", "elecion");
}

var notfound = function () {
	navTo("/notFound", "notFound");
}


