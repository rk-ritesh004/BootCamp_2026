 void removeprefix(String prefix){
        node temp=head;
        while(temp!=null){
            String str = Integer.toString(temp.data);
            if(str.startsWith(prefix)){
                head = temp.next;
                temp = head;
            }else{
                temp=temp.next;
            }
        }