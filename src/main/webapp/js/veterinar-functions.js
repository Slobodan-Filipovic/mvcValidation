/**
 * 
 */
${document}.ready(function(){
	$(#dajSveUsluge).on('click', function(){
		var id =uslugeForVet $(#id).value();
		var data = {
				url: "/vet-amb/uslugeForVet/" + id,
				type: "GET",
				dataType: "json",
				success:function(dataReceived){
					var div = $('#usluge');
					console(dataReceived);
				}
		};
		$.ajax()
	});
});