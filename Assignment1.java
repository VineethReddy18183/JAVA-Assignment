import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Assignment1 {
    public static void main(String args[]) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Step 1: Current LocalDateTime: " + localDateTime);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Step 2: Formatted LocalDateTime: " + formattedDateTime);

        
        ZonedDateTime istDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        String formattedISTDateTime = istDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
        System.out.println("Step 3: Formatted IST DateTime: " + formattedISTDateTime);

        
        long unixTimestamp = istDateTime.toEpochSecond();
        System.out.println("Step 4: Unix Timestamp: " + unixTimestamp);

        
        ZonedDateTime utcDateTime = istDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        String formattedUTCDateTime = utcDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        System.out.println("Step 5: Formatted UTC DateTime: " + formattedUTCDateTime);

        
        LocalDateTime localTimestamp = utcDateTime.toLocalDateTime();
        System.out.println("Step 6: Local Timestamp: " + localTimestamp);
    }
}
