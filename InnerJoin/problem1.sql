SELECT student.id, student.name from student inner join class
on class.class_title = student.class_title where class.teacher_name = 'Ms. Lovelace';