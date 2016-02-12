/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfield;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 *
 * @author pawel
 */
public class PomocniczeFunkcje {
    
  public static void wpiszDaneDoSieci(Byte[] dane,Siec siec)
  {
    
      for(int i=0;i<dane.length;i++)
          siec.neurony[i].wyjscie=dane[i];
  
     
  }

 public static Byte[] pobierzDaneZWyjscSieci(Siec siec, int szerokosc, int wysokosc)
 {
     int rozmiar=(szerokosc*wysokosc)*8;
     
     Byte[] dane = new Byte[rozmiar]; 
     
         for(int i=0;i<rozmiar;i++)
            dane[i]=siec.neurony[i].wyjscie;
  
        return dane;
 }
 
    
 
    public static Byte[] zmienObrazNaDane(BufferedImage _obraz) throws IOException
    {
        
    
     String dane=null;   
     StringBuilder sb = new StringBuilder();
     int piksel=0;
     int r,g,b,grayscale;
     Byte[] wynik= new Byte[(_obraz.getWidth()*_obraz.getHeight())*8];
    
     for(int i = 0;i<_obraz.getWidth();i++)
     {
          for(int j = 0;j<_obraz.getHeight();j++)
          {
              piksel= _obraz.getRGB(i, j);
              
               Color c = new Color(piksel);
               r=c.getRed();
               g=c.getGreen();
               b=c.getBlue();
               
               grayscale=(r+g+b)/3;
               sb.append(String.format("%8s", Integer.toBinaryString(grayscale)).replace(' ', '0'));
               
               }
           
    }
       dane= sb.toString();
       
     for(int k=0;k<dane.length();k++)
     {    
         if(dane.charAt(k)=='0') 
                 wynik[k]=-1;
                    else 
                    wynik[k]=1;
      } 
        
       return wynik; 
     
    }
          
    
    
   public static BufferedImage zmienDaneNaObraz(Byte[] _dane,int szerokosc, int wysokosc) throws IOException
   {
       int kolor=0;
       int[] tablica = new int[szerokosc*wysokosc];
       StringBuilder sb = new StringBuilder();
       BufferedImage obraz= new BufferedImage(szerokosc,wysokosc,BufferedImage.TYPE_INT_RGB);
        
        for(int i=0; i<_dane.length;i++)
              if(_dane[i]==-1) _dane[i]=0;
        
              
       int bity=0;
       int licznikBajtow=0;
       
       for (int i=0; i<_dane.length;i++)
       {
         sb.append(_dane[i]);
            bity++;
            
          if(bity==8) 
          {
              
            tablica[licznikBajtow++]=Integer.parseInt(sb.toString(), 2);
            sb.setLength(0);
            bity=0;
            
          }
       }
        
      
       for(int i=0; i<szerokosc;i++)
       { 
           for(int j=0; j<wysokosc;j++)
           {
          
             kolor= new Color(tablica[((i*wysokosc)+j)],tablica[((i*wysokosc)+j)],tablica[((i*wysokosc)+j)]).getRGB();
             obraz.setRGB(i,j,kolor);
          
           }
       
       }
       
                        
     return  obraz;
   }  
                
    
}
