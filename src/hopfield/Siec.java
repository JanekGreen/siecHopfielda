package hopfield;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.SwingWorker;


public class Siec{

	
    Neuron[] neurony; // neurony w sieci
    ArrayList<ArrayList<Byte>> wzorce;
    byte[] wyjscia;
    javax.swing.JProgressBar postep;
   private boolean daneWpisane=false;
   int iloscIteracji=0;
   int IloscZmianWIteracji=0;
   boolean koniecNauki=false;
   boolean koniecOdtwarzania=false;
   
   public static byte signum(float liczba)
   {
	  if(liczba!=0) 
	  {
		  if(liczba<0)
			  return -1;
		  else
			  return 1;
	  } else
		  return 0;
	   
	   
   }
    
	Siec(int rozmiar,javax.swing.JProgressBar p)
	{
                postep= p;
		neurony = new Neuron[rozmiar];
		for(int i=0; i<rozmiar; i++)
		    neurony[i] = new Neuron(rozmiar);
		
		 wzorce = new ArrayList<>();
		 wyjscia = new byte[rozmiar]; 
	}
	
	
	
	public void dodajWzorzec(Byte[] wzorzec)
	{
		 wzorce.add(new ArrayList<>(Arrays.asList(wzorzec)));
		
	}
        public void zapomnijWzorce()
        {
            wzorce.clear();
            iloscIteracji=0;
        
        }
	public void uczSie()
	{
                postep.setValue(0);
		float waga;
		for(int i=0; i<neurony.length;i++)
		{
			
			for(int j=0; j<neurony.length;j++)
			{
                              waga=0;  
                              
				for(int k=0; k< wzorce.size();k++)
                                    waga+=wzorce.get(k).get(i)*wzorce.get(k).get(j);
                              waga/=neurony.length;
                              if(i!=j)
                                 neurony[i].wagi[j]=waga;
                                else
                                neurony[i].wagi[j]=0;
			}
                        
                        if(i% 100 ==0)
                            postep.setValue(i);
		}         
		
	}
	public void wykonajPrzebieg()
	{
		int zmiany=0;
		float suma;
		 byte sgn;
		 
		for(int i=0; i<neurony.length;i++)
			wyjscia[i]= neurony[i].wyjscie;
		
		
		for(int i=0; i<neurony.length;i++)
		{
			suma=0;
			for(int j=0; j<neurony.length;j++)
			{
				if(i!=j)
				suma+=neurony[i].wagi[j]*wyjscia[j];
                        }
                                
				
                            sgn=signum(suma);
                                if(sgn!=0)
                                 {	
                                    
                                     if(sgn!=neurony[i].wyjscie)
                                        zmiany++;
                                     
                                    neurony[i].wyjscie=sgn;	
                                    
                                }
			
                }
                iloscIteracji++;
		IloscZmianWIteracji=zmiany;	
}
	
	public int odtworzWzorzec()
	{
		
                iloscIteracji=0;
		
		do{
                        wykonajPrzebieg();
			
                         
			 
		 } while(IloscZmianWIteracji>0);
		
		
			 
		return 0;  
	}

	public void ustawWzorzecTestowy(Byte[] wzorzec)
	{
		for(int i=0; i<neurony.length;i++)
			 neurony[i].wyjscie=wzorzec[i];	
	}
	public void pracaKrokowaRozpoczeta(){
        
            daneWpisane =true;
        
        }
        public boolean czyTrwaPracaKrokowa()
        {
            return daneWpisane;
        
        }
        public void koniecPracyKrokowej(){
        
            daneWpisane=false;
            iloscIteracji=0;
        }
        
        public class Uczenie extends SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() throws Exception {
           uczSie();
           return null;
        }
       
        
 
        }
        
           public class Odtwarzanie extends SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() throws Exception {
           odtworzWzorzec();
           return null;
        }
      
        
        
        }


	

}
