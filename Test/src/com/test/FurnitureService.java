package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class FurnitureService {

		public double price(ArrayList<Furniture> ls) {

			List<Integer>ls1=ls.stream().map(x->x.getId()).collect(Collectors.toList());

			return Collections.max(ls1);

		}
		
//		public double price(ArrayList<Furniture> ls) {
//			List<Integer>ls1 = ls.stream().filter(x->x.getPrice().price<1000.collect(Collectors.toList()));
//		}

		public List<Furniture> name(ArrayList<Furniture> ls) {

			List<Furniture>ls1=ls.stream().filter(x->x.getName().charAt(0)=='T').collect(Collectors.toList());

			return ls1; 

		}

		public int quantity(ArrayList<Furniture> ls) {

			List<Integer>ls1=ls.stream().map(x->x.getQuantity()).collect(Collectors.toList());

			return Collections.min(ls1);

		}
}
