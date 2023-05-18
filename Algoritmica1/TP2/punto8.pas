
Program punto8;

Var 
    numero, palindromo1, palindromo2 :   String;
    i :   Integer;
    esPalindromo :   Boolean;
Begin
    WriteLn('Escriba un numero: ');
    ReadLn(numero);
    If Length(numero) Mod 2 = 0 Then
        Begin
            palindromo1 := Copy(numero, Low(numero), Length(numero) Div 2);
            palindromo2 := Copy(numero, (Length(numero) Div 2) + 1, Length(numero) Div 2);
            For i := Length(palindromo1) Downto Low(palindromo1) + 1 Do
                Begin
                    If palindromo1[i] = palindromo2[Length(palindromo2) - (i - 1)] Then
                        esPalindromo := True
                    Else
                        esPalindromo := False;
                End;
        End
    Else
        Begin
            For i := Length(numero) Div 2 Downto Low(numero) + 1 Do
                Begin
                    If numero[i] = numero[Length(numero) - (i - 1)] Then
                        esPalindromo := True
                    Else
                        esPalindromo := False;
                End;
        End;
    WriteLn('Es el numero un palindromo? ', esPalindromo, '!')
End.
