/**********************************************************************/
/*   ____  ____                                                       */
/*  /   /\/   /                                                       */
/* /___/  \  /                                                        */
/* \   \   \/                                                       */
/*  \   \        Copyright (c) 2003-2009 Xilinx, Inc.                */
/*  /   /          All Right Reserved.                                 */
/* /---/   /\                                                         */
/* \   \  /  \                                                      */
/*  \___\/\___\                                                    */
/***********************************************************************/

/* This file is designed for use with ISim build 0x7708f090 */

#define XSI_HIDE_SYMBOL_SPEC true
#include "xsi.h"
#include <memory.h>
#ifdef __GNUC__
#include <stdlib.h>
#else
#include <malloc.h>
#define alloca _alloca
#endif
static const char *ng0 = "E:/ISE/Projects/LC_Lab_9/D_FlipFlop.v";
static unsigned int ng1[] = {0U, 0U};



static void Always_26_0(char *t0)
{
    char t14[8];
    char *t1;
    char *t2;
    char *t3;
    char *t4;
    char *t5;
    char *t6;
    unsigned int t7;
    unsigned int t8;
    unsigned int t9;
    unsigned int t10;
    unsigned int t11;
    char *t12;
    char *t13;
    unsigned int t15;
    unsigned int t16;
    unsigned int t17;
    unsigned int t18;
    unsigned int t19;
    unsigned int t20;
    unsigned int t21;
    unsigned int t22;

LAB0:    t1 = (t0 + 2848U);
    t2 = *((char **)t1);
    if (t2 == 0)
        goto LAB2;

LAB3:    goto *t2;

LAB2:    xsi_set_current_line(26, ng0);
    t2 = (t0 + 3168);
    *((int *)t2) = 1;
    t3 = (t0 + 2880);
    *((char **)t3) = t2;
    *((char **)t1) = &&LAB4;

LAB1:    return;
LAB4:    xsi_set_current_line(27, ng0);

LAB5:    xsi_set_current_line(28, ng0);
    t4 = (t0 + 2656);
    xsi_process_wait(t4, 5000LL);
    *((char **)t1) = &&LAB6;
    goto LAB1;

LAB6:    xsi_set_current_line(29, ng0);
    t5 = (t0 + 1048U);
    t6 = *((char **)t5);
    t5 = (t6 + 4);
    t7 = *((unsigned int *)t5);
    t8 = (~(t7));
    t9 = *((unsigned int *)t6);
    t10 = (t9 & t8);
    t11 = (t10 != 0);
    if (t11 > 0)
        goto LAB7;

LAB8:    xsi_set_current_line(34, ng0);

LAB11:    xsi_set_current_line(35, ng0);
    t2 = (t0 + 1368U);
    t3 = *((char **)t2);
    t2 = (t0 + 1768);
    xsi_vlogvar_wait_assign_value(t2, t3, 0, 0, 1, 0LL);
    xsi_set_current_line(36, ng0);
    t2 = (t0 + 1368U);
    t3 = *((char **)t2);
    memset(t14, 0, 8);
    t2 = (t3 + 4);
    t7 = *((unsigned int *)t2);
    t8 = (~(t7));
    t9 = *((unsigned int *)t3);
    t10 = (t9 & t8);
    t11 = (t10 & 1U);
    if (t11 != 0)
        goto LAB15;

LAB13:    if (*((unsigned int *)t2) == 0)
        goto LAB12;

LAB14:    t4 = (t14 + 4);
    *((unsigned int *)t14) = 1;
    *((unsigned int *)t4) = 1;

LAB15:    t5 = (t14 + 4);
    t6 = (t3 + 4);
    t15 = *((unsigned int *)t3);
    t16 = (~(t15));
    *((unsigned int *)t14) = t16;
    *((unsigned int *)t5) = 0;
    if (*((unsigned int *)t6) != 0)
        goto LAB17;

LAB16:    t21 = *((unsigned int *)t14);
    *((unsigned int *)t14) = (t21 & 1U);
    t22 = *((unsigned int *)t5);
    *((unsigned int *)t5) = (t22 & 1U);
    t12 = (t0 + 1928);
    xsi_vlogvar_wait_assign_value(t12, t14, 0, 0, 1, 0LL);

LAB9:    goto LAB2;

LAB7:    xsi_set_current_line(30, ng0);

LAB10:    xsi_set_current_line(31, ng0);
    t12 = ((char*)((ng1)));
    t13 = (t0 + 1768);
    xsi_vlogvar_wait_assign_value(t13, t12, 0, 0, 1, 0LL);
    goto LAB9;

LAB12:    *((unsigned int *)t14) = 1;
    goto LAB15;

LAB17:    t17 = *((unsigned int *)t14);
    t18 = *((unsigned int *)t6);
    *((unsigned int *)t14) = (t17 | t18);
    t19 = *((unsigned int *)t5);
    t20 = *((unsigned int *)t6);
    *((unsigned int *)t5) = (t19 | t20);
    goto LAB16;

}


extern void work_m_00000000003287154037_0361224675_init()
{
	static char *pe[] = {(void *)Always_26_0};
	xsi_register_didat("work_m_00000000003287154037_0361224675", "isim/tb_Circuit_isim_beh.exe.sim/work/m_00000000003287154037_0361224675.didat");
	xsi_register_executes(pe);
}
