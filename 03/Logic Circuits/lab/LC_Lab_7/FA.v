`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    12:11:40 11/26/2020 
// Design Name: 
// Module Name:    FA 
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
module FA(
	input A, B, Cin,
	output S, Cout
    );
	 
	wire S1, D1, D2;
	
	// Hierarchical Design
	HA HA1 (.S(S1), .Cout(D1), .A(A), .B(B));
	HA HA2 (.S(S), .Cout(D2), .A(S1), .B(Cin));
	 
	or #5 (Cout, D2, D1);
	
	// Dataflow Design
	

endmodule
