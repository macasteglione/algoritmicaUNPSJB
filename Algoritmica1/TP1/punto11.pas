Program punto11;

Var 
    contador, fibonacci, numero, caracter, user : Integer;
Begin
    ReadLn(user);
    caracter := 0;
    contador := 0;
    numero := 1;
    Repeat
        caracter := caracter + 1;
        fibonacci := contador + numero;
        contador := numero;
        numero := fibonacci;
        Write(numero:3)
    Until caracter = user;
End.
