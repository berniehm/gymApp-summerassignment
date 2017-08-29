# gymApp-summerassignment
Evolve	the	Gym	application	to	realise	
additional	features.
Scheduled classes , Goals and assesment bookings.
Scheduled	Classes	- Trainers
• Enable	trainers	to	perform	CRUD	on	
scheduled	classes	(e.g.	Boxercise,	
Pilates	etc.).		
• Typical	data	stored	for	scheduled	
classes	would	be:
• class	name	
• duration	of	the	class	
• capacity	of	the	class	
• difficulty	level		
• time,	date,	etc.
• For	each	scheduled	class,	there	should	
be	a	defined	number	of	classes	in	the	
suite	e.g.	Zumba will run for 7 weeks.
Scheduled	Classes	- Members
• Enable	members	to	view	and	search	
the	scheduled	classes.
• Members	should	be	able	to	enrol	in	
the	scheduled	classes.	Allow	the	
member	to	enrol	in	two	ways:
• Enrol	in	one	specific	class	on	a	
specific	date.
• Enrol	in	all	classes	in	the	suite.
• Enrolment	in	classes	is	subject	to	
available	space.
• Members	should	be	able	to	un-enrol	
from	classes	too.	
Assessment	Booking	- Members
• Enable	members	to	book	an	
assessment	with	a	Trainer	of	
their	choice	on	any	date	in	the	
future	they	choose	(assuming	
the	Trainer	is	free	at	that	time).	
• CRUD	should	be	implemented	
on	Assessment	Bookings	for	
members.	
Assessment	Booking	- Trainers
• Trainers	can	perform	CRUD	on	
assessment	bookings	such	as:
• view	them,
• cancel	them,		
• update	the	assessment	details	
associated	with	these	bookings.
• schedule	a	future	assessment	
with	a	member.	
Goals/Targets
• Trainers	can	set	goals	for	members.		
• Members	can	set	goals	for	
themselves.	
• A	goal	has	a:
• future	date
• description
• future	assessment	measurement	goals
• a	status	indicating	if	the	goal	is:
• open	(i.e.	>	three	days	in	the	future),
• achieved,	
• missed,	
• awaiting	processing	(i.e.	a	current	
assessment	needs	to	be	done	to	process	it).	
Goals/Targets	- Member
Each	time	a	member	logs	in,	check	whether	they	have	
any	open goals	or	goals awaiting	processing:
• If	they	have	no	goals	of	this	status,	prompt	them	to	
set	a	goal	(they	don’t	have	to	do	it).
• If	they	have	an	goals	of	this	status	and	the	date	is	
today	or	in	the	past,	check	if	an	assessment	was	done	
in	the	past	three	days:
– If	one	was	done,	compare	the	assessment	stats	and	
determine	(you	decide	here)	whether	the	member’s	
goal	should	be	set	to		achieved or	missed their	goal.	
– If	one	wasn’t	done,	ensure	the	status	of	the	goal	is	set	
to	awaiting	processing	and	prompt	the	member	to	
book	an	assessment	with	a	trainer	of	their	choice.		
