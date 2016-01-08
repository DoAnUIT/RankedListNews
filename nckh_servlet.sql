
create table news
(
	idTableNews int auto_increment primary key,
	id int unique,
    title nvarchar(200),
    contenturl nvarchar(200),
    categoryid int,
    magazineid int,
    description text,
    imageurl nvarchar(300),
    newstime timestamp,
    rating float
);

