class reverseno {

 public static void main(String[] args) {
	int no=123;
	int reverse=0;
	int copy=no;
	while(no!=0)
	{
		int rem=no%10;
		reverse=(reverse*10)+rem;
		no=no/10;S
	}
	System.out.println(reverse);
	if(reverse==copy)
	{
		System.out.println("is a palindrome");
	}
}
}
