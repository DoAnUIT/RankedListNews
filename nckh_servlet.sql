create table news
(
	id int primary key,
    title nvarchar(200),
    contenturl nvarchar(200),
    categoryid int,
    magazineid int,
    description text,
    imageurl nvarchar(200),
    newstime timestamp,
    rating int
);

