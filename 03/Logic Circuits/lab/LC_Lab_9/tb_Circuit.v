`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   22:08:19 12/17/2020
// Design Name:   Circuit
// Module Name:   E:/ISE/Projects/LC_Lab_9/tb_Circuit.v
// Project Name:  LC_Lab_9
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: Circuit
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module tb_Circuit;

	// Inputs
	reg reset;
	reg clock;
	reg A;
	reg B;

	// Outputs
	wire y;
	wire z;
	wire t;

	// Instantiate the Unit Under Test (UUT)
	Circuit uut (
		.reset(reset), 
		.clock(clock), 
		.A(A), 
		.B(B), 
		.y(y), 
		.z(z), 
		.t(t)
	);

	initial begin
		// Initialize Inputs
		// Initialize Inputs
    
    reset = 0;
    A = 0;
    B = 0;
    #40;
    
    B = 1;
    #40;
    
    A = 1;
    #80;
    
    A = 0;
    #80;
    
    B = 0;
    #40;
    
    A = 1;
    #120;
    
    B = 1;
    #40;
    
    A = 0;
    B = 0;
    #120;
    
    B = 1;
    #40;
    
    A = 1;
    #80;
    
    A = 0;
    B = 0;
    #80;
    
    B = 1;
    #40;
    
    A = 1;
    #80;
    
    A = 0;
    #80;
    
    B = 0;
    #40;
    
    A = 1;
    #120;
    
    B = 1;
    #40;
    
    A = 0;
    B = 0;
    #120;
    
    B = 1;
    #40;
    
    A = 1;
    #80;
    
    $finish;
    
	end
	
	// Clock Freq
	initial begin
		clock = 0;
		forever begin
			#40;
			clock = ~clock;
		end
	end
      
endmodule
