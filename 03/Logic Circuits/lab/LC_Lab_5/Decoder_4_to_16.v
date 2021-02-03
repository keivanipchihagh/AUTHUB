`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    17:55:40 11/11/2020 
// Design Name: 
// Module Name:    Decoder_4_to_16 
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
module Decoder_4_to_16(A, B, C, D, D0);

	input A, B, C, D;
	output D0;
	
	Decoder_2_to_4 Decoder_2_to_4_inst (
		.A(),
		.B(),		
	)

endmodule
