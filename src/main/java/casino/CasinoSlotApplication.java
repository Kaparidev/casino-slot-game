package casino;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import casino.entity.Casino;
import casino.repository.CasinoRepository;

@SpringBootApplication
public class CasinoSlotApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CasinoSlotApplication.class, args);
	}

	@Autowired
	private CasinoRepository casinoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

               
    double AmountWon=0; 
    double totalamt=0;
    double AmountInserted =100;
        
        Random random = new Random();
        int randomNumber1 = random.nextInt(3) + 1; 
         int randomNumber2 = random.nextInt(3) + 1; 
         int randomNumber3 = random.nextInt(3) + 1; 
         
         
         for ( int i = 0; i < 9; i++){
         if(randomNumber1 == randomNumber2 && randomNumber2 == randomNumber3){
              System.out.println("all 3 match");
               AmountWon = AmountInserted * 3; 
              
              
            } else if(randomNumber1 == randomNumber2 || randomNumber2 == randomNumber3 || randomNumber1 == randomNumber3 ){
              System.out.println("2 match");
               AmountWon = AmountInserted * 2;
              
            } else {
				AmountWon = 0.0;
				System.out.println("NONE MATCHED!");
			}
            
            
            System.out.println("The Amount won is : " + AmountWon);
            AmountWon++;

          }
         totalamt=AmountWon;		
		
		
		  Casino balance = new Casino(AmountInserted, totalamt,"defaultUser");
		  casinoRepository.save(balance);
		 
		  
		  		
	}

}
