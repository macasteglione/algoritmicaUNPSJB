
Program ejercicio;


//acabamos de ver ele comando array, ahora vamoas a usarlonpara sumar dos numeros de 50 sifras, los numeros los genramos con random


{type
    numero1 = array[1..50] of String;
    numero2 =   array[1..50] Of String;}

Var 
    num1, num2 :   String;
    numero1, numero2, code, total, i:   Integer;

Begin
    {WriteLn('numero1: ');
    Readln(num1);
    WriteLn('numero2: ');
    Readln(num2);}
    num1 := '1234';
    num2 := '1234';

    total := 0;
    
    For i := 0 To Length(num1) Do
        Begin
            val(num1[i], numero1, code);
            val(num2[i], numero2, code);
            total := total + (numero1 + numero2)
        End;
    WriteLn(total)
End.
