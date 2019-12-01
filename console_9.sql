DROP PROCEDURE UpdateBestsellers2;

create procedure UpdateBestsellers2()
begin
    declare booksread, b_id int;
    declare finished int default 0;
    declare all_books cursor for select book_id from books;
    declare continue handler for not found set finished = 1;
    open all_books;
    while (finished = 0) do
            fetch all_books into b_id;
            if (finished = 0) then
                set booksread = 0;
                select count(*)
                from rents
                where book_id = b_id
                group by month(rent_date)
                having count(*) > 2
                into booksread;


            if (booksread > 0) then
                update books
                set bestseller = true

                where BOOK_ID = b_id;

                commit;
            end if;
        end if;
        end while;

    close all_books;
end;

CALL UpdateBestsellers2();