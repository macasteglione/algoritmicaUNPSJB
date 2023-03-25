
Program ruleta1;

Uses sysutils;

Var 
  jugadores :   array Of String;
  apuestas, apuestasDinero, ruleta :   array Of Integer;
  j :   Integer;
  menu1, menu2, menu3 :   String;

Procedure generarApuestas();
Begin
  Repeat
    Begin
      SetLength(jugadores, Length(jugadores) + 1);
      SetLength(ruleta, Length(ruleta) + 1);
      SetLength(apuestas, Length(apuestas) + 1);
      SetLength(apuestasDinero, Length(apuestasDinero) + 1);
      Write('Escriba su nombre: ');
      ReadLn(jugadores[High(jugadores)]);
      Write('A que numero apuestas ', jugadores[High(jugadores)], '? Oprima "i" para apostar por los numeros impares, oprima "p" para los pares, u oprima "n" para un numero especifico: ');
      Repeat
        Begin
          Readln(menu2);
          menu2 := lowercase(menu2);
          Case menu2 Of 
            'i' :   apuestas[High(apuestas)] := -1;
            'p' :   apuestas[High(apuestas)] := -2;
            'n' :
                  Begin
                    Write('Escriba el numero de la ruleta a que apuestas: ');
                    Repeat
                      Begin
                        ReadLn(apuestas[High(apuestas)]);
                        If (apuestas[High(apuestas)] > 36) Or (apuestas[High(apuestas)] <= 0) Then
                          Write('Ese numero esta fuera del rango, intenta de nuevo: ')
                      End;
                    Until (apuestas[High(apuestas)] <= 36) And (apuestas[High(
                          apuestas)] >= 1)
                  End;
            Else
              Write('Esa opcion no esta contemplada, intenta de nuevo: ')
          End
        End;
      Until (menu2 = 'i') Or (menu2 = 'p') Or (menu2 = 'n');
      Write('Ahora, por cuanto dinero apuestas?: ');
      Repeat
        Begin
          ReadLn(apuestasDinero[High(apuestasDinero)]);
          If apuestasDinero[High(apuestasDinero)] < 1 Then
            Write('Tienes que apostar!, intenta de nuevo: ')
        End;
      Until apuestasDinero[High(apuestasDinero)] >= 1;
      Write(jugadores[High(jugadores)], ' ha sido registrado, y apuesta por $',
      apuestasDinero[High(apuestasDinero)], '! oprima cualquier tecla para agregar otro jugador, u oprima "p" para jugar: ');
      ReadLn(menu1)
    End;
  Until lowercase(menu1) = 'p'
End;

Procedure generarRuleta();
Begin
  For j := 0 To Length(ruleta) - 1 Do
    ruleta[j] := random(36);
  For j := 0 To Length(jugadores) - 1 Do
    Begin
      WriteLn('A ', jugadores[j], ' le ha tocado el numero ', ruleta[j], '!');
      If apuestas[j] = -1 Then
        If ruleta[j] Mod 2 = 1 Then
          Begin
            apuestasDinero[j] := apuestasDinero[j] * 2;
            WriteLn(jugadores[j], ' ha ganado $', apuestasDinero[j], '!');
            Continue
          End
      Else
        Begin
          WriteLn(jugadores[j], ' perdio la apuesta!');
          Continue
        End;
      If apuestas[j] = -2 Then
        If ruleta[j] Mod 2 = 0 Then
          Begin
            apuestasDinero[j] := apuestasDinero[j] * 2;
            WriteLn(jugadores[j], ' ha ganado $', apuestasDinero[j], '!');
            Continue
          End
      Else
        Begin
          WriteLn(jugadores[j], ' perdio la apuesta!');
          Continue
        End;
      If apuestas[j] = ruleta[j] Then
        Begin
          apuestasDinero[j] := apuestasDinero[j] * 36;
          WriteLn(jugadores[j], ' ha ganado $', apuestasDinero[j], '!')
        End
      Else
        WriteLn(jugadores[j], ' perdio la apuesta!')
    End
End;

Begin
  Repeat
    Begin
      randomize;
      SetLength(jugadores, 0);
      SetLength(apuestas, 0);
      SetLength(apuestasDinero, 0);
      SetLength(ruleta, 0);
      WriteLn('Bienvenido al juego de la ruleta!');
      generarApuestas();
      generarRuleta();
      Write('Para jugar de nuevo oprima "r", para salir oprima "q": ');
      ReadLn(menu3)
    End;
  Until lowercase(menu3) = 'q';
  WriteLn('Hasta luego!')
End.
