$('#menu .category').click(function() {
	$('#menu .category').removeClass('active');
	$(this).addClass('active');
	$('#menu .open').removeClass('open');
	var next = $(this).next().next();
	while (next.is('.doc')) {
		next.addClass('open');
		next = next.next();
	}
});