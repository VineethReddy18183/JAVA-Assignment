import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Assignment2 {
    public static void main(String args[]) {
        
        String dateString = "30/01/2024 12:43";

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        
        LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);

        
        System.out.println("LocalDateTime is " + localDateTime);
        LocalDateTime newLocalDateTime = localDateTime.plusDays(1);

        
        System.out.println("New LocalDateTime after adding one day: " + newLocalDateTime);
        
        newLocalDateTime = localDateTime.minusDays(10);
        System.out.println("After subtracting 10 days: " + newLocalDateTime);
        
        newLocalDateTime = newLocalDateTime.plusHours(1);
        System.out.println("After adding 1 hour: " + newLocalDateTime);
        
        newLocalDateTime = newLocalDateTime.minusHours(5).minusMinutes(30);
        System.out.println("After subtracting 5 hours and 30 minutes: " + newLocalDateTime);
    }
}