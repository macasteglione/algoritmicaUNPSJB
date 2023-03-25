Program punto10;

Var 
    i, factorial, numero :   Integer;
Begin
    WriteLn('Ingrese un numero: ');
    ReadLn(numero);
    factorial := 1;
    For i := numero Downto 1 Do
        factorial := factorial * i;
    WriteLn(factorial)
End.
