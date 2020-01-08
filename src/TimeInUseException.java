public class TimeInUseException extends Exception
{
    public TimeInUseException()
    {
        super("Time in use exception");
    }
    public TimeInUseException(String message)
    {
        super(message);
    }

}
