
public class TwoIntegers 
{
	private int num;
	private int value;

	public TwoIntegers ()
	{
		num = 1 ; 
		value = 2 ;
	}

	public TwoIntegers (int num, int value) 
	{
		this.num = num;
		this.value = value ;
	}
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value = value;
	}
	public String arithmetic()
	{
		int add = num + value;
		int quo = num % value;
		double div = (double) num / value;
		int mult = num * value;

		return num + " + " + value + " = " + add + " , " + num + " * " + value + " = " + mult + " , " +  num + " / " + value + " = " + div + " , " + num + " % " + value + " = " + quo + " . ";


	}
	public int larger()
	{
		if (num > value)
		{
			return num;
		}
		else if (num < value)
		{
			return value;
		}
		else 
		{
			return num;
		}	
	}
	public boolean isEven()
	{
		int sum = num + value;
		if (sum % 2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public boolean multiple()
	{
		if(value % num == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}



}
