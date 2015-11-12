delimiter //
create procedure getCategories()
begin
select * from category;
end//


delimiter //
create procedure getNews(off int, li int, category int)
begin
if(category = 0)
then
begin
select * from news 
where idTableNews > off and idTableNews <= li + off;
end;
else
begin
declare a int;
declare b int;
declare d int;
set d = off + li;
if(off = 0) 
then set a = 0; else
select max(idTableNews) into a from (select * from news where categoryid = category limit off) sub;
end if;
select max(idTableNews) into b from (select * from news where categoryid = category limit d) sub;

select * from news
where categoryid = category and idTableNews > a and idTableNews <= b;
end;
end if;
end//
delimiter ;


