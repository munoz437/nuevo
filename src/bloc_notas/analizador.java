
package bloc_notas;
import java.util.ArrayList;


public class analizador {
    ArrayList<Token> lista_token = new ArrayList();

    public analizador(ArrayList<Token> lista_token) {
        this.lista_token = lista_token;
    }
    
    
    public void analizar(String cadena){
        int estado=0;
        int decimal=0;
        int numero_token=0;
        String lexema = "";
        String tipo = "";
        //String [] lineas = separador(cadena, '\n');
        String [] lineas = cadena.split("\n");
        
        for(int i=0; i < lineas.length; i++){
            for(int j=0; j < lineas[i].length(); j++){
                int n_actual, n_siguiente = -1;
                
                n_actual = lineas[i].codePointAt(j); //Obteniendo numero de caracter en la tabla
                if(estado ==0){
                    estado = estado_transicion(n_actual);
                }
                try{
                        n_siguiente = lineas[i].codePointAt(j+1);
                }catch(Exception e){
                        
                }
                switch(estado){
                    case 1:
                    {
                        lexema = lexema + lineas[i].charAt(j);
                        if((n_siguiente>=97 && n_siguiente<=122) || (n_siguiente>=65 && n_siguiente<=90)) {
//                                || ((n_siguiente>=40 && n_siguiente<=43) || n_siguiente==45 || n_siguiente==47 || 
//                                n_siguiente==58 || (n_siguiente>=60 && n_siguiente<=62) || n_siguiente==91 || n_siguiente==93 || n_siguiente==123 || n_siguiente==125) || 
//                                ((n_siguiente>=33 && n_siguiente<=39) || n_siguiente==44 || n_siguiente==59 || (n_siguiente>=63 && n_siguiente<=64)) || n_siguiente==94 || n_siguiente==95 ||
//                                n_siguiente==96 || n_siguiente==124 || n_siguiente==126 || n_siguiente==92 || n_siguiente==46){
                            estado = 1;
                        }else{
                            lexema = lexema.toLowerCase();
                            numero_token = i; //PALABRAS RESERVADAS
                            if(("string".equals(lexema)) ||("public".equals(lexema)) || ("static".equals(lexema)) || ("void".equals(lexema)) || ("main".equals(lexema)) || ("private".equals(lexema)) ||
                                    ("this".equals(lexema)) || ("new".equals(lexema)) || ("class".equals(lexema)) || ("int".equals(lexema)) || ("float".equals(lexema)) ||
                                    ("char".equals(lexema)) || ("return".equals(lexema)) || ("for".equals(lexema)) || ("while".equals(lexema)) || ("if".equals(lexema)) ||
                                    ("else".equals(lexema)) || ("true".equals(lexema)) || ("false".equals(lexema)) || ("try".equals(lexema)) || ("catch".equals(lexema)) ||
                                  ("println".equals(lexema)) ||  ("out".equals(lexema)) ||  ("switch".equals(lexema)) || ("case".equals(lexema)) || ("break".equals(lexema)) || ("system".equals(lexema)) ){
                                tipo = "PR";
                            }                //OPERADORES
                            else if(("+".equals(lexema)) || ("-".equals(lexema)) || ("*".equals(lexema)) || ("/".equals(lexema)) || ("(".equals(lexema)) ||
                                    (")".equals(lexema)) || (":=".equals(lexema)) || ("<".equals(lexema)) || ("<=".equals(lexema)) || ("=".equals(lexema)) ||
                                    ("==".equals(lexema)) || (">".equals(lexema)) || (">=".equals(lexema)) || ("[".equals(lexema)) || ("]".equals(lexema)) ||
                                    (";".equals(lexema)) || (".".equals(lexema)) || ("{".equals(lexema)) || ("}".equals(lexema)) ){
                                tipo = "OP";
                            }                //COMENTARIOS
                            else if((lexema.startsWith("//")) || (lexema.startsWith("/*") && lexema.endsWith("*/"))){
                                tipo = "CM";
                            }               //LITERAL DE CARACTER
                            else if(lexema.startsWith("'") && lexema.endsWith("'")){ 
                                tipo = "LC";  
                            }               //STRING LITERALES
                            else if( ("\"".equals(lexema)) || (lexema.startsWith("\"") && lexema.endsWith("\"")) ){
                                tipo = "STL";
                            }
                            
                            else{
                                tipo = "ID";
                            }
                            estado = 0;
                        }
                        break;
                    }    
                    case 2:
                    {
                        lexema = lexema + lineas[i].charAt(j);
                        if((n_siguiente >= 48 && n_siguiente <= 57) || n_siguiente==46){
                            estado = 2;
                        }else{
                            numero_token = 2;
                            tipo = "NUM";
                            estado = 0;
                        }
                        break;
                    }    
                    case 3:
                    {
                        estado = -2;
                        break;
                    }
                    case 4:
                    {
                        estado = -3;
                        break;
                    }  
                    case 999:
                    {
                        lexema = String.valueOf(lineas[i].charAt(j));
                        numero_token = 999;
                        tipo = "ERR";
                        estado = 0;
                        break;
                    }
                }
                if(estado == 0){
                    lista_token.add(new Token(lexema, numero_token, i+1, j+1,tipo));
                    lexema = "";
                    tipo = "";
                }
                if(estado == -2){
                    /*lista_token.add(new Token(lexema, numero_token, i+1, j+1,tipo));*/
                    estado = 0; //VIENE SALTO DE LINEA O TABULACION O ESPACIOS
                    lexema = "\n";
                }
                if(estado == -3){
                    /*lista_token.add(new Token(lexema, numero_token, i+1, j+1,tipo));*/
                    estado = 0;
                }
            }
        }
    }
    public int estado_transicion(int n){//ASCII
                                                     
            //MINUSCULAS         //MAYUSCULAS        //OPERADORES
        if((n>=97 && n<=122) || (n>=65 && n<=90) || ((n>=40 && n<=43) || 
                n==45 || n==46 || n==47 || n==58 || (n>=60 && n<=62) || n==91 ||
                n==93 || n==123 || n==125) ||
                //CHAR ESPECIALES
                ((n>=33 && n<=39) || n==44 || n==59 || (n>=63 && n<=64)) ||
                n==94 || n==95 || n==96 || n==124 || n==126 ||
                //COMENTARIO
                n==92||n==46){
            return 1;
        }else if((n>=48 && n<=57) || n==46){          //NUMEROS
            return 2;
        }else if(n==9 || n==13){                      //ENTER y TAB
            return 3;
        }else if(n==32){                              //SPACE
            return 4;                                 
        }else{                                        //ERRORES, NO AGREGADOS
            return 999;
        }
        
    }

}

//    public String[] separador(String texto, char separar){
//        String linea = "";
//        int contador = 0;
//        for (int i = 0; i < texto.length(); i++){
//            if(texto.charAt(i) == separar){
//                contador ++;
//            }
//        }
//        String [] cadenas = new String[contador];
//        contador = 0;
//        for(int i = 0; i < texto.length(); i++){
//            if(texto.charAt(i) != separar){
//                linea = linea + String.valueOf(texto.charAt((i)));
//            }else{
//                cadenas[contador]= linea;
//                contador++;
//                linea = "";
//            }
//        }
//        return cadenas;
//    }