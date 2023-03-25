Program punto9;

Var 
    numero : Integer;
Begin
    WriteLn('Escriba un numero: ');
    ReadLn(numero);
    If ((numero div numero = 1) And (numero div 1 = numero)) and ((numero mod 3 <> 0) and (numero Mod 2 <> 0)) Then
        WriteLn('es primo')
    Else
        WriteLn('nop')
End.
