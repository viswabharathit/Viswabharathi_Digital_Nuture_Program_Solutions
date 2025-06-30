DECLARE
    i NUMBER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE('Number: ' || i);
        i := i + 1  ;
        EXIT WHEN i > 5;
    END LOOP;
END;
