delimiter //
create procedure getCategories()
begin
select * from category;
end//

delimiter //
create procedure getNews(_offset int, _limit int)
begin
if(_offset = 0 and _limit = 0)
then
select * from news;
else
select * from news 
where id >= _offset and id <= _limit;
end if;

end//

