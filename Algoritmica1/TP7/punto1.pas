
Program punto1;

Var 
    arrGrande :   array [0..10] Of LongInt;
    i, j, a, b, aux, puntoMedio, dato :   Integer;

Procedure llenarYMostrar;
Begin
    For i := Low(arrGrande) To High(arrGrande) Do
        Begin
            arrGrande[i] := random(100);
            Write(arrGrande[i], ' ')
        End;
    For i := Low(arrGrande) To High(arrGrande) Do
        For j := Low(arrGrande) To High(arrGrande) Do
            If arrGrande[j] > arrGrande[j + 1] Then
                Begin
                    aux := arrGrande[j];
                    arrGrande[j] := arrGrande[j + 1];
                    arrGrande[j + 1] := aux;
                End;
    WriteLn
End;

Procedure busquedaSecuencial;
Begin
    i := 0;
    Write('Ingrese un numero: ');
    ReadLn(dato);
    While (i <= High(arrGrande)) And (arrGrande[i] <> dato) Do
        i := i + 1;
    If i <= High(arrGrande) Then
        Begin
            dato := i;
            WriteLn(dato)
        End
    Else
        WriteLn('No se encontro el dato.')
End;

Procedure busquedaBinaria;
Begin
    a := Low(arrGrande);
    b := High(arrGrande);
    Write('Ingrese un numero: ');
    ReadLn(dato);
    Repeat
        puntoMedio := (a + b) Div 2;
        If dato = arrGrande[puntoMedio] Then
            dato := puntoMedio
        Else
            Begin
                If dato < arrGrande[puntoMedio] Then
                    b := puntoMedio - 1
                Else
                    a := puntoMedio + 1
            End;
    Until (a > b) Or (dato <> 0);
    WriteLn(dato)
End;

Begin
    randomize;
    llenarYMostrar;
    //busquedaSecuencial;
    busquedaBinaria;
End.
