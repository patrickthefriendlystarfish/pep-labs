SELECT * FROM class 
left outer join student
on student.class_title = class.class_title;