import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
	//return 0;
    }

    //Método que dice el mayor de tres números
    public int mayorDeTresNumeros(int a, int b, int c) {
    if (a >= b && a >= c) return a;
    if (b >= c) return b;  
    return c;
}

    // Método que retorna la tabla de multiplicar de un número
   public int[] tablaMultiplicar(int numero, int limite) {
    int[] tabla = new int[limite];
    for (int i = 0; i < limite; i++) {
        tabla[i] = numero * (i + 1);
    }
    return tabla;
}

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
    }
    int resultado = 1;
    for (int i = 2; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

    // Método que verifica si un número es primo
   public boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    for (int i = 2; i * i <= numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }
    return true;
}
    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
    if (n < 0) {
        throw new IllegalArgumentException("El número de elementos n no puede ser negativo.");
    }
    if (n == 0) {
        return new int[0];
    }

    int[] fibonacci = new int[n];
    fibonacci[0] = 0;

    if (n > 1) {
        fibonacci[1] = 1;
    }

    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    return fibonacci;
}

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) {
        return 0;
    }
    int suma = 0;
    for (int num : arreglo) {
        suma += num;
    }
    return suma;
}

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) {
        return 0.0;
    }
    return (double) sumaElementos(arreglo) / arreglo.length;
}

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede ser nulo ni estar vacío.");
    }
    int mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] > mayor) {
            mayor = arreglo[i];
        }
    }
    return mayor;
}

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
    if (arreglo == null || arreglo.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede ser nulo ni estar vacío.");
    }
    int menor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
        if (arreglo[i] < menor) {
            menor = arreglo[i];
        }
    }
    return menor;
}

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
    if (arreglo == null) {
        return false;
    }
    for (int num : arreglo) {
        if (num == elemento) {
            return true;
        }
    }
    return false;
}

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
    if (arreglo == null) {
        return new int[0];
    }
    int[] invertido = new int[arreglo.length];
    for (int i = 0; i < arreglo.length; i++) {
        invertido[i] = arreglo[arreglo.length - 1 - i];
    }
    return invertido;
}

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
    if (arreglo == null) {
        return new int[0];
    }
    int[] ordenado = arreglo.clone();
    for (int i = 0; i < ordenado.length - 1; i++) {
        for (int j = 0; j < ordenado.length - 1 - i; j++) {
            if (ordenado[j] > ordenado[j + 1]) {
                int temp = ordenado[j];
                ordenado[j] = ordenado[j + 1];
                ordenado[j + 1] = temp;
            }
        }
    }
    return ordenado;
}

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
    if (arreglo == null) {
        return new int[0];
    }

    int n = arreglo.length;
    int[] temporal = new int[n];
    int tamanoUnicos = 0;

    for (int i = 0; i < n; i++) {
        boolean esDuplicado = false;
        for (int j = 0; j < tamanoUnicos; j++) {
            if (arreglo[i] == temporal[j]) {
                esDuplicado = true;
                break;
            }
        }
        if (!esDuplicado) {
            temporal[tamanoUnicos] = arreglo[i];
            tamanoUnicos++;
        }
    }

    int[] resultado = new int[tamanoUnicos];
    for (int i = 0; i < tamanoUnicos; i++) {
        resultado[i] = temporal[i];
    }

    return resultado;
}

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
    if (arreglo1 == null && arreglo2 == null) {
        return new int[0];
    }
    if (arreglo1 == null) {
        return arreglo2.clone();
    }
    if (arreglo2 == null) {
        return arreglo1.clone();
    }

    int[] combinado = new int[arreglo1.length + arreglo2.length];

    for (int i = 0; i < arreglo1.length; i++) {
        combinado[i] = arreglo1[i];
    }

    for (int i = 0; i < arreglo2.length; i++) {
        combinado[arreglo1.length + i] = arreglo2[i];
    }

    return combinado;
}

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
    if (arreglo == null || arreglo.length == 0) {
        return new int[0];
    }

    int n = arreglo.length;
    int shift = ((posiciones % n) + n) % n;

    int[] rotado = new int[n];
    for (int i = 0; i < n; i++) {
        rotado[(i + shift) % n] = arreglo[i];
    }

    return rotado;
}

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
    if (cadena == null) {
        return 0;
    }
    return cadena.length();
}

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
    if (cadena == null) {
        return "";
    }
    char[] caracteres = cadena.toCharArray();
    String resultado = "";
    for (int i = caracteres.length - 1; i >= 0; i--) {
        resultado += caracteres[i];
    }
    return resultado;
}

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
    if (cadena == null) {
        return false;
    }
    String limpio = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int izquierda = 0;
    int derecha = limpio.length() - 1;

    while (izquierda < derecha) {
        if (limpio.charAt(izquierda) != limpio.charAt(derecha)) {
            return false;
        }
        izquierda++;
        derecha--;
    }

    return true;
}

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
    if (cadena == null || cadena.trim().isEmpty()) {
        return 0;
    }
    String[] palabras = cadena.trim().split("\\s+");
    return palabras.length;
}

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
    if (cadena == null) {
        return "";
    }
    return cadena.toUpperCase();
}

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
    if (cadena == null) {
        return "";
    }
    return cadena.toLowerCase();
}

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
    if (cadena == null || antiguaSubcadena == null || nuevaSubcadena == null) {
        return cadena;
    }
    return cadena.replace(antiguaSubcadena, nuevaSubcadena);
}

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
    if (cadena == null || subcadena == null) {
        return -1;
    }
    return cadena.indexOf(subcadena);
}

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
    if (correo == null) {
        return false;
    }
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    return correo.matches(regex);
}

    // Método que calcula el promedio de una lista de números
public double promedioLista(List<Integer> lista) {
    if (lista == null || lista.isEmpty()) {
        return 0.0;
    }
    double suma = 0;
    for (int num : lista) {
        suma += num;
    }
    return suma / lista.size();
}
    
// Método que convierte un número en su representación binaria
public String convertirABinario(int numero) {
    if (numero == 0) {
        return "0";
    }

    boolean esNegativo = numero < 0;
    int numAbs = Math.abs(numero);
    StringBuilder binario = new StringBuilder();

    while (numAbs > 0) {
        binario.insert(0, numAbs % 2);
        numAbs /= 2;
    }

    return esNegativo ? "-" + binario.toString() : binario.toString();
}

    // Método que convierte un número en su representación hexadecimal
public String convertirAHexadecimal(int numero) {
    if (numero == 0) {
        return "0";
    }

    boolean esNegativo = numero < 0;
    int numAbs = Math.abs(numero);
    char[] hexChars = "0123456789ABCDEF".toCharArray();
    StringBuilder hex = new StringBuilder();

    while (numAbs > 0) {
        hex.insert(0, hexChars[numAbs % 16]);
        numAbs /= 16;
    }

    return esNegativo ? "-" + hex.toString() : hex.toString();
}

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
    if (eleccionUsuario == null) {
        return "Elección inválida";
    }

    String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
    String eleccionComputadora = opciones[(int) (Math.random() * opciones.length)];
    String usuario = eleccionUsuario.trim();

    if (usuario.equalsIgnoreCase(eleccionComputadora)) {
        return "Empate (Ambos eligieron " + eleccionComputadora + ")";
    }

    boolean ganaUsuario = false;

    switch (usuario.toLowerCase()) {
        case "piedra":
            ganaUsuario = eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto");
            break;
        case "papel":
            ganaUsuario = eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock");
            break;
        case "tijera":
            ganaUsuario = eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto");
            break;
        case "lagarto":
            ganaUsuario = eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel");
            break;
        case "spock":
            ganaUsuario = eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra");
            break;
        default:
            return "Opción no válida";
    }

    if (ganaUsuario) {
        return "Ganaste (Computadora eligió " + eleccionComputadora + ")";
    } else {
        return "Perdiste (Computadora eligió " + eleccionComputadora + ")";
    }
}

    public String pptls2(String game[]) {
    if (game == null || game.length < 2) {
        return "Empate";
    }

    String p1 = game[0].toUpperCase();
    String p2 = game[1].toUpperCase();

    if (p1.equals(p2)) {
        return "Empate";
    }

    boolean p1Gana = false;

    switch (p1) {
        case "R": // Rock
            p1Gana = p2.equals("S") || p2.equals("L");
            break;
        case "P": // Paper
            p1Gana = p2.equals("R") || p2.equals("V");
            break;
        case "S": // Scissors
            p1Gana = p2.equals("P") || p2.equals("L");
            break;
        case "L": // Lizard
            p1Gana = p2.equals("V") || p2.equals("P");
            break;
        case "V": // Spock
            p1Gana = p2.equals("S") || p2.equals("R");
            break;
    }

    return p1Gana ? "Player 1" : "Player 2";
}

   public double areaCirculo(double radio) {
    if (radio < 0) {
        return 0.0;
    }
    return Math.PI * Math.pow(radio, 2);
}

        public String zoodiac(int day, int month) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "Fecha inválida";
        }

        switch (month) {
            case 1:  return (day <= 19) ? "Capricornio" : "Acuario";
            case 2:  return (day <= 18) ? "Acuario" : "Piscis";
            case 3:  return (day <= 20) ? "Piscis" : "Aries";
            case 4:  return (day <= 19) ? "Aries" : "Tauro";
            case 5:  return (day <= 20) ? "Tauro" : "Géminis";
            case 6:  return (day <= 20) ? "Géminis" : "Cáncer";
            case 7:  return (day <= 22) ? "Cáncer" : "Leo";
            case 8:  return (day <= 22) ? "Leo" : "Virgo";
            case 9:  return (day <= 22) ? "Virgo" : "Libra";
            case 10: return (day <= 22) ? "Libra" : "Escorpio";
            case 11: return (day <= 21) ? "Escorpio" : "Sagitario";
            case 12: return (day <= 21) ? "Sagitario" : "Capricornio";
            default: return "Fecha inválida";
        }
    }

}
