`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   10:10:54 11/30/2020
// Design Name:   HA
// Module Name:   E:/ISE/Projects/LC_Lab_7/tb_HA.v
// Project Name:  LC_Lab_7
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: HA
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module tb_HA;

	// Inputs
	reg A;
	reg B;

	// Outputs
	wire S;
	wire Cout;

	// Instantiate the Unit Under Test (UUT)
	HA uut (
		.A(A), 
		.B(B), 
		.S(S), 
		.Cout(Cout)
	);

	initial begin
		// Initialize Inputs
		A = 0;
		B = 0;

		// Wait 100 ns for global reset to finish
		A = 1'b0; B = 1'b0;
		#100;
		
		A = 1'b0; B = 1'b1;
		#100;
		
		A = 1'b1; B = 1'b1;
		#100;
        
		// Add stimulus here

	end
      
endmodule

