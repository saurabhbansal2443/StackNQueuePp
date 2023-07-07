public class DynamicQueue {
    public static void main(String[] args) {
        myQueue q= new myQueue(3);

        q.add(1);
         q.add(2);
          q.add(3);
           q.add(4);

           q.display();

           q.remove();
            q.display();

             q.remove();
            q.display();

             q.remove();
            q.display();

             q.remove();
            q.display();
    }
}

class myQueue{
    int[] arr ;
    int size;

    myQueue(int n){
        this.arr=new int[n];
        this.size = 0;
    }

    myQueue(){
        this.arr=new int[10];
        this.size = 0;
    }

    public void add(int ele){
        if(this.size==this.arr.length){
            int[] narr = new int[arr.length*2];

            for(int i=0;i<arr.length;i++){
                narr[i]=arr[i];
            }

            arr=narr;
              arr[this.size]=ele;
            this.size++;
            
        }else{
            arr[this.size]=ele;
            this.size++;
        }
    }

    public int remove(){
        if(this.size==0){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int ele = arr[0];
      
            for(int i=1;i<this.size;i++){
                arr[i-1]=arr[i];
            }
            this.size--;
            return ele;
        }
    }

    public int peek(){
         if(this.size==0){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int ele = arr[0];
            return ele;
        }
    }

    public void display(){
        for(int i=0;i<this.size;i++){
            System.out.print(arr[i]+ "   ");
        }
        System.out.println();
    }

    
}
