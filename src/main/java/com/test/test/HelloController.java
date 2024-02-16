package com.test.test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class HelloController {

    final FileChooser fileChooser = new FileChooser();

    String s = "1. Думаю, как бы мне скрыть неудачу от других и не показать виду, что меня это трогает;\n" +
            "3. А как я буду об этом говорить с отцом или матерью, с близкими?;\n" +
            "4. Как об этом скажу тому, кто меня любит?;\n" +
            "5. Интересно, кто же из моих знакомых по этому поводу будет злорадствовать?;\n" +
            "643. Интересно, кто же из моих знакомых по этому поводу будет злорадствовать?;\n" +
            "9. Изменят мнение обо мне в плохую сторону;\n";



    @FXML
    private VBox root;

    @FXML
    private Button openButton;

    @FXML
    private Label welcomeText;
    @FXML
    private Label l51;

    @FXML
    private Label l52;

    @FXML
    private Label l53;
    @FXML
    private Label l54;
    @FXML
    private Label l61;
    @FXML
    private Label l62;
    @FXML
    private Label l63;
    @FXML
    private Label l64;
    @FXML
    private Label l71;
    @FXML
    private Label l72;
    @FXML
    private Label l73;
    @FXML
    private Label l74;
    @FXML
    private Label l81;
    @FXML
    private Label l82;
    @FXML
    private Label l83;
    @FXML
    private Label l84;
    @FXML
    private Label l91;
    @FXML
    private Label l92;
    @FXML
    private Label l93;
    @FXML
    private Label l94;
    @FXML
    private Label l101;
    @FXML
    private Label l102;
    @FXML
    private Label l103;
    @FXML
    private Label l104;
    @FXML
    private Label l111;
    @FXML
    private Label l112;
    @FXML
    private Label l113;
    @FXML
    private Label l114;
    @FXML
    private Label l121;
    @FXML
    private Label l122;
    @FXML
    private Label l123;
    @FXML
    private Label l124;
    @FXML
    private Label l131;
    @FXML
    private Label l132;
    @FXML
    private Label l133;
    @FXML
    private Label l134;
    @FXML
    private Label l141;
    @FXML
    private Label l142;
    @FXML
    private Label l143;
    @FXML
    private Label l144;
    @FXML
    private Label l151;
    @FXML
    private Label l152;
    @FXML
    private Label l153;
    @FXML
    private Label l154;
    @FXML
    private Label l161;
    @FXML
    private Label l162;
    @FXML
    private Label l163;
    @FXML
    private Label l164;
    @FXML
    private Label l171;
    @FXML
    private Label l172;
    @FXML
    private Label l173;
    @FXML
    private Label l174;
    @FXML
    private Label l181;
    @FXML
    private Label l182;
    @FXML
    private Label l183;
    @FXML
    private Label l184;
    @FXML
    private Label l191;
    @FXML
    private Label l192;
    @FXML
    private Label l193;
    @FXML
    private Label l194;
    @FXML
    private Label l201;
    @FXML
    private Label l202;
    @FXML
    private Label l203;
    @FXML
    private Label l204;

    @FXML
    private Label sum5;

    @FXML
    private Label sum6;

    @FXML
    private Label sum7;

    @FXML
    private Label sum8;

    @FXML
    private Label sum9;

    @FXML
    private Label sum10;

    @FXML
    private Label sum11;

    @FXML
    private Label sum12;

    @FXML
    private Label sum13;

    @FXML
    private Label sum14;

    @FXML
    private Label sum15;

    @FXML
    private Label sum16;

    @FXML
    private Label sum17;

    @FXML
    private Label sum18;

    @FXML
    private Label sum19;

    @FXML
    private Label sum20;

    @FXML
    private Label fearRes;

    @FXML
    private Label shameRes;

    @FXML
    private Label guiltyRes;

    @FXML
    private Label resentmentRes;

    @FXML
    private Label fearLabel;

    @FXML
    private Label shameLabel;

    @FXML
    private Label guiltyLabel;

    @FXML
    private Label resentmentLabel;


    @FXML
    protected void onOpenButtonClick(){

    }
    @FXML
    protected void onHelloButtonClick() {
        String string ="Question - ЧАСТЬ 1. ПЕРЕЖИВАНИЕ СТРАХА НЕУДАЧИ\n" +
                "\n" +
                "\n" +
                "Question - ВЕРНИТЕСЬ В ВООБРАЖЕНИИ В СИТУАЦИЮ, КОГДА ВЫ ПОТЕРПЕЛИ НЕУДАЧУ\n" +
                "2. Возникают мысли, похожие на \"виноград-то зелен\";\n" +
                "17. Неудача случайна: стечение обстоятельств;\n" +
                "18. За одного битого двух небитых дают, - неудачи закаляют;\n" +
                "21. Опыт неудачи важнее опыта успеха;\n" +
                "35. Почему же так получилось?\n" +
                "38. Сам виноват, надо было больше работать (учиться, тренироваться и т.д.)\n" +
                "39. У меня есть, кто мне может помочь пережить это\n" +
                "42. Стоит подумать, о плюсах моей неудачи.\n" +
                "\n" +
                "Question - ЧАСТЬ 2. ВИНА\n" +
                "\n" +
                "\n" +
                "Question - ВЕРНИТЕСЬ В ВООБРАЖЕНИИ В СИТУАЦИЮ КОГДА ВЫ БЫЛИ ВИНОВАТЫ\n" +
                "51. Если бы это повторилось, я поступил бы иначе;\n" +
                "76. Думаю, как попросить прощения;\n" +
                "\n" +
                "Question - ЧАСТЬ 3. СТЫД\n" +
                "\n" +
                "\n" +
                "Question - ВЕРНИТЕСЬ В ВООБРАЖЕНИИ В СИТУАЦИЮ КОГДА ВАМ БЫЛО СТЫДНО\n" +
                "101. Если бы это повторилось, я поступил бы иначе;\n" +
                "102. Если бы это был лишь сон, или мне показалось?;\n" +
                "105. Я сам (сама) в этом виноват;\n" +
                "117. Да, я такой, со мною это бывает и я принимаю себя таким;\n" +
                "127. Стану лучше, а стыд – мне напоминание;\n" +
                "\n" +
                "Question - ЧАСТЬ 4. ОБИДА\n" +
                "\n" +
                "\n" +
                "Question - ВЕРНИТЕСЬ В ВООБРАЖЕНИИ В СИТУАЦИЮ КОГДА ВЫ БЫЛИ ОБИЖЕНЫ\n" +
                "138. А как ему (ей) следовало бы вести себя, чтобы я не обиделся?;\n" +
                "139. Почему себя он вёл так, а не иначе?;\n" +
                "140. Ему (ей) следовало бы вести себя иначе;\n" +
                "165. Перестану с ними иметь дело;\n" +
                "166. Не буду общаться с ними;\n" +
                "179. Я обиделся, а ведь он свободен и вправе поступать, как ему угодно;\n" +
                "\n";





      //  for (int i=0; i<181; i++) {
       //     string += i+"."+"\n";
       // }
        String newStrin = test.remasteringString(string);

        if (test.stringAnalize(newStrin)==true) {

            test.analize(test.getNumbersOfQuestions(newStrin));
            fearRes.setText(String.valueOf(test.fearAll)+"/"+String.valueOf(test.sgmFear));
            guiltyRes.setText(String.valueOf(test.guiltyAll)+"/"+String.valueOf(test.sgmGuilty));
            shameRes.setText(String.valueOf(test.shameAll)+"/"+String.valueOf(test.sgmShame));
            resentmentRes.setText(String.valueOf(test.getResentmentAll())+"/"+String.valueOf(test.sgmResentment));

            int fp =100/42*test.fearAll;
            int gp =100/37*test.guiltyAll;
            int sp =100/38*test.shameAll;
            int rp =100/43*test.resentmentAll;
            int p5=100/16*test.countOfAgression5;
            int p6=100/15*test.getCountOfAgression6;
            int p7=100/6*test.racioDevalvationOfObj7;
            int p8=100/13*test.racioByCircumstances8;
            int p9=100/10*test.proectiom9;
            int p10=100/18*test.guiltyDefense10;
            int p11=100/14*test.shameDefence11;
            int p12=100/15*test.fearDefense12;
            int p13=100/6*test.envyDefence13;
            int p14=100/23*test.resentmentDefense14;
            int p15=100/25*test.flee15;
            int p16=100/19*test.selfAbasement16;
            int p17=100/6*test.arousingGuilt17;
            int p18=100/33*test.sgm18;
            int p19=100/9*test.behaviorMismatch19;
            int p20=100/14*test.appelation20;


            int fb = (int) Math.round((fp*0.42));
            int gb = (int) Math.round((gp*0.37));
            int sb = (int) Math.round(sp*0.38);
            int rb = (int) Math.round(rp*0.43);
            int b5 = (int) Math.round(p5*0.15);



            fearLabel.setText(fearLabel.getText()+" " + String.valueOf(fp)+ "%" + " | " +fb+" баллов | "+"N= 19 мыслей или 45%");
            guiltyLabel.setText(guiltyLabel.getText()+" " + String.valueOf(gp)+ "%"+ " | " +gb +" баллов | " +"N= 17 мыслей или 45%");
            shameLabel.setText(shameLabel.getText()+" " + String.valueOf(sp)+ "%" + " | " +sb +" баллов | " +"N= 17 мыслей или 44.7%" );
            resentmentLabel.setText(resentmentLabel.getText()+" " + String.valueOf(rp)+ "%" + " | " +rb +" баллов | " +"N= 20 мыслей 46.5%");

            sum5.setText(String.valueOf(test.countOfAgression5)+" | "+String.valueOf(p5) +"% | N=5 отв. или 31.25%");
            sum6.setText(String.valueOf(test.getCountOfAgression6)+" | "+String.valueOf(p6)+"% | N=7 отв. или 46%");
            sum7.setText(String.valueOf(test.racioDevalvationOfObj7)+" | "+String.valueOf(p7)+"% | N=7 отв. или 46%");
            sum8.setText(String.valueOf(test.racioByCircumstances8)+" | "+String.valueOf(p8)+"% | N=5 отв. или 38.5%");
            sum9.setText(String.valueOf(test.proectiom9)+" | "+String.valueOf(p9)+"% | N=4 отв. или 40%");
            sum10.setText(String.valueOf(test.guiltyDefense10)+" | "+String.valueOf(p10)+"% | N=7 отв. или 39%");
            sum11.setText(String.valueOf(test.shameDefence11)+" | "+String.valueOf(p11)+"% | N=7 отв. или 50%");
            sum12.setText(String.valueOf(test.fearDefense12)+" | "+String.valueOf(p12)+"% | N=7 отв. или 45%");
            sum13.setText(String.valueOf(test.envyDefence13)+" | "+String.valueOf(p13)+"% | N=4 отв. или 66%");
            sum14.setText(String.valueOf(test.resentmentDefense14)+" | "+String.valueOf(p14)+"% | N=10 отв. или 43.5%");
                sum15.setText(String.valueOf(test.flee15)+" | "+String.valueOf(p15)+"% | N=12 отв. или 48%");
            sum16.setText(String.valueOf(test.selfAbasement16)+" | "+String.valueOf(p16)+"% | N=8 отв. или 42%");
            sum17.setText(String.valueOf(test.arousingGuilt17)+" | "+String.valueOf(p17)+"% | N=4 отв. или 66%");
            sum18.setText(String.valueOf(test.sgm18)+" | "+String.valueOf(p18)+"% | N=18 отв. или 54.5%");
            sum19.setText(String.valueOf(test.behaviorMismatch19)+" | "+String.valueOf(p19)+"% | N=5 отв. или 55.5%");
            sum20.setText(String.valueOf(test.appelation20)+" | "+String.valueOf(p20)+"% | N=6 отв. или 42%");

            welcomeText.setText("Анализ");
            l51.setText(test.getS51());
            l52.setText(test.getS52());
            l53.setText(test.getS53());
            l54.setText(test.getS54());

            l61.setText(test.getS61());
            l62.setText(test.getS62());
            l63.setText(test.getS63());
            l64.setText(test.getS64());

            l71.setText(test.getS71());
            l72.setText(test.getS72());
            l73.setText(test.getS73());
            l74.setText(test.getS74());

            l81.setText(test.getS81());
            l82.setText(test.getS82());
            l83.setText(test.getS83());
            l84.setText(test.getS84());

            l91.setText(test.getS91());
            l92.setText(test.getS92());
            l93.setText(test.getS93());
            l94.setText(test.getS94());

            l101.setText(test.getS101());
            l102.setText(test.getS102());
            l103.setText(test.getS103());
            l104.setText(test.getS104());

            l111.setText(test.getS111());
            l112.setText(test.getS112());
            l113.setText(test.getS113());
            l114.setText(test.getS114());

            l121.setText(test.getS121());
            l122.setText(test.getS122());
            l123.setText(test.getS123());
            l124.setText(test.getS124());

            l131.setText(test.getS131());
            l132.setText(test.getS132());
            l133.setText(test.getS133());
            l134.setText(test.getS134());

            l141.setText(test.getS141());
            l142.setText(test.getS142());
            l143.setText(test.getS143());
            l144.setText(test.getS144());

            l151.setText(test.getS151());
            l152.setText(test.getS152());
            l153.setText(test.getS153());
            l154.setText(test.getS154());

            l161.setText(test.getS161());
            l162.setText(test.getS162());
            l163.setText(test.getS163());
            l164.setText(test.getS164());

            l171.setText(test.getS171());
            l172.setText(test.getS172());
            l173.setText(test.getS173());
            l174.setText(test.getS174());

            l181.setText(test.getS181());
            l182.setText(test.getS182());
            l183.setText(test.getS183());
            l184.setText(test.getS184());

            l191.setText(test.getS191());
            l192.setText(test.getS192());
            l193.setText(test.getS193());
            l194.setText(test.getS194());

            l201.setText(test.getS201());
            l202.setText(test.getS202());
            l203.setText(test.getS203());
            l204.setText(test.getS204());


        } else {
            welcomeText.setText("Данные не валидны");
        }



    }




}