`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   10:06:12 11/30/2020
// Design Name:   FA
// Module Name:   E:/ISE/Projects/LC_Lab_7/tb_FA.v
// Project Name:  LC_Lab_7
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: FA
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module tb_FA;

	// Inputs
	reg A;
	reg B;
	reg Cin;

	// Outputs
	wire S;
	wire Cout;

	// Instantiate the Unit Under Test (UUT)
	FA uut (
		.A(A), 
		.B(B), 
		.Cin(Cin), 
		.S(S), 
		.Cout(Cout)
	);

	initial begin
		// Initialize Inputs
		A = 0;
		B = 0;
		Cin = 0;

		// Wait 100 ns for global reset to finish
		A = 1'b0; B = 1'b0; Cin = 1'b0;
		#100;
		
		A = 1'b1; B = 1'b0; Cin = 1'b0;
		#100;
		
		A = 1'b0; B = 1'b1; Cin = 1'b1;
		#100;
		
		A = 1'b1; B = 1'b1; Cin = 1'b1;
		#100;
        
		// Add stimulus here

	end
      
endmodule

