
Program punto3;

Var 
    numero, cuadrado, cubo :   Integer;
Begin
    numero := 1;
    WriteLn('Numero:', 'Cuadrado:':20, 'Cubo:':20);
    While numero < 11 Do
        Begin
            cuadrado := Sqr(numero);
            cubo := cuadrado * numero;
            WriteLn(numero, cuadrado:20, cubo:25);
            numero := numero + 1;
        End;
End.
