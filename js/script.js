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

$('#menu .doc a').click(function(event) {
	event.preventDefault();
	event.stopPropagation();
	$('#menu .doc').removeClass('active');
	$(this).parent().addClass('active');
	var href = $(this).attr('href');
	if (href && (!href.startsWith('#') && !href.startsWith('javascript:'))) {
		$('#doc').load(href);
	}
});

$(document).on('click', '#doc a.inner-link', function(event) {
	event.preventDefault();
	event.stopPropagation();
	var href = $(this).attr('href');
	if (href && (!href.startsWith('#') && !href.startsWith('javascript:'))) {
		$('#doc').load(href);
	}
});