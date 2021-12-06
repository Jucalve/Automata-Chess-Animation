/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Ajedrez extends JPanel{

    static int z1;
    public int x1=100, x2, y1=100, y2, r=40, x3, y3, x4, y4;
    public static int w, h, ga, t=50;
    ImageIcon fi1=new ImageIcon(getClass().getResource("/ajedrez/rey.png"));
    ImageIcon fi2=new ImageIcon(getClass().getResource("/ajedrez/reina.png"));
    //public static int i=0;
    public static boolean fin=true, ag=true;
    public static char[] arr;
    public static char[] ar2;
    
    public static int [][] ruta(int [][]arr, char []aq, int x, int w){
        int zaux, zinf;
        for(int i=1; i<x; i++){
            zaux=z1;
            switch(aq[i]){
                case 'r':
                    for(int j=0; j<=z1; j++){
                        zinf=zaux;
                        //arr[w][]
                        switch(arr[w][j]){
                        //*********casos z no crece************
                            case 1:
                                arr[w+1][j]=5;
                            break;
                            case 3:
                                arr[w+1][j]=5;
                            break;
                            case 7:
                                arr[w+1][j]=5;
                            break;
                            case 9:
                                arr[w+1][j]=5;
                            break;
                        //*********casos z no crece************
                            case 5:
                                zaux=zaux+3;
                                arr[w+1][j]=1;
                                arr[w+1][zinf+1]=3;
                                arr[w+1][zinf+2]=7;
                                arr[w+1][zinf+3]=9;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                    arr[p][zinf+3]=arr[p][j];
                                }
                            break;
                            case 2:
                                zaux=zaux+2;
                                arr[w+1][j]=1;
                                arr[w+1][zinf+1]=3;
                                arr[w+1][zinf+2]=5;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                }
                            break;
                            case 4:
                                zaux=zaux+2;
                                arr[w+1][j]=1;
                                arr[w+1][zinf+1]=5;
                                arr[w+1][zinf+2]=7;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                }
                            break;
                            case 6:
                                zaux=zaux+2;
                                arr[w+1][j]=3;
                                arr[w+1][zinf+1]=5;
                                arr[w+1][zinf+2]=9;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                }
                            break;
                            case 8:
                                zaux=zaux+2;
                                arr[w+1][j]=5;
                                arr[w+1][zinf+1]=7;
                                arr[w+1][zinf+2]=9;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                }
                            break;
                        }
                    }
                break;
                case 'b':
                    for(int j=0; j<=z1; j++){
                        zinf=zaux;
                        //arr[w][]
                        switch(arr[w][j]){
                            case 1:
                                zaux=zaux+1;
                                arr[w+1][j]=2;
                                arr[w+1][zinf+1]=4;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 2:
                                zaux=zaux+1;
                                arr[w+1][j]=4;
                                arr[w+1][zinf+1]=6;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 3:
                                zaux=zaux+1;
                                arr[w+1][j]=2;
                                arr[w+1][zinf+1]=6;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 4:
                                zaux=zaux+1;
                                arr[w+1][j]=2;
                                arr[w+1][zinf+1]=8;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 5:
                                zaux=zaux+3;
                                arr[w+1][j]=2;
                                arr[w+1][zinf+1]=4;
                                arr[w+1][zinf+2]=6;
                                arr[w+1][zinf+3]=8;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                    arr[p][zinf+2]=arr[p][j];
                                    arr[p][zinf+3]=arr[p][j];
                                }
                            break;
                            case 6:
                                zaux=zaux+1;
                                arr[w+1][j]=2;
                                arr[w+1][zinf+1]=8;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 7:
                                zaux=zaux+1;
                                arr[w+1][j]=4;
                                arr[w+1][zinf+1]=8;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 8:
                                zaux=zaux+1;
                                arr[w+1][j]=4;
                                arr[w+1][zinf+1]=6;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                            case 9:
                                zaux=zaux+1;
                                arr[w+1][j]=6;
                                arr[w+1][zinf+1]=8;
                                for(int p=w; p>=0; p--){
                                    arr[p][zinf+1]=arr[p][j];
                                }
                            break;
                        }
                    }
                break;
            }
            w++;
            z1=zaux;
        }
        return arr;
    }
    
    public static int tam(int y, char[] aq){
        if(aq[0]=='r') y=1;
        if(aq[0]=='b') y=2;
        if(aq.length<3) y=4;
        for(int i=1; i<aq.length; i++){
            if(aq[i]=='r'){
                //if(aq[i-1]=='r') y=y;
                //else             y=y*3;
                y=y*3;
            }
            if(aq[i]=='b'){
                if(aq[i-1]=='b') y=y*2;
                else             y=y*4;
            }
        }
        return y;
    }
    
    public static int tam2(int y, char[] aq){
        if(aq[0]=='r') y=3;
        if(aq[0]=='b') y=2;
        if(aq.length<3) y=4;
        for(int i=1; i<aq.length; i++){
            if(aq[i]=='r'){
                //if(aq[i-1]=='r') y=y;
                //else             y=y*3;
                y=y*3;
            }
            if(aq[i]=='b'){
                if(aq[i-1]=='b') y=y*2;
                else             y=y*4;
            }
        }
        return y;
    }
    
    public static int getx(char c){
        int x;
        switch(c){
            case '1':
                x=h/6;
            break;
            case '2':
                x=3*h/6;
            break;
            case '3':
                x=5*h/6;
            break;
            case '4':
                x=h/6;
            break;
            case '5':
                x=3*h/6;
            break;
            case '6':
                x=5*h/6;
            break;
            case '7':
                x=h/6;
            break;
            case '8':
                x=3*h/6;
            break;
            case '9':
                x=5*h/6;
            break;
            default:
                    x=0;
        }
        return x;
    }
    
    public static int gety(char c){
        int x;
        switch(c){
            case '1':
                x=h/6;
            break;
            case '4':
                x=3*h/6;
            break;
            case '7':
                x=5*h/6;
            break;
            case '2':
                x=h/6;
            break;
            case '5':
                x=3*h/6;
            break;
            case '8':
                x=5*h/6;
            break;
            case '3':
                x=h/6;
            break;
            case '6':
                x=3*h/6;
            break;
            case '9':
                x=5*h/6;
            break;
            default:
                    x=0;
        }
        return x;
    }
    
    
    
    public static void main(String[] args){
        int x=0, x2, x3;
        int y=0, w=1, z=0, zaux, zinf, gani=0, y2, y3, z2, z3, gani2=0, gani3=0;
        String ap1=JOptionPane.showInputDialog(null, "Ingrese la ruta para la primer ficha");
        String ap2=JOptionPane.showInputDialog(null, "Ingrese la ruta para la segunda ficha");
        //String ap3=JOptionPane.showInputDialog(null, "bruh3");
        //System.out.println(ap1);
        x=ap1.length();
        x2=ap2.length();
        //x3=ap3.length();
        char [] aq=new char[x];
        char [] a2=new char[x2];
        //char [] a3=new char[x3];
        //************************el tamaño********************
        aq=ap1.toCharArray();
        a2=ap2.toCharArray();
        //a3=ap3.toCharArray();
        
        y=tam(y, aq);
        y2=tam2(y, a2);
        //y3=tam(y, a3);
        //System.out.println(y);
        //************************el tamaño********************
        
        int[][] arr=new int[x+1][y];
        int[][] ar2=new int[x2+1][y2];
        //int[][] ar3=new int[x3+1][y3];
        //for(int i=0; i<y; i++) 
            arr[0][0]=1;
        if(aq[0]=='r'){ 
            arr[1][0]=5;
            z1=0;
        }
        if(aq[0]=='b'){
                          arr[0][1]=1;
            arr[1][0]=2;  arr[1][1]=4;
            z1=1;
        }
        
        arr=ruta(arr, aq, x, w);
        z=z1;
        //aqui esta wea
            
        
        
        
        if(a2[0]=='r'){
            ar2[0][0]=2;  ar2[0][1]=2;  ar2[0][2]=2;
            ar2[1][0]=1;  ar2[1][1]=3;  ar2[1][2]=5;
            z1=2;
        }
        if(a2[0]=='b'){
            ar2[0][0]=2;  ar2[0][1]=2;
            ar2[1][0]=4;  ar2[1][1]=6;
            z1=1;
        }
            
        ar2=ruta(ar2, a2, x2, w);
        z2=z1;
        //aqui esta wea
            
        
        
        /*    ar3[0][0]=3;
        if(a3[0]=='r'){ 
            ar3[1][0]=5;
            z1=0;
        }
        if(a3[0]=='b'){
                          ar3[0][1]=3;
            ar3[1][0]=2;  ar3[1][1]=6;
            z1=1;
        }
        
        ar3=ruta(ar3, a3, x3, w);
        z3=z1;*/
        //aqui esta wea
        
        //char[] gan=new char[x+1];
        //System.out.println(z+1);
        System.out.println(" "+ap1);
        boolean bruh=true;
        for(int i=0; i<=z; i++){
            bruh=true;
            for(int l=0; l<x; l++) if(arr[l][i]==9) bruh=false;
            if(arr[x][i]==9 && bruh) {
                gani++;
            }
        }
        if(gani==0){
            JOptionPane.showMessageDialog(null, "La cadena ingresada para la primer ficha no consiguio llegar al final por ninguno de los medios :c\nintente con otra cadena");
            System.exit(0);
        }
        char[][] ganm=new char[gani][x+1];
        gani=0;
        for(int i=0; i<=z; i++){
            bruh=true;
            for(int l=0; l<x; l++) if(arr[l][i]==9) bruh=false;
            if(arr[x][i]==9 && bruh) {
                for(int j=0; j<x+1; j++){
                    ganm[gani][j] =(char)(arr[j][i] + 48);
                }
                gani++;
            }
        }
        for(int i=0; i<gani; i++){
            for(int j=0; j<x+1; j++){
                System.out.print(""+ganm[i][j]);
            }
            System.out.println("");
        }/**/
        System.out.println("");
        System.out.println(" "+ap2);
        //char[] gan2=new char[x2+1];
        for(int i=0; i<=z2; i++){
            bruh=true;
            for(int l=0; l<x2; l++) if(ar2[l][i]==8) bruh=false;
            if(ar2[x2][i]==8 && bruh) {
                gani2++;
            }
        }
        if(gani2==0){
            JOptionPane.showMessageDialog(null, "La cadena ingresada para la segunda ficha no consiguio llegar al final por ninguno de los medios :c\nintente con otra cadena");
            System.exit(0);
        }
        char[][] gan2m=new char[gani2][x2+1];
        gani2=0;
        for(int i=0; i<=z2; i++){
            bruh=true;
            for(int l=0; l<x2; l++) if(ar2[l][i]==8) bruh=false;
            if(ar2[x2][i]==8 && bruh) {
                for(int j=0; j<x2+1; j++){
                    gan2m[gani2][j]=(char)(ar2[j][i] + 48);
                }
                gani2++;
            }
        }
        for(int i=0; i<gani2; i++){
            for(int j=0; j<x2+1; j++){
                System.out.print(""+gan2m[i][j]);
            }
            System.out.println("");
        }/**/
        System.out.println("");
        /*System.out.println(" "+ap3);
        //char[] gan3=new char[x2+1];
        for(int i=0; i<=z3; i++){
            if(ar3[x3][i]==7) {
                gani3++;
            }
        }
        char[][] gan3m=new char[gani3][x3+1];
        gani3=0;
        for(int i=0; i<=z3; i++){
            if(ar3[x3][i]==7) {
                for(int j=0; j<x3+1; j++){
                    gan3m[gani3][j]=(char)(ar3[j][i] + 48);
                }
                gani3++;
            }
        }
        for(int i=0; i<gani3; i++){
            for(int j=0; j<x3+1; j++){
                System.out.print(""+gan3m[i][j]);
            }
            System.out.println("");
        }/**/
        /*System.out.println("");
        System.out.println("lengR: "+(z+1)+", "+(z2+1)+", "+(z3+1));
        System.out.println("LengF: "+y+", "+y2+","+y3);
        System.out.println("LengS: "+x+", "+x2+","+x3);
        System.out.println("Total: "+gani+", "+gani2+","+gani3);
        
        /*for(int i=0; i<x+1; i++){
            for (int j=0; j<y; j++){
                System.out.print("|"+ar2[i][j]+"|");
            }
            System.out.println("");
        }*y/
        System.out.println("");
        for(int i=0; i<x2+1; i++){
            for (int j=0; j<=z2; j++){
                System.out.print("|"+ar2[i][j]+"|");
            }
            System.out.println("");
        }/**/
        //***ganm gan2m gan3m***//
        int i=1,j=1, y4=0; x3=0; y3=-1;
        boolean qp;
        if(x2<x){
            z3=x2+1;
        }
        else if(x2>x){
            z3=x+1;
        }
        else z3=x+1;
        //**********************************************************borrar aqui********************************************//
        //JOptionPane.showMessageDialog(null, "hurb");
        for(int we=0; we<3; we++){
            ag=true;
        //**********************************************************borrar aqui********************************************//
        //System.out.println(y3);
        do{
            if(y3<gani-1)y3++;
            else{
                y3=0;
                if(y4<gani2-1) y4++;
                else{
                    JOptionPane.showMessageDialog(null, "Imposible encontrar mas rutas donde no se solapen las fichas, intente con otra cadena ;)");
                    System.exit(0);
                }
            }
            qp=false;
            x3=0;
            while(x3 != z3-1){
                
                if(ganm[y3][x3]==gan2m[y4][x3]) qp=true;
                if(ganm[y3][x3+1]==gan2m[y4][x3]) qp=true;
                if(ganm[y3][x3]==gan2m[y4][x3+1]) qp=true;
                if(ganm[y3][x3+1]==gan2m[y4][x3+1]) qp=true;
                //System.out.println(ganm[y3][x3]+" | "+gan2m[y4][x3]);
                x3++;
            }
            if(x2<x){
                if(ganm[y3][x3+1]==gan2m[y4][x3]) qp=true;
            }
            else if(x2>x){
                if(ganm[y3][x3]==gan2m[y4][x3+1]) qp=true;
            }  
            
            //System.out.println("");
        }while(qp);
        i=1; j=1;
        //System.out.println(y3);
        
        JFrame v = new JFrame();
        Ajedrez panel = new Ajedrez();
        v.getContentPane().add(panel);
        v.pack();
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setVisible(true);
        panel.w=panel.getWidth();
        panel.h=panel.getHeight();
        panel.arr=ganm[y3];
        panel.ar2=gan2m[y4];
        y3++;
        if(aq[0]=='b') y4+=2;
        else y4++;
        //System.out.println(y3);
        System.out.print("Rey  : ");
        for(int q=0; q<x+1; q++) System.out.print(panel.arr[q]);
        System.out.println("");
        System.out.print("Reina: ");
        for(int q=0; q<x2+1; q++) System.out.print(panel.ar2[q]);
        System.out.println("");
        System.out.println("");
        //System.out.println(""+panel.arr+"|"+panel.ar2);*/
        if(panel.arr[0]=='1'){
            panel.x1=panel.w/6;
            panel.y1=panel.h/6;
        }
        if(panel.ar2[0]=='2'){
            panel.x3=panel.w/2;
            panel.y3=panel.h/6;
        }
        if(panel.arr[0]=='3'){
            panel.x1=5*panel.w/6;
            panel.y1=  panel.h/6;
        }
        panel.repaint();
        while(i!=panel.arr.length+1 || j!=panel.ar2.length+1){
            if(fin){try{
                Thread.sleep(1500);
            }catch (InterruptedException e){ e.printStackTrace();}}
            
            fin=false;
            if(i<panel.arr.length){
            panel.x2=getx(panel.arr[i]);
            panel.y2=gety(panel.arr[i]);
            i++;}
            else{
                if(ag){ga=1; ag=false; JOptionPane.showMessageDialog(null, "Gano el REY");}
                i=panel.arr.length+1;
            }
            
            if(j<panel.ar2.length){ 
            panel.x4=getx(panel.ar2[j]);
            panel.y4=gety(panel.ar2[j]);
            j++;}
            else{
                if(ag){ga=2; ag=false; JOptionPane.showMessageDialog(null, "Gano la REINA");}
                j=panel.ar2.length+1;
            }
            
            /*System.out.println("Empieza");
            System.out.println("|"+panel.x1+"|"+panel.x2+"|"+panel.y1+"|"+panel.y2);
            System.out.println("|"+panel.x3+"|"+panel.x4+"|"+panel.y3+"|"+panel.y4);/**/
            while(panel.x2 != panel.x1 || panel.y1 != panel.y2 ){
                    if(panel.x1!=panel.x2){
                        if(panel.x1>panel.x2) panel.x1--;
                        if(panel.x1<panel.x2) panel.x1++;
                    }
                    if(panel.y1!=panel.y2){
                        if(panel.y1>panel.y2) panel.y1--;
                        if(panel.y1<panel.y2) panel.y1++;
                    }
                    panel.repaint();
                    
                    
                    try
                    {
                        Thread.sleep(t);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            while(panel.x3 != panel.x4 || panel.y3 != panel.y4){
                    if(panel.x3!=panel.x4){
                        if(panel.x3>panel.x4) panel.x3--;
                        if(panel.x3<panel.x4) panel.x3++;
                    }
                    if(panel.y3!=panel.y4){
                        if(panel.y3>panel.y4) panel.y3--;
                        if(panel.y3<panel.y4) panel.y3++;
                    }
                    panel.repaint();
                    
                    
                    try
                    {
                        Thread.sleep(t);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
        }
        JOptionPane.showMessageDialog(null, "Se acabo! :D");
        //System.exit(0);
        //**********************************************************borrar aqui********************************************//
        }
        //**********************************************************borrar aqui********************************************//
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        //**************************cuadricula****************************
        g.setColor(Color.red);
        g.fillRect(0, 0, w/3, h/3);             g.fillRect(2*w/3, 0, w/3, h/3);
                    g.fillRect(w/3, h/3, w/3, h/3);
        g.fillRect(0, 2*h/3, w/3, h/3);             g.fillRect(2*w/3, 2*h/3, w/3, h/3);
        g.setColor(Color.black);
                    g.fillRect(w/3, 0, w/3, h/3);
        g.fillRect(0, h/3, w/3, h/3);             g.fillRect(2*w/3, h/3, w/3, h/3);
                    g.fillRect(w/3, 2*h/3, w/3, h/3);
        g.setColor(Color.white);
        //************************numeros*************************************
        g.drawString("1", w/6-2, h/6+4);      g.drawString("2", 3*w/6-2, h/6+4);    g.drawString("3", 5*w/6-2, h/6+4);
        g.drawString("4", w/6-2, 3*h/6+4);    g.drawString("5", 3*w/6-2, 3*h/6+4);  g.drawString("6", 5*w/6-2, 3*h/6+4);
        g.drawString("7", w/6-2, 5*h/6+4);    g.drawString("8", 3*w/6-2, 5*h/6+4);  g.drawString("9", 5*w/6-2, 5*h/6+4);
        g.setColor(Color.gray);
        
        g.drawImage(fi1.getImage(), x1-r/2, y1-r/2, this);
        //g.fillOval(x1-r/2, y1-r/2, r, r);
        g.setColor(Color.blue);
        g.drawImage(fi2.getImage(), x3-r/2, y3-r/2, this);
        //g.fillOval(x3-r/2, y3-r/2, r, r);
        //g.drawLine(x1, y1, x2+10, y2+10);
    }
    
    public Dimension getPreferredSize()
    {
        return new Dimension(300, 300);
    }
    
}
