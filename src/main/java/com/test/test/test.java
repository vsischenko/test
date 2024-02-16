package com.test.test;

import java.util.ArrayList;
import java.util.List;

public class test {
static String s51="*2] ";
static String s52="*3] ";
static String s53="*4] ";
static String s54="*6] ";
static String s61="ХХХ";
static String s62="*6] ";
static String s63="*4] ";
static String s64="*6] ";
static String s71="*7] ";
static String s72="ХХХ";
static String s73="ХХХ";
static String s74="ХХХ";
static String s81="*6] ";
static String s82="*6] ";
static String s83="*3] ";
static String s84="ХХХ";
static String s91="*1] ";
static String s92="*1] ";
static String s93="*4] ";
static String s94="*3] ";
static String s101="*5] ";
static String s102="*9(3)] ";
static String s103="*4] ";
static String s104="*1] ";
static String s111="*2] ";
static String s112="*2(1)] ";
static String s113="*10(2)] ";
static String s114="ХХХ";
static String s121="*13(1)] ";
static String s122="*1] ";
static String s123="*1] ";
static String s124="ХХХ";
static String s131="*5] ";
static String s132="ХХХ";
static String s133="ХХХ";
static String s134="*1] ";
static String s141="ХХХ";
static String s142="ХХХ";
static String s143="*2] ";
static String s144="*21(3)] ";
static String s151="*6] ";
static String s152="*6] ";
static String s153="*8(1)] ";
static String s154="*7] ";
static String s161="*7] ";
static String s162="*7(1)] ";
static String s163="*4 ] ";
static String s164="*3 ] ";
static String s171="ХХХ";
static String s172="ХХХ";
static String s173="ХХХ";
static String s174="*6 ] ";
static String s181="*7 ] ";
static String s182="*14 ] ";
static String s183="*10 ] ";
static String s184="*4 ] ";
static String s191="*1 ] ";
static String s192="*2 ] ";
static String s193="ХХХ";
static String s194="*7 ] ";
static String s201="ХХХ";
static String s202="*1 ] ";
static String s203="*4 ] ";
static String s204="*10 ] ";

//Поля для подсчета 20-ти параметров
    static int countOfAgression5 =0;
    static int getCountOfAgression6 =0;
    static int racioDevalvationOfObj7 =0;
    static int racioByCircumstances8=0;
    static int proectiom9 =0;
    static int guiltyDefense10=0;
    static int shameDefence11=0;
    static int fearDefense12=0;
    static int envyDefence13=0;
    static int resentmentDefense14=0;
    static int flee15=0;
    static int selfAbasement16=0;
    static int arousingGuilt17 =0;
    static int sgm18 =0;
    static int behaviorMismatch19 =0;
    static int appelation20 =0;

    //Поля для подсчета по эмоциям
    static int fearAll =0;
    static int guiltyAll =0;
    static int shameAll =0;
    static int resentmentAll = 0;

    static int sgmFear =0;
    static int sgmGuilty =0;
    static int sgmShame =0;
    static int sgmResentment =0;

    public static int getResentmentAll() {
        return resentmentAll;
    }

    public static String getS51() {
        return s51;
    }

    public static String getS52() {
        return s52;
    }

    public static String getS53() {
        return s53;
    }

    public static String getS54() {
        return s54;
    }

    public static String getS61() {
        return s61;
    }

    public static String getS62() {
        return s62;
    }

    public static String getS63() {
        return s63;
    }

    public static String getS64() {
        return s64;
    }

    public static String getS71() {
        return s71;
    }

    public static String getS72() {
        return s72;
    }

    public static String getS73() {
        return s73;
    }

    public static String getS74() {
        return s74;
    }

    public static String getS81() {
        return s81;
    }

    public static String getS82() {
        return s82;
    }

    public static String getS83() {
        return s83;
    }

    public static String getS84() {
        return s84;
    }

    public static String getS91() {
        return s91;
    }

    public static String getS92() {
        return s92;
    }

    public static String getS93() {
        return s93;
    }

    public static String getS94() {
        return s94;
    }

    public static String getS101() {
        return s101;
    }

    public static String getS102() {
        return s102;
    }

    public static String getS103() {
        return s103;
    }

    public static String getS104() {
        return s104;
    }

    public static String getS111() {
        return s111;
    }

    public static String getS112() {
        return s112;
    }

    public static String getS113() {
        return s113;
    }

    public static String getS114() {
        return s114;
    }

    public static String getS121() {
        return s121;
    }

    public static String getS122() {
        return s122;
    }

    public static String getS123() {
        return s123;
    }

    public static String getS124() {
        return s124;
    }

    public static String getS131() {
        return s131;
    }

    public static String getS132() {
        return s132;
    }

    public static String getS133() {
        return s133;
    }

    public static String getS134() {
        return s134;
    }

    public static String getS141() {
        return s141;
    }

    public static String getS142() {
        return s142;
    }

    public static String getS143() {
        return s143;
    }

    public static String getS144() {
        return s144;
    }

    public static String getS151() {
        return s151;
    }

    public static String getS152() {
        return s152;
    }

    public static String getS153() {
        return s153;
    }

    public static String getS154() {
        return s154;
    }

    public static String getS161() {
        return s161;
    }

    public static String getS162() {
        return s162;
    }

    public static String getS163() {
        return s163;
    }

    public static String getS164() {
        return s164;
    }

    public static String getS171() {
        return s171;
    }

    public static String getS172() {
        return s172;
    }

    public static String getS173() {
        return s173;
    }

    public static String getS174() {
        return s174;
    }

    public static String getS181() {
        return s181;
    }

    public static String getS182() {
        return s182;
    }

    public static String getS183() {
        return s183;
    }

    public static String getS184() {
        return s184;
    }

    public static String getS191() {
        return s191;
    }

    public static String getS192() {
        return s192;
    }

    public static String getS193() {
        return s193;
    }

    public static String getS194() {
        return s194;
    }

    public static String getS201() {
        return s201;
    }

    public static String getS202() {
        return s202;
    }

    public static String getS203() {
        return s203;
    }

    public static String getS204() {
        return s204;
    }

//    public static void main(String[] args) {
//        String s = "1. Думаю, как бы мне скрыть неудачу от других и не показать виду, что меня это трогает;\n" +
//                "3. А как я буду об этом говорить с отцом или матерью, с близкими?;\n" +
//                "4. Как об этом скажу тому, кто меня любит?;\n" +
//                "5. Интересно, кто же из моих знакомых по этому поводу будет злорадствовать?;\n" +
//                "643. Интересно, кто же из моих знакомых по этому поводу будет злорадствовать?;\n" +
//                "9. Изменят мнение обо мне в плохую сторону;\n";
//
//        int [] test = getNumbersOfQuestions(s);
//
//
//    }
public static void main(String[] args) {
    int a = 3;
    switch (a) {
        case 0: System.out.print ("0");
        case 5: System.out.print ("5");
        case 9: System.out.print ("9");
        case 10: System.out.print ("10"); break;
        default: System.out.print ("!");
    }
}
    public static boolean stringAnalize (String s) {
        if (s.length()<2) {return false;}
        else if (!s.contains("\n")) {return false;}
        else if (!s.contains(".")) {return false;}

        return true;

    }


    public static String remasteringString (String str) {
        String strAr [] = str.split("\n");

        String res = "";

        for (int i=0; i<strAr.length; i++) {
            if (strAr[i].contains("Question")) {

            } else if (strAr[i].length()<=2) {

            } else {
                res+=strAr[i]+"\n";
            }
        }
        System.out.println(res);
        return res;
    }

    public static int[] getNumbersOfQuestions (String s) {


        String [] arrayOfStrings = s.split("\n");
        int[] arrayOfNumbsOfQuestions = new int[arrayOfStrings.length];

        for (int i=0; i<arrayOfStrings.length; i++) {
            int pos = arrayOfStrings[i].indexOf(".");
            String numberOfQuestion = arrayOfStrings[i].substring(0,pos);
            arrayOfNumbsOfQuestions[i]=Integer.parseInt(numberOfQuestion);
        }

        return arrayOfNumbsOfQuestions;

    };

    public static void analize (int [] test) {
        for (int i=0; i<test.length; i++) {
            if(test[i]==1) {s131+="1 "; s151+="1 "; envyDefence13++; flee15++; fearAll++; continue;};
            if(test[i]==2) {s131+="2 "; s151+="2 "; flee15++; envyDefence13++; fearAll++; continue;};
            if(test[i]==3) {s101+="3 "; guiltyDefense10++; fearAll++; continue;};
            if(test[i]==4) {s101+="4 "; fearAll++; guiltyDefense10++; continue;};
            if(test[i]==5) {s101+="5 "; s51+="5 "; fearAll++; guiltyDefense10++; countOfAgression5++; continue;};
            if(test[i]==6) {s131+="6 "; fearAll++; envyDefence13++; continue;};
            if(test[i]==7) {s181+="7 "; fearAll++; sgm18++; sgmFear++; continue;};
            if(test[i]==8) {s101+="8 "; fearAll++; guiltyDefense10++; continue;};
            if(test[i]==9) {s101+="9 "; fearAll++; guiltyDefense10++; continue;};
            if(test[i]==10) {s111+="10 "; s131+="10 "; fearAll++; shameDefence11++; envyDefence13++; continue;};
            if(test[i]==11) {s111+="11 "; fearAll++; shameDefence11++; continue;};
            if(test[i]==12) {s161+="12 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==13) {s161+="13 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==14) {s181+="14 "; fearAll++; sgm18++; sgmFear++; continue;};
            if(test[i]==15) {s161+="15 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==16) {s71+="16 "; fearAll++; racioDevalvationOfObj7++; continue;};
            if(test[i]==17) {s81+="17 "; s121+="17 "; fearAll++; racioByCircumstances8++; continue;};
            if(test[i]==18) {s71+="18 "; s181+="18 "; fearAll++; racioDevalvationOfObj7++; sgm18++; sgmFear++; continue;};
            if(test[i]==19) {s181+="19 "; fearAll++; sgmFear++; sgm18++; continue;};
            if(test[i]==20) {s71+="20 "; fearAll++; racioDevalvationOfObj7++; continue;};
            if(test[i]==21) {s71+="21 "; s121+="21 "; fearAll++; racioDevalvationOfObj7++; fearDefense12++; continue;};
            if(test[i]==22) {s81+="22 "; s121+="22 "; fearAll++; racioByCircumstances8++; fearDefense12++; continue;};
            if(test[i]==23) {s91+="23 "; s81+="23 "; fearAll++; proectiom9++; racioByCircumstances8++; continue;};
            if(test[i]==24) {s71+="24 "; s121+="24 "; fearAll++; racioDevalvationOfObj7++; fearDefense12++; continue;};
            if(test[i]==25) {s51+="25 "; fearAll++; countOfAgression5++; continue;};
            if(test[i]==26) {s71+="26 "; s121+="26 "; s151+="26 "; fearAll++; racioDevalvationOfObj7++; fearDefense12++; flee15++; continue;};
            if(test[i]==27) {s71+="27 "; s151+="27 "; fearAll++; racioDevalvationOfObj7++; flee15++; continue;};
            if(test[i]==28) {s151+="28 "; fearAll++; flee15++; continue;};
            if(test[i]==29) {s151+="29 "; fearAll++; flee15++; continue;};
            if(test[i]==30) {s81+="30 "; s121+="30 "; fearAll++; racioByCircumstances8++; fearDefense12++; continue;};
            if(test[i]==31) {s121+="31 "; s131+="31 "; s161+="31 "; fearAll++; fearDefense12++; envyDefence13++; selfAbasement16++; continue;};
            if(test[i]==32) {s81+="32 "; s121+="32 "; fearAll++; racioByCircumstances8++; fearDefense12++; continue;};
            if(test[i]==33) {s81+="33 "; s121+="33 "; fearAll++; racioByCircumstances8++; fearDefense12++; continue;};
            if(test[i]==34) {s161+="34 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==35) {s191+="35 "; fearAll++; behaviorMismatch19++; continue;};
            if(test[i]==36) {s161+="36 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==37) {s161+="37 "; fearAll++; selfAbasement16++; continue;};
            if(test[i]==38) {s181+="38 "; fearAll++; sgm18++; sgmFear++; continue;};
            if(test[i]==39) {s121+="39 "; fearAll++; fearDefense12++; continue;};
            if(test[i]==40) {s121+="40 "; fearAll++; fearDefense12++; continue;};
            if(test[i]==41) {s121+="41 "; s181+="41 "; fearAll++; fearDefense12++; sgm18++; sgmFear++; continue;};
            if(test[i]==42) {s181+="42 "; fearAll++; sgm18++; sgmFear++; continue;};

            if(test[i]==51) {s182+="51 "; sgm18++; sgmGuilty++; guiltyAll++; continue;};
            if(test[i]==52) {s152+="52 "; guiltyAll++; flee15++; continue;};
            if(test[i]==53) {s62+="53 "; guiltyAll++; getCountOfAgression6++; continue;};
            if(test[i]==54) {s62+="54 "; guiltyAll++; getCountOfAgression6++; continue;}; //сделал бы что угодно, чтобы загладить вину
            if(test[i]==55) {s62+="55 "; guiltyAll++; getCountOfAgression6++; continue;};
            if(test[i]==56) {s62+="56 "; s162+="56 "; guiltyAll++; getCountOfAgression6++; selfAbasement16++; continue;};
            if(test[i]==57) {s62+="57 "; guiltyAll++; getCountOfAgression6++; continue;};
            if(test[i]==58) {s152+="58 "; s122+="58 "; guiltyAll++; flee15++; fearDefense12++; continue;};
            if(test[i]==59) {s102+="59 "; s162+="59 "; guiltyAll++; guiltyDefense10++; selfAbasement16++; continue;};
            if(test[i]==60) {s102+="60 "; s112+="60 "; s152+="60 "; guiltyAll++; guiltyDefense10++; shameDefence11++; flee15++; continue;}; //60. не хочу быть с теми, кто знает об этом случае
            if(test[i]==61) {s102+="61 "; s112+="61 ";  guiltyAll++; guiltyDefense10++; shameDefence11++; continue;}; //моя интерпретация защита от чувства вины и стыда 61. сделаю всё, что угодно, чтобы загладить вину
            if(test[i]==62) {s152+="62 "; guiltyAll++; flee15++; }; //62. не хочу об этом думать
            if(test[i]==63) {s82+="63 "; s92+="63 "; guiltyAll++; racioByCircumstances8++; proectiom9++; continue;}; //63. они сами виноваты
            if(test[i]==64) {s192+="64 "; guiltyAll++; behaviorMismatch19++; continue;}; //64. они от меня хотят больше, чем я могу
            if(test[i]==65) {s182+="65 "; s192+="65 "; sgm18++; sgmGuilty++; guiltyAll++; behaviorMismatch19++; continue;}; //65. что же делать, если они не принимают меня таким, каков я есть
            if(test[i]==66) {s82+="66 "; s102+="66 "; s182+="66 "; guiltyAll++; racioByCircumstances8++; guiltyDefense10++; sgm18++; sgmGuilty++; continue;}; //66. меня таким сделала жизнь, воспитание...
            if(test[i]==67) {s82+="67 "; guiltyAll++; racioByCircumstances8++; continue;}; //67. я – хороший, но обстоятельства...
            if(test[i]==68) {s82+="68 "; s102+="68 "; guiltyAll++; racioByCircumstances8++; guiltyDefense10++; continue;}; //68. любой другой поступил бы в этих обстоятельствах так же
            if(test[i]==69) {s112+="69 "; s182+="69 "; guiltyAll++; shameDefence11++; sgm18++; sgmGuilty++; continue;}; //69. да, я такой! Ну и что же теперь?
            if(test[i]==70) {s82+="70 "; s182+="70 "; guiltyAll++; racioByCircumstances8++; sgm18++; sgmGuilty++; continue;}; //70. они тоже меня обижали и наверняка ещё обидят, что же я переживаю?
            if(test[i]==71) {s52+="71 "; guiltyAll++; countOfAgression5++; continue;}; //71. пусть они переварят это. Бывает хуже
            if(test[i]==72) {s52+="72 "; guiltyAll++; countOfAgression5++; continue;}; //72. так им и надо, я поступил правильно
            if(test[i]==73) {s82+="73 "; s182+="73 "; guiltyAll++; racioByCircumstances8++; sgm18++; sgmGuilty++; continue;}; //73. мир так устроен и не я его придумал
            if(test[i]==74) {s52+="74 "; s182+="74 "; guiltyAll++; countOfAgression5++; sgm18++; sgmGuilty++; continue;}; //74. пусть обижаются, если они не принимают меня и плохим
            if(test[i]==75) {s102+="75 "; s162+="75 "; guiltyAll++; guiltyDefense10++; selfAbasement16++; continue;}; //75. я в это время плох и этим всё сказано
            if(test[i]==76) {s102+="76 "; s162+="76 "; s182+="76 "; s202+="76 "; guiltyAll++; guiltyDefense10++; selfAbasement16++; sgm18++; sgmGuilty++; continue;}; //76. думаю, как попросить прощения
            if(test[i]==77) {s162+="77 "; guiltyAll++; selfAbasement16++; continue;}; //77. нет мне прощения
            if(test[i]==78) {s162+="78 "; guiltyAll++; selfAbasement16++; continue;}; //78. я себя ненавижу
            if(test[i]==79) {s62+="79 "; s162+="79 "; guiltyAll++; getCountOfAgression6++; selfAbasement16++; continue;}; //79. я достоин презрения
            if(test[i]==80) {s182+="80 "; guiltyAll++; sgmGuilty++; sgm18++; continue;}; //80. думать надо было о последствиях, о том как они отнесутся к этому
            if(test[i]==81) {s152+="81 "; guiltyAll++; flee15++; continue;}; //81. хочу быть один и тогда никто не будет на меня обижаться
            if(test[i]==82) {s102+="82 "; s182+="82 "; guiltyAll++; guiltyDefense10++; sgm18++; sgmGuilty++; continue;}; //82. в каком случае они на меня не обиделись бы?
            if(test[i]==83) {s152+="83 "; guiltyAll++; flee15++; continue;}; //83. быстрее бы это кончилось
            if(test[i]==84) {s102+="84 "; s182+="84 "; guiltyAll++; guiltyDefense10++; sgmGuilty++; sgm18++; continue;}; //84. надо что-то сделать, чтобы загладить вину
            if(test[i]==85) {s182+="85 "; guiltyAll++; sgmGuilty++; sgm18++; continue;}; //85. а как мне следовало бы вести себя, чтобы на меня не обижались?
            if(test[i]==86) {s182+="86 "; guiltyAll++; sgmGuilty++; sgm18++; continue;}; //86. я всё равно не смог бы быть таким, чтобы на меня не обижались
            if(test[i]==87) {s182+="87 "; guiltyAll++; sgmGuilty++; sgm18++; continue;}; //87. откуда они взяли, что я должен быть таким, каким они хотят меня видеть?

            if(test[i]==100) {s183+="100 "; shameAll++; sgm18++; sgmShame++; continue;}; //100. хотелось бы стать иным, но ведь не смогу
            if(test[i]==101) {s183+="101 "; s153+="101 "; shameAll++; sgm18++; sgmShame++; flee15++; continue;}; //101. Если бы это повторилось, я поступил бы иначе
            if(test[i]==102) {s153+="102 "; shameAll++; flee15++; continue;}; //102. Если бы это был лишь сон, или мне показалось?
            if(test[i]==103) {s163+="103 "; s63+="103 "; shameAll++; selfAbasement16++; getCountOfAgression6++; continue;}; //103. пусть мне будет плохо за это
            if(test[i]==104) {s153+="104 "; shameAll++; flee15++; continue;}; //104. хотел бы исчезнуть, провалиться
            if(test[i]==105) {s63+="105 "; s163+="105 "; shameAll++; getCountOfAgression6++; selfAbasement16++; continue;}; //105. я сам (сама) в этом виноват
            if(test[i]==106) {s113+="106 "; s153+="106 "; shameAll++; shameDefence11++; flee15++; continue;}; //106. не хочу об этом думать
            if(test[i]==107) {s203+="107 "; shameAll++; appelation20++; continue;}; //107. хочу, чтобы меня пожалели
            if(test[i]==108) {s113+="108 "; s183+="108 "; shameAll++; guiltyDefense10++; sgm18++; sgmShame++; continue;}; //108. но что делать, если так обстоит дело, так получилось
            if(test[i]==109) {s93+="109 "; s113+="109 "; shameAll++; proectiom9++; shameDefence11++; continue;}; //109. все они такие, так поступают, не только я
            if(test[i]==110) {s83+="110 "; shameAll++; racioByCircumstances8++; continue;}; //110. я только козёл отпущения
            if(test[i]==111) {s83+="111 "; s153+="111 "; shameAll++; racioByCircumstances8++; flee15++; continue;}; //111. я здесь ни при чём, всё произошло случайно, обстоятельства…
            if(test[i]==112) {s163+="112 "; s63+="112 "; shameAll++; selfAbasement16++; getCountOfAgression6++;  continue;}; //112. как я дошёл до такой жизни?
            if(test[i]==113) {s53+="113 "; shameAll++; countOfAgression5++; continue;}; //113. я их ненавижу
            if(test[i]==114) {s113+="114 "; shameAll++; shameDefence11++; continue;}; //114. любой другой мог оказаться в таком же положении
            if(test[i]==115) {s83+="115 "; shameAll++; racioByCircumstances8++; continue;}; //115. мне подстроили это
            if(test[i]==116) {s113+="116 "; s153+="116 "; shameAll++; shameDefence11++; flee15++; continue;}; //116. лучше бы я с этим не связывался
            if(test[i]==117) {s113+="117 "; s183+="117 "; shameAll++; shameDefence11++; sgm18++; sgmShame++; continue;}; //117. да, я такой, со мною это бывает и я принимаю себя таким
            if(test[i]==118) {s153+="118 "; shameAll++; flee15++; continue;}; //118. не хочу быть с теми, кто знает об этом случае
            if(test[i]==119) {s53+="119 "; shameAll++; countOfAgression5++; continue;}; //119. я их ненавижу
            if(test[i]==120) {s93+="120 "; shameAll++; proectiom9++; continue;}; //120. они все такие же как и я, но хорошо это скрывают
            if(test[i]==121) {s93+="121 "; shameAll++; proectiom9++; continue;}; //121. окажись они в этой ситуации, наверняка вели бы себя хуже
            if(test[i]==122) {s123+="122 "; s93+="122"; shameAll++; fearDefense12++; continue;}; //122. не один я такой
            if(test[i]==123) {s93+="123 "; shameAll++; proectiom9++; continue;}; //123. все так поступают, но сознательно и успешно скрывают это
            if(test[i]==124) {s183+="124 "; s113+="124 "; shameAll++; sgm18++; sgmShame++; shameDefence11++; continue;}; //124. зато я уважаю себя в чём то другом
            if(test[i]==125) {s53+="125 "; shameAll++; countOfAgression5++; continue;}; //125. я вам это припомню, если вы видели меня в стыде
            if(test[i]==126) {s53+="126 "; s183+="126 "; shameAll++; countOfAgression5++; sgm18++; sgmShame++; continue;}; //126. потом я покажу себе и другим, на что я способен
            if(test[i]==127) {s113+="127 "; shameAll++; shameDefence11++; continue;}; //127. стану лучше, а стыд – мне напоминание
            if(test[i]==128) {s113+="128 "; s183+="128 "; shameAll++; shameDefence11++; sgmShame++; sgm18++; continue;}; //128. а почему я должен быть другим, чем я есть?
            if(test[i]==129) {s183+="129 "; shameAll++; sgm18++; sgmShame++; continue;}; //129. уже завтра перестану об этом думать и начну заново
            if(test[i]==130) {s163+="130 "; s63+="130 "; shameAll++; selfAbasement16++; getCountOfAgression6++; continue;}; //130. так мне и надо, думать надо было
            if(test[i]==131) {s153+="131 "; shameAll++; flee15++; continue;}; //131. эх, начать бы всё сначала!
            if(test[i]==132) {s103+="132 "; shameAll++; guiltyDefense10++; continue;}; //132. есть люди, которые поймут кто прав
            if(test[i]==133) {s103+="133 "; shameAll++; guiltyDefense10++; continue;}; //133. покаюсь перед друзьями обиженного, расскажу почему я это сделал
            if(test[i]==134) {s103+="134 "; s143+="134 "; s203+="134 "; shameAll++;  guiltyDefense10++; resentmentDefense14++; appelation20++; continue;}; //134. ему объяснять, что не следовало бы обижаться
            if(test[i]==135) {s103+="135 "; s143+="135 "; s203+="135 "; shameAll++; guiltyDefense10++; resentmentDefense14++; appelation20++; continue;}; //135. они же неправы, ожидая от меня этого
            if(test[i]==136) {s183+="136 "; shameAll++; sgm18++; sgmShame++; continue;}; //136. а как я должен был бы вести себя, чтобы мне не было стыдно?
            if(test[i]==137) {s183+="137 "; shameAll++; sgm18++; sgmShame++; continue;}; //137. не всегда же быть приличным, умным, честным, хорошим!

            if(test[i]==138) {s144+="138 "; s184+="138 "; resentmentAll++; resentmentDefense14++; sgm18++; sgmResentment++; continue;}; //138. а как ему (ей) следовало бы вести себя, чтобы я не обиделся?
            if(test[i]==139) {s144+="139 "; s184+="139 "; resentmentAll++; resentmentDefense14++; sgm18++; sgmResentment++; continue;}; //139. почему себя он вёл так, а не иначе?
            if(test[i]==140) {s144+="140 "; s194+="140 "; resentmentAll++; resentmentDefense14++; behaviorMismatch19++; continue;}; //140. ему (ей) следовало бы вести себя иначе
            if(test[i]==141) {s144+="141 "; s194+="141 "; resentmentAll++; resentmentDefense14++; behaviorMismatch19++; continue;}; //141. это на него не похоже
            if(test[i]==142) {s194+="142 "; resentmentAll++; behaviorMismatch19++; continue;}; //142. не ожидал, что он будет вести себя так
            if(test[i]==143) {s144+="143 "; s204+="143 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //143. ему (ей) будет стыдно перед его (её) родителями
            if(test[i]==144) {s144+="144 "; s174+="144 "; s204+="144 "; resentmentAll++; resentmentDefense14++; arousingGuilt17++; appelation20++; continue;}; //144. у меня есть кто тебя убедит, что ты неправ(а)
            if(test[i]==145) {s144+="145 "; s204+="145 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //145. знай, но у меня есть кому меня пожалеть
            if(test[i]==146) {s204+="146 "; s104+="146 "; resentmentAll++; appelation20++; guiltyDefense10++; continue;}; //146. все поймут, каковы я и она (он)
            if(test[i]==147) {s144+="147 "; s204+="147 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //147. у меня всё равно есть защита и они меня не обижают
            if(test[i]==148) {s144+="148 "; s204+="148 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //148. если бы кто объяснил ему (ей) как он (она) несправедлив(а) ко мне
            if(test[i]==149) {s144+="149 "; s204+="149 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //149. буду молиться, чтобы бог его (её) вразумил
            if(test[i]==150) {s144+="150 "; s204+="150 "; resentmentAll++; resentmentDefense14++; appelation20++; continue;}; //150. пожалуюсь другу обидчика
            if(test[i]==151) {s64+="151 "; s164+="151 "; resentmentAll++; getCountOfAgression6++; selfAbasement16++; continue;}; //151. я несчастен
            if(test[i]==152) {s64+="152 "; s164+="152 "; resentmentAll++; getCountOfAgression6++; selfAbasement16++; continue;}; //152. никто меня не любит
            if(test[i]==153) {s164+="153 "; resentmentAll++; selfAbasement16++; continue;}; //153. никому я не нужен
            if(test[i]==154) {s54+="154 "; s144+="154 "; resentmentAll++; countOfAgression5++; resentmentDefense14++; continue;}; //154. в следующий раз я с ними поступлю так же как они со мной
            if(test[i]==155) {s54+="155 "; s144+="155 "; resentmentAll++; countOfAgression5++; resentmentDefense14++; continue;}; //155. я им ещё покажу
            if(test[i]==156) {s54+="156 "; resentmentAll++; countOfAgression5++; continue;}; //156. лучше бы его (её) здесь не было вовсе
            if(test[i]==157) {s144+="157 "; s154+="157 "; resentmentAll++; resentmentDefense14++; flee15++; continue;}; //157. я не нуждаюсь в его (её) услугах
            if(test[i]==158) {s64+="158 "; resentmentAll++; getCountOfAgression6++; continue;}; //158. пусть мне будет плохо
            if(test[i]==159) {s174+="159 "; s54+="159"; resentmentAll++; arousingGuilt17++; continue;}; //159. он (она) потом пожалеет, но будет поздно
            if(test[i]==160) {s64+="160 "; s94+="160 "; s144+="160 "; s174+="160 "; resentmentAll++; getCountOfAgression6++; proectiom9++; resentmentDefense14++; arousingGuilt17++; continue;}; //160. не только мне, но и им плохо, пусть
            if(test[i]==161) {s94+="161 "; s144+="161 "; s174+="161 "; resentmentAll++; resentmentDefense14++; arousingGuilt17++; proectiom9++; continue;}; //161. им будет потом стыдно, что они так поступили со мной
            if(test[i]==162) {s54+="162 "; s144+="162 "; s204+="162 "; resentmentAll++; resentmentDefense14++; appelation20++; countOfAgression5++; continue;}; //162. я позабочусь о том, чтобы все знали, как они меня обидели
            if(test[i]==163) {s54+="163 "; s204+="163 "; resentmentAll++; countOfAgression5++; appelation20++; continue;}; //163. я потом пожалуюсь на обидчика ему же
            if(test[i]==164) {s54+="164 "; resentmentAll++; countOfAgression5++; continue;}; //164. при случае я с ними поступлю так же, как и они со мной
            if(test[i]==165) {s154+="165 "; resentmentAll++; flee15++; continue;}; //165. перестану с ними иметь дело
            if(test[i]==166) {s154+="166 "; resentmentAll++; flee15++; continue;}; //166. не буду общаться с ними
            if(test[i]==167) {s174+="167 "; resentmentAll++; arousingGuilt17++; continue;}; //167. они никогда не увидят на моём лице радости
            if(test[i]==168) {s144+="168 "; s134+="168 "; resentmentAll++; resentmentDefense14++; continue;}; //168. я им не дам порадоваться, показав свою обиду
            if(test[i]==169) {s144+="169 "; resentmentAll++; resentmentDefense14++; continue;}; //169. не покажу им, что я обижен, пусть не радуются
            if(test[i]==170) {s154+="170 "; resentmentAll++; flee15++; continue;}; //170. им теперь придётся обходиться без меня
            if(test[i]==171) {s64+="171 "; s174+="171 "; resentmentAll++; getCountOfAgression6++; arousingGuilt17++; continue;}; //171. они будут страдать от чувств вины
            if(test[i]==172) {s64+="172 "; s154+="172 "; resentmentAll++; getCountOfAgression6++; flee15++; continue;}; //172. больше я этого не вынесу
            if(test[i]==173) {s154+="173 "; resentmentAll++; flee15++; continue;}; //173. никогда не буду для них стараться
            if(test[i]==174) {s154+="174 "; s144+="174 "; resentmentAll++;  flee15++; resentmentDefense14++; continue;}; //174. не буду иметь с ними дела
            if(test[i]==175) {s94+="175 "; s194+="175 "; resentmentAll++; proectiom9++; behaviorMismatch19++; continue;}; //175. Боже! Почему они такие?
            if(test[i]==176) {s194+="176 "; resentmentAll++; behaviorMismatch19++; continue;}; //176. они могли бы быть лучше
            if(test[i]==177) {s194+="177 "; resentmentAll++; behaviorMismatch19++; continue;}; //177. почему другие так не поступают со мной?
            if(test[i]==178) {s194+="178 "; resentmentAll++; behaviorMismatch19++; continue;}; //178. мне больно в людях разочаровываться
            if(test[i]==179) {s144+="179 "; s184+="179 "; resentmentAll++; resentmentDefense14++; sgm18++; sgmResentment++; continue;}; //179. я обиделся, а ведь он свободен и вправе поступать, как ему угодно
            if(test[i]==180) {s184+="180 "; resentmentAll++; sgm18++; sgmResentment++; continue;}; //180. я бы не хотел, чтобы он страдал от чувства вины, а свою обиду я переживу.







        }
    }

}
