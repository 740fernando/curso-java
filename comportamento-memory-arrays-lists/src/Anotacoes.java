
public class Anotacoes {
/*
 * Classes são tipos referência-Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim
“tentáculos” (ponteiros) para caixas
   Valor "null" - Tipos referência aceitam o valor "null", que indica que a variável aponta pra ninguém.
   Valores padrão- Quando alocamos (new) qualquer tipo estruturado (classe ou array),
são atribuídos valores padrão aos seus elementos

                          Tipos referência vs. tipos valor
CLASSE                                            TIPO PRIMITIVO

Vantagem: usufrui de todos recursos OO            Vantagem: é mais simples e mais performático

Variáveis são ponteiros                           Variáveis são caixas

Objetos precisam ser instanciados usando new, ou  Não instancia. Uma vez declarados, estão prontos
apontar para um objeto já existente.              para uso.  

Aceita valor null                                 Não aceita valor null

Y = X;                                            Y = X;
"Y passa a apontar para onde X aponta"            "Y recebe uma cópia de X"

Objetos instanciados no heap                       "Objetos" instanciados no stack

Objetos não utilizados são desalocados em um       "Objetos" são desalocados imediatamente quando
momento próximo pelo garbage collector              seu escopo de execução é finalizado

Garbage collector
• É um processo que automatiza o gerenciamento de memória de um
programa em execução
• O garbage collector monitora os objetos alocados dinamicamente
pelo programa (no heap), desalocando aqueles que não estão mais
sendo utilizados.

• Objetos alocados dinamicamente, quando não possuem mais
referência para eles, serão desalocados pelo garbage collector
• Variáveis locais são desalocadas imediatamente assim que seu escopo
local sai de execução


 */
}
