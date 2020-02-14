package edu.escuelaing.arep.calculator;

import java.util.ArrayList;
import java.util.List;

public class RecursiveMergeSort <T extends Comparable <? super T>> {

	
	//call mergesort on param list
	public List<T> mergesort(List<T> ilist) { 				
		if(ilist.size() <= 1) {			
			return ilist;
		} else { 
			List<T> left = new ArrayList<T>();
			List<T> right = new ArrayList<T>();
			
			int middle = ilist.size() / 2; //int division
			for(int i = 0; i < middle; i++) { 
				left.add( ilist.get(i) );
			}
			for(int i = middle; i < ilist.size(); i++) { 
				right.add( ilist.get(i) );
			}						
			return merge( mergesort(left), mergesort(right) );
		}
	}
	
	//used by mergesort to do merging
	private List<T> merge(List<T> a, List<T> b) { 
		List<T> ret = new ArrayList<T>();
		int a_idx = 0, b_idx = 0;		
		
		while(a_idx+1 <= a.size() || b_idx+1 <= b.size()) { 

			if(a_idx+1 <= a.size() && b_idx+1 <= b.size()) {

				if(a.get(a_idx).compareTo(b.get(b_idx)) <= 0.0) { 
					ret.add(a.get(a_idx));
					a_idx++;
				} else { 
					ret.add(b.get(b_idx));
					b_idx++;
                }
                
			} else if(a_idx + 1 <= a.size()) { 

				ret.add(a.get(a_idx));
                a_idx++;
                
			} else if(b_idx + 1 <= b.size()) { 

				ret.add(b.get(b_idx));
                b_idx++;
                
			}
		}
		
		return ret;	
	}	

}