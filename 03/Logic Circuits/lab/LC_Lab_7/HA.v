`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    12:07:39 11/26/2020 
// Design Name: 
// Module Name:    HA 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module HA(
	input A, B,
	output S, Cout
    );
	
	// Hierarchical Design
	xor #10 (S, A, B);	
	and #5 (Cout, A, B);

endmodule
