DECLARE
    day_num NUMBER := &enter_day_num;
BEGIN
    CASE day_num
        WHEN 1 THEN DBMS_OUTPUT.PUT_LINE('Sunday');
        WHEN 2 THEN DBMS_OUTPUT.PUT_LINE('Monday');
        WHEN 3 THEN DBMS_OUTPUT.PUT_LINE('Tuesday');
        WHEN 4 THEN DBMS_OUTPUT.PUT_LINE('Wednesday');
        WHEN 5 THEN DBMS_OUTPUT.PUT_LINE('Thursday');
        WHEN 6 THEN DBMS_OUTPUT.PUT_LINE('Friday');
        WHEN 7 THEN DBMS_OUTPUT.PUT_LINE('Saturday');
        ELSE DBMS_OUTPUT.PUT_LINE('Invalid day number');
    END CASE;
END;
/
