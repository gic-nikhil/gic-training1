 public class ExecutorServiceExample {
	 
	  public static void main(String[] args) {  
	        ExecutorService executorService = Executors.newSingleThreadExecutor();  
	        executorService.execute(new Runnable() {  
	              
	            @Override  
	            public void run() {  
	                System.out.println("ExecutorService");  
	                  
	            }  
	        });  
	        executorService.shutdown();  
	    }  
	} 


