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
	
	$.ajax({
        url: "/elecciones"
    }).then(function(data) {
    	console.log(data)
    	var listado = doT.template(document.getElementById('ListTpl').text);
		document.getElementById('listaElecciones').innerHTML = listado(data);
    });
}

var eleccion = function () {
	navTo("/elecion", "elecion");
}

var notfound = function () {
	navTo("/notFound", "notFound");
}


			submitActionFactory({
				'el' : "#voters-info form",
				'url' : "/user",
				'done' : function(response, textStatus, jqXHR) {
					addAlert("Hola " + response.name
							+ ", tu lugar de votación es <b>"
							+ response.pollingStationCode + "</b>", 'success');
				},
				'error404' : function() {
					addAlert("No esta en la base de datos");
				}
			});

			submitActionFactory({
				'el' : "#voters-passwd form",
				'url' : "/ChangePassword",
				'done' : function(response, textStatus, jqXHR) {
					addAlert("Tu contraseña se actualizo correctamente", 'success');
				},
				'error404' : function() {
					addAlert("No permitido.");
				}
			});


var submitActionFactory = (function() {

	var request;

	return (function(params) {

		$(params.el).submit(function(e) {
			e.preventDefault();

			var $form = $(this);

			// Abort any pending request
			if (request) {
				request.abort();
			}

			// Let's select and cache all the fields
			var $inputs = $form.find("input, select, button, textarea");

			// Serialize the data in the form
			var data = {};
			$form.serializeArray().map(function(x) {
				data[x.name] = x.value;
			});

			// Let's disable the inputs for the duration of the Ajax request.
			$inputs.prop("disabled", true);

			// Fire off the request
			console.log("Request", data);
			request = $.ajax({
				url : params.url,
				type : "post",
				contentType : "application/json",
				dataType : "json",
				data : JSON.stringify(data)
			});

			// Callback handler that will be called on success
			request.done(params.done);

			// Callback handler that will be called on failure
			request.fail(function(jqXHR, textStatus, errorThrown) {
				console.log("Response");
				console.error(jqXHR, textStatus, errorThrown);

				if (jqXHR.status == 404) {
					params.error404();
				} else {
					// otro error desconocido
					alert("Ocurrió un error desconocido.");
					console.error(textStatus, errorThrown);
				}
			});

			// if the request failed or succeeded
			request.always(function() {
				// Reenable the inputs
				$inputs.prop("disabled", false);
			});

		});
	});
})();

function addAlert(message, level) {
	$('#alerts')
			.append(
					'<div class="alert alert-'
							+ (level != undefined ? level : 'danger')
							+ ' alert-dismissible fade in">'
							+ '<button type="button" class="close" data-dismiss="alert">'
							+ '&times;</button>' + message + '</div>');
}
