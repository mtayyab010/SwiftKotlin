var string1 = "name: ${name}"
var string2 = "full name: ${name} ${lastName}"
var string3 = "name: ${name ?: lastName}"
var string4 = "name: ${user?.name ?: ("-" + lastName)}"
var string5 = "name: ${list.map({ it.name }) ?: "empty"} \tactive: ${active}"