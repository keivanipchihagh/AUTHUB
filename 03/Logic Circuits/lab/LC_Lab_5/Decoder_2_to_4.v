`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    17:02:36 11/11/2020 
// Design Name: 
// Module Name:    Decoder_2_to_4 
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
module Decoder_2_to_4(A, B, E, D0, D1, D2, D3);

   input A, B, E;
	output D0, D1, D2, D3;
	wire Anot, Bnot;
	
  not
    n1 (Anot, A),
    n2 (Bnot, B);
  and
    n4 (D0, Anot, Bnot),
    n5 (D1, Anot, B),
    n6 (D2, A, Bnot),
    n7 (D3, A, B);

endmodule