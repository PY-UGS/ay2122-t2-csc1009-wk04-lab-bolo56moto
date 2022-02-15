import java.util.Scanner;
 class StackOfIntegersInput{
    public static void main(String[] args){
        int choice =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Stack: ");
        int size = sc.nextInt();
        StackOfIntegers stack = new StackOfIntegers(size);
        for(int i =0;i<size;i++){
            System.out.println("Stack position no. "+ (i+1));
            int number = sc.nextInt();
            stack.push(number);
        }
        while (stack.empty() !=true){
        System.out.println("Choose option 1:Peek 2:Pop");
        choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Number at the top of the stack : "+stack.peek());
        }
        else if(choice ==2){
            System.out.print("Input in reverse order : ");
            while (stack.empty() !=true){
                System.out.print(stack.pop()+ " ");
                }
        }
        
        
    }
        sc.close();
        
    }
}