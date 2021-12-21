package carlos.cesar.aancoraactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuestoesActivity extends AppCompatActivity {

    protected Button BtResultado;//aqui esta ok!!
    private ListView lvRespostas;//declaração da listview que fará ligação com a listview do xml
    private List<Resposta> listaResultado;// lista que recebera os dados  da classe resposta
    private ArrayAdapter adapter; // arrayadapter sera o desenho pronto de uma estrutura de view(sera definido o desenho e recebera as info da lista de resposta)
    //Abaixo Edit text para as 40 questões//
    private EditText etQ01,etQ02,etQ03,etQ04,etQ05,etQ06,etQ07,etQ08,etQ09,etQ10;
    private EditText etQ11,etQ12,etQ13,etQ14,etQ15,etQ16,etQ17,etQ18,etQ19,etQ20;
    private EditText etQ21,etQ22,etQ23,etQ24,etQ25,etQ26,etQ27,etQ28,etQ29,etQ30;
    private EditText etQ31,etQ32,etQ33,etQ34,etQ35,etQ36,etQ37,etQ38,etQ39,etQ40;
    //Acima Edit text para as 40 questões//
    //***************************************************************************************

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

/////////////////////////////////////////////////////////////////////////
                lvRespostas = findViewById(R.id.lvResultado);//id do listview dentro da activity resultado
//
//        lvRespostas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//           @Override//metodo criado para alterar resposta criada dentro da view ..mas não sera usada...sói teste
//         public void onItemClick(AdapterView<?> parent, View view, int podition, long id) {
//                Intent proxima = new Intent(QuestoesActivity.this,ResultadoActivity.class);
//                proxima.putExtra("acao","alterarresultado");
//                startActivity(proxima);
//    }
//        });
///////////////////////////////////////////////////////////////////////////////////////////////////
///Abaixo  referencias dos 40 atributos"etQ..."  linkando-os  aos edit text do layout  activity_questoes.xml
        etQ01=findViewById(R.id.etQ01);etQ02=findViewById(R.id.etQ02);etQ03=findViewById(R.id.etQ03);
        etQ04=findViewById(R.id.etQ04);etQ05=findViewById(R.id.etQ05);etQ06=findViewById(R.id.etQ06);
        etQ07=findViewById(R.id.etQ07);etQ08=findViewById(R.id.etQ08);etQ09=findViewById(R.id.etQ09);
        etQ10=findViewById(R.id.etQ10);etQ11=findViewById(R.id.etQ11);etQ12=findViewById(R.id.etQ12);
        etQ13=findViewById(R.id.etQ13);etQ14=findViewById(R.id.etQ14);etQ15=findViewById(R.id.etQ15);
        etQ16=findViewById(R.id.etQ16);etQ17=findViewById(R.id.etQ17);etQ18=findViewById(R.id.etQ18);
        etQ19=findViewById(R.id.etQ19);etQ20=findViewById(R.id.etQ20);etQ21=findViewById(R.id.etQ21);
        etQ22=findViewById(R.id.etQ22);etQ23=findViewById(R.id.etQ23);etQ24=findViewById(R.id.etQ24);
        etQ25=findViewById(R.id.etQ25);etQ26=findViewById(R.id.etQ26);etQ27=findViewById(R.id.etQ27);
        etQ28=findViewById(R.id.etQ28);etQ29=findViewById(R.id.etQ29);etQ30=findViewById(R.id.etQ30);
        etQ31=findViewById(R.id.etQ31);etQ32=findViewById(R.id.etQ32);etQ33=findViewById(R.id.etQ33);
        etQ34=findViewById(R.id.etQ34);etQ35=findViewById(R.id.etQ35);etQ36=findViewById(R.id.etQ36);
        etQ37=findViewById(R.id.etQ37);etQ38=findViewById(R.id.etQ38);etQ39=findViewById(R.id.etQ39);
        etQ40=findViewById(R.id.etQ40);
//Acima referencias dos 40 atributos"etQ..."  linkando-os  aos edit text do layout  activity_questoes.xml
        //############################


        //###########################
        ///////////////////////////////////////aqui esta ok!!
                BtResultado = findViewById(R.id.btmostraresult);//chama listview com resultado
        BtResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proxima = new Intent(QuestoesActivity.this,ResultadoActivity.class);

               // proxima.putExtra("acao","mostrarresultado");
                //startActivity(proxima);
                abrirResultado();
            }
        });

        //carregarlistafake();// buga tudo
    }


    //
    //metodo para receber os resultados das quests e convertelos á double, na sequencia calcura e
    // cria os resultados que serão mostrados na tela
   protected void abrirResultado(){
        //conversão de valores string das quentões em double
         String Q01 = etQ01.getText().toString();String Q02 = etQ02.getText().toString();
         String Q03 = etQ03.getText().toString();String Q04 = etQ04.getText().toString();
         String Q05 = etQ05.getText().toString();String Q06 = etQ06.getText().toString();
         String Q07 = etQ07.getText().toString();String Q08 = etQ08.getText().toString();
         String Q09 = etQ09.getText().toString();String Q10 = etQ10.getText().toString();
         String Q11 = etQ11.getText().toString();String Q12 = etQ12.getText().toString();
         String Q13 = etQ13.getText().toString();String Q14 = etQ14.getText().toString();
         String Q15 = etQ15.getText().toString();String Q16 = etQ16.getText().toString();
         String Q17 = etQ17.getText().toString();String Q18 = etQ18.getText().toString();
         String Q19 = etQ19.getText().toString();String Q20 = etQ20.getText().toString();
         String Q21 = etQ21.getText().toString();String Q22 = etQ22.getText().toString();
         String Q23 = etQ23.getText().toString();String Q24 = etQ24.getText().toString();
         String Q25 = etQ25.getText().toString();String Q26 = etQ26.getText().toString();
         String Q27 = etQ27.getText().toString();String Q28 = etQ28.getText().toString();
         String Q29 = etQ29.getText().toString();String Q30 = etQ30.getText().toString();
         String Q31 = etQ31.getText().toString();String Q32 = etQ32.getText().toString();
         String Q33 = etQ33.getText().toString();String Q34 = etQ34.getText().toString();
         String Q35 = etQ35.getText().toString();String Q36 = etQ36.getText().toString();
         String Q37 = etQ37.getText().toString();String Q38 = etQ38.getText().toString();
         String Q39 = etQ39.getText().toString();String Q40 = etQ40.getText().toString();
         //aqui eu converto a declaração acima de string para double para poder fazer o calculo
       // da logica das respostas e apresentar a logica de acordo com o calculo
         double DQ01= Double.valueOf(Q01);double DQ02= Double.valueOf(Q02);
         double DQ03= Double.valueOf(Q03);double DQ04= Double.valueOf(Q04);
         double DQ05= Double.valueOf(Q05);double DQ06= Double.valueOf(Q06);
         double DQ07= Double.valueOf(Q07);double DQ08= Double.valueOf(Q08);
         double DQ09= Double.valueOf(Q09);double DQ10= Double.valueOf(Q10);
         double DQ11= Double.valueOf(Q11);double DQ12= Double.valueOf(Q12);
         double DQ13= Double.valueOf(Q13);double DQ14= Double.valueOf(Q14);
         double DQ15= Double.valueOf(Q15);double DQ16= Double.valueOf(Q16);
         double DQ17= Double.valueOf(Q17);double DQ18= Double.valueOf(Q18);
         double DQ19= Double.valueOf(Q19);double DQ20= Double.valueOf(Q20);
         double DQ21= Double.valueOf(Q21);double DQ22= Double.valueOf(Q22);
         double DQ23= Double.valueOf(Q23);double DQ24= Double.valueOf(Q24);
         double DQ25= Double.valueOf(Q25);double DQ26= Double.valueOf(Q26);
         double DQ27= Double.valueOf(Q27);double DQ28= Double.valueOf(Q28);
         double DQ29= Double.valueOf(Q29);double DQ30= Double.valueOf(Q30);
         double DQ31= Double.valueOf(Q31);double DQ32= Double.valueOf(Q32);
         double DQ33= Double.valueOf(Q33);double DQ34= Double.valueOf(Q34);
         double DQ35= Double.valueOf(Q35);double DQ36= Double.valueOf(Q36);
         double DQ37= Double.valueOf(Q37);double DQ38= Double.valueOf(Q38);
         double DQ39= Double.valueOf(Q39);double DQ40= Double.valueOf(Q40);
   //abaixo  vira a pontuação de cada ancora baseada em 8 letras(A,B,C,D,E,F,G,H
   // CADA LETRA CONTERÁ A SOMA DO TOTAL DE( 5 ITENS )dividios por 5 TENDO ASSIM SEU RESULTADO final
       double tipoA =(DQ01+DQ09+DQ17+DQ25+DQ33)/5;
       double tipoB =(DQ02+DQ10+DQ18+DQ26+DQ34)/5;
       double tipoC =(DQ03+DQ11+DQ19+DQ27+DQ35)/5;
       double tipoD =(DQ04+DQ12+DQ20+DQ28+DQ36)/5;
       double tipoE =(DQ05+DQ13+DQ21+DQ29+DQ37)/5;
       double tipoF =(DQ06+DQ14+DQ22+DQ30+DQ38)/5;
       double tipoG =(DQ07+DQ15+DQ23+DQ31+DQ39)/5;
       double tipoH =(DQ08+DQ16+DQ24+DQ32+DQ40)/5;

       //provisório mostrar resultado pelo alert


       String A= "Você alcançou "+tipoA+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n" +
               " Pessoas tecnicamente ancoradas comprometem-se com uma carreira de " +
               "especialização. Elas ficam motivadas quando são especialistas em um " +
               "determinado assunto, buscam trabalhos desafiadores, querem testar o " +
               "conhecimento e a habilidade que possuem em sua área de atuação. São " +
               "pessoas que não visam altos cargos administrativos (essas normalmente " +
               "são mais generalistas) e sim cargos de especialista em uma determinada " +
               "área";

       String B= "Você alcançou "+tipoB+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Quem tem como âncora de carreira a competência administrativa geral " +
               "busca, ao longo de sua vida profissional, atingir os mais altos níveis de " +
               "responsabilidade na organização. São pessoas que visam a liderança e têm " +
               "como motivação atingir o topo da hierarquia corporativa. Para elas, a " +
               "especialização é uma armadilha: entendem a importância de conhecer as " +
               "áreas funcionais, mas não buscam se aprofundar tecnicamente, pois " +
               "querem a função de gerência geral. ";

       String C= "Você alcançou "+tipoC+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Pessoas com essa âncora vão buscar, com o passar do tempo, uma carreira" +
               "que possibilite maior independência, que permite impor suas próprias" +
               "condições. A autonomia é inerente a qualquer ser humano, em níveis" +
               "diferentes, mas quem possui fortemente essa âncora sente a necessidade de" +
               "ser dono de seu próprio destino, fazer as coisas do seu jeito, e por isso vai" +
               "organizar sua vida profissional em torno de trabalhos que lhe" +
               "proporcionem mais escolha e poder de decisão.";

       String D= "Você alcançou "+tipoD+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Aqui se enquadram pessoas que precisam se sentir seguras no ambiente de " +
               "trabalho. Elas buscam maior previsibilidade do futuro, querem “saber " +
               "onde pisam”. São atraídas por empregos em empresas que oferecem essa " +
               "estabilidade, com bons planos de aposentadoria e boa reputação. É essa " +
               "estabilidade, principalmente financeira, que vai guiar a carreira desses " +
               "profissionais.";

       String E= "Você alcançou "+tipoE+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Nessa âncora estão os profissionais com tino para a criação de novos " +
               "negócios e organizações. Não são pessoas necessariamente com " +
               "criatividade artística, mas sim com um espírito empreendedor, que querem " +
               "estabelecer ou reestruturar negócios próprios. Possuem motivação para, " +
               "desde cedo, iniciar empreendimentos para ganhar dinheiro. Vale ressaltar " +
               "que o enfoque aqui não é a busca por autonomia e sim pela criação de " +
               "negócios. ";

       String F= "Você alcançou "+tipoF+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               "Pessoas com essa âncora são orientadas em sua carreira por valores que " +
               "querem imprimir em seu trabalho. Elas se voltam para os valores e se " +
               "dedicam a causas, mais do que aos seus talentos e competências. São " +
               "profissionais que querem, de alguma forma, contribuir para um mundo " +
               "melhor por meio de seu trabalho.";

       String G= "Você alcançou "+tipoG+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Nessa âncora se encaixam profissionais que definem sucesso como a " +
               "superação de obstáculos impossíveis ou como a capacidade de solucionar " +
               "problemas insolúveis. São pessoas que necessitam sentir que podem " +
               "conquistar qualquer coisa. A busca por desafios permeia a carreira da " +
               "maioria das pessoas, mas para quem é ancorado no desafio puro, é o que " +
               "norteia a sua trajetória – todas as suas decisões profissionais vão sempre " +
               "ser com o objetivo de superar desafios cada vez maiores. ";

       String H= "Você alcançou "+tipoH+" entre um total de 6 pontos de aptidão nesta competência:\n\n \n"+
               " Muitas vezes interpretam essa âncora como sendo a de pessoas que não " +
               "dão prioridade a sua carreira. Mas não se trata disso. A questão é que " +
               "pessoas ancoradas pelo estilo de vida buscam encontrar uma forma de " +
               "integrar todas as suas necessidades: individuais, de família e de carreira. " +
               "Podem ser altamente motivadas pelo trabalho, mas entendem que ele deve " +
               "se integrar a sua vida como um todo. São pessoas que querem, acima de " +
               "tudo, flexibilidade. Por isso olham mais para a atitude da empresa do que " +
               "para o programa de trabalho propriamente dito. A diferença para a âncora " +
               "da autonomia é que elas se adaptam bem ao ambiente organizacional, com " +
               "suas regras e restrições, mas querem ter opções mais flexíveis de trabalho.";

       String erro="VALOR MÁXIMO DOS CAMPOS DEVEM SER SEIS(6) " ;

       //condição para caso numero seja maior que 6
           if(DQ01>6||DQ02>6||DQ03>6||DQ04>6||DQ05>6||DQ06>6||DQ07>6||DQ08>6||DQ09>6||DQ10>6
            ||DQ11>6||DQ12>6||DQ13>6||DQ14>6||DQ15>6||DQ16>6||DQ17>6||DQ18>6||DQ19>6||DQ20>6
            ||DQ21>6||DQ22>6||DQ23>6||DQ24>6||DQ25>6||DQ26>6||DQ27>6||DQ28>6||DQ29>6||DQ30>6
            ||DQ31>6||DQ32>6||DQ33>6||DQ34>6||DQ35>6||DQ36>6||DQ37>6||DQ38>6||DQ39>6 ||DQ40>6)
           {
               AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
               tipoa.setTitle("Corrija o Campo de Texto");
               tipoa.setTitle(String.valueOf(erro));
               tipoa.setNegativeButton("RETORNAR",null);
               tipoa.show();
           }else
               {
               if (tipoA >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Competência técnica-funcional");
                   tipoa.setMessage(String.valueOf(A));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoB >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Competência administrativa geral");
                   tipoa.setMessage(String.valueOf(B));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoC >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Autonomia e independência");
                   tipoa.setMessage(String.valueOf(C));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoD >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Segurança e estabilidade");
                   tipoa.setMessage(String.valueOf(D));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoE >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Criatividade empreendedora");
                   tipoa.setMessage(String.valueOf(E));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoF >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Dedicação a uma causa");
                   tipoa.setMessage(String.valueOf(F));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoG >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Desafio puro");
                   tipoa.setMessage(String.valueOf(G));
                   tipoa.setNegativeButton("FECHAR",null);
                   tipoa.show();
               }
               if(tipoH >3){
                   AlertDialog.Builder tipoa= new AlertDialog.Builder(this);
                   tipoa.setTitle("Estilo de vida");
                   tipoa.setMessage(String.valueOf(H));
                   tipoa.setNegativeButton("FECHAR",null);//negative buton
                   tipoa.show();
               }
           }

   }
///////função para carregar lista  fake .... (quando é chamada  buga e fecha o app)
   protected void carregarlistafake(){
        Resposta R1 = new Resposta(8,7,6,5,4,3,
                2,1,"um","dois","tres","quatro",
                "cinco","seis","sete","oito");
        listaResultado = new ArrayList<>();
        listaResultado.add(R1);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaResultado);
         lvRespostas.setAdapter(adapter);
   }
   protected void iflistavazia(){

   }
}