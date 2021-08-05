# Absence calculation engine
You are tasked with making an _Absence Calculation Engine_.  
Employees have to work a planned amount of hours per day.  
When they don't come to work, absence has to be planned.

There are 3 types of absence: _Paid Leave_, _Public Holiday_, _Sick Leave_

You have to create a program where you can add a certain amount of hours of absence on a day and see the outcome.  
The outcome doesn't just show the final outcome, but also shows what originally was planned on that day (see examples).

The absences have different priorities:

* all absences overrule _Work_
* _Sick Leave_ overrules _Paid Leave_
* _Public Holiday_ overrules both _Sick Leave_ and _Paid Leave_

These are some examples:

Given an employee is expected to work 8 hours on July 16th
Then the employee sees 8 hours of work on July 16th

Given an employee is expected to work 8 hours on July 16th
When employee books 8 hours of _Paid Leave_ on July 16th
Then the employee sees 8 hours of _Paid Leave_
And sees 0 hours of _Work_ (+ 8 hours of overruled _Work_)

Given an employee is expected to work 8 hours on July 16th
When employee books 4 hours of _Paid Leave_ on July 16th
Then the employee sees 4 hours of _Paid Leave_
And sees 4 hours of _Work_ (+ 4 hours of overruled _Work_)

Given an employee is expected to work 8 hours on July 16th
When employee books 4 hours of _Paid Leave_ on July 16th
And employee books 8 hours of _Sick Leave_ on July 16th
Then the employee sees 8 hours of _Sick Leave_
And sees 0 hours of _Paid Leave_ (+ 4 hours of overruled _Paid Leave_)
And sees 0 hours of _Work_ (+ 8 hours of overruled _Work_)

To keep things simple, you can:

* assume that employees have to work a fixed amount of 8 hours each day
* work with a single employee and a single day.

## Extensions:

* allow multiple day input, for example: book _Sick Leave_ from July 15h until July 18th and book _Paid Leave_ from the 17th to the 25th of July
* make the _Work_ flexible (so not always 8 hours)