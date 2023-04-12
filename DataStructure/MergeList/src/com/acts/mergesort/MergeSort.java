package com.acts.mergesort;

public class MergeSort {

	 public Node mergeTwoLists(Node list1, Node list2) {
	        Node current1=list1;
	        Node current2=list2;
	        Node previous=null;
	        Node temp= null;
	        boolean flag=false;
	        while(current2!=null){
	            temp=current2;
	            while(current1!=null){
	                previous=current1;
	                if(current1.val>=temp.val){
	                    if(current1==list1){
	                        list2=current2.next;
	                        current2.next=list1;
	                        list1=current2;
	                        current1=current2.next.next;
	                        break;
	                    }else{
	                        list2=current2.next.next;
	                        current2.next=current1;
	                        previous.next=current2;
	                        current1=current2.next;
	                        break;
	                    }        
	                }
	                else if(current1.val<temp.val){
	                    current1.next=current2;
	                    flag=true;
	                    break;     
	                }
	                current1=current1.next;
	            }
	            if(flag==true){
	                break;
	            }
	            current2=list2;
	        }
	        return list1;
	    }
}
