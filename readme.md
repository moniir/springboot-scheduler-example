        FixedDelay parameter in @Scheduled annotation adds a delay between two executions of task/method. It forces tasks to execute in sequence.
        This way, method execution starts after the previous execution is completed, and fixedDelay time passed. The number you define for fixedDelay represents time in milliseconds.
        
        @Scheduled(fixedDelay = 3000)
            public void sendMessage(){
                System.out.println("Hey, I am scheduled with fixed delay method");
            }
            
            
        @Scheduled annotation also has a parameter called fixedRate. It should be used in situations where method invocations are independent.
        If method execution should be able to overlap - execute in parallel in some moment of time, you should add @Async annotation to your service execution.
        Without @Async, the method will always execute after the previous execution is completed, even if fixedRate expired.
            
             @Scheduled(fixedRate = 4000)
             public void sendMessageWithFixedRate(){
                 System.out.println("Hey, I am scheduled with fixed rate method");
             }
             
        Cron expression has six places and they represent:
        second, minute, hour, day of month, month, day(s) of week.
        You can set timezone to be sure that the server zone will not influence your method execution. You can find a complete list of timezones on this link.
        @Scheduled(cron="* * * * * *", zone="Asia/Tokyo")
        
            @Scheduled(cron = "*/3 * * * * *")
            public void sendMessagesCron(){
                System.out.println(LocalTime.now() + "Hey, I am scheduled from cron method");
            }                