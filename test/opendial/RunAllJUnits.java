package opendial;
// =================================================================                                                                   
// Copyright (C) 2011-2013 Pierre Lison (plison@ifi.uio.no)                                                                            
//                                                                                                                                     
// This library is free software; you can redistribute it and/or                                                                       
// modify it under the terms of the GNU Lesser General Public License                                                                  
// as published by the Free Software Foundation; either version 2.1 of                                                                 
// the License, or (at your option) any later version.                                                                                 
//                                                                                                                                     
// This library is distributed in the hope that it will be useful, but                                                                 
// WITHOUT ANY WARRANTY; without even the implied warranty of                                                                          
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU                                                                    
// Lesser General Public License for more details.                                                                                     
//                                                                                                                                     
// You should have received a copy of the GNU Lesser General Public                                                                    
// License along with this program; if not, write to the Free Software                                                                 
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA                                                                           
// 02111-1307, USA.                                                                                                                    
// =================================================================                                                                   



import org.junit.runner.JUnitCore;

import opendial.arch.Logger;
import opendial.domains.PlanningTest;

public class RunAllJUnits {

	// logger
	public static Logger log = new Logger("RunAllTests", Logger.Level.NORMAL);
	
	public static void main(String[] args) {
		for (int i = 0 ; i < 100 ; i++) {
		JUnitCore junit = new JUnitCore();
		junit.run(PlanningTest.class);
		}
	}

}
