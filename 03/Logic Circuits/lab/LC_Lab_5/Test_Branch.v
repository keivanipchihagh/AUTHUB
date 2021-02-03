`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   17:35:59 11/12/2020
// Design Name:   Decoder_2_to_4
// Module Name:   E:/ISE/Projects/LC_Lab_5/Test_Branch.v
// Project Name:  LC_Lab_5
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: Decoder_2_to_4
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module Test_Branch;

	// Inputs
	reg A;
	reg B;
	reg E;

	// Outputs
	wire D0;
	wire D1;
	wire D2;
	wire D3;

	// Instantiate the Unit Under Test (UUT)
	Decoder_2_to_4 uut (
		.A(A), 
		.B(B), 
		.E(E), 
		.D0(D0), 
		.D1(D1), 
		.D2(D2), 
		.D3(D3)
	);

	initial begin
		// Initialize Inputs
		A = 0;
		B = 0;
		E = 0;

		// Add stimulus here				
		A = 1'b0; B = 1'b0; E = 1'b1;	// Result  0
		#100;
		
		A = 1'b1; B = 1'b0; E = 1'b1;	// Result  2
		#100;
		
		A = 1'b0; B = 1'b1; E = 1'b1;	// Result  1
		#100;

	end
      
endmodule

