package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q5 f13527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q5 f13528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q5[] f13529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q5[] f13530f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13531b;

    /* JADX INFO: Fake field, exist only in values array */
    q5 EF0;

    static {
        y5 y5Var = y5.f13620f;
        q5 q5Var = new q5("DOUBLE", 0, 0, 1, y5Var);
        y5 y5Var2 = y5.f13619e;
        q5 q5Var2 = new q5("FLOAT", 1, 1, 1, y5Var2);
        y5 y5Var3 = y5.f13618d;
        q5 q5Var3 = new q5("INT64", 2, 2, 1, y5Var3);
        q5 q5Var4 = new q5("UINT64", 3, 3, 1, y5Var3);
        y5 y5Var4 = y5.f13617c;
        q5 q5Var5 = new q5("INT32", 4, 4, 1, y5Var4);
        q5 q5Var6 = new q5("FIXED64", 5, 5, 1, y5Var3);
        q5 q5Var7 = new q5("FIXED32", 6, 6, 1, y5Var4);
        y5 y5Var5 = y5.f13621g;
        q5 q5Var8 = new q5("BOOL", 7, 7, 1, y5Var5);
        y5 y5Var6 = y5.f13622h;
        q5 q5Var9 = new q5("STRING", 8, 8, 1, y5Var6);
        y5 y5Var7 = y5.f13624k;
        q5 q5Var10 = new q5("MESSAGE", 9, 9, 1, y5Var7);
        y5 y5Var8 = y5.i;
        q5 q5Var11 = new q5("BYTES", 10, 10, 1, y5Var8);
        q5 q5Var12 = new q5("UINT32", 11, 11, 1, y5Var4);
        y5 y5Var9 = y5.f13623j;
        q5 q5Var13 = new q5("ENUM", 12, 12, 1, y5Var9);
        q5 q5Var14 = new q5("SFIXED32", 13, 13, 1, y5Var4);
        q5 q5Var15 = new q5("SFIXED64", 14, 14, 1, y5Var3);
        q5 q5Var16 = new q5("SINT32", 15, 15, 1, y5Var4);
        q5 q5Var17 = new q5("SINT64", 16, 16, 1, y5Var3);
        q5 q5Var18 = new q5("GROUP", 17, 17, 1, y5Var7);
        q5 q5Var19 = new q5("DOUBLE_LIST", 18, 18, 2, y5Var);
        q5 q5Var20 = new q5("FLOAT_LIST", 19, 19, 2, y5Var2);
        q5 q5Var21 = new q5("INT64_LIST", 20, 20, 2, y5Var3);
        q5 q5Var22 = new q5("UINT64_LIST", 21, 21, 2, y5Var3);
        q5 q5Var23 = new q5("INT32_LIST", 22, 22, 2, y5Var4);
        q5 q5Var24 = new q5("FIXED64_LIST", 23, 23, 2, y5Var3);
        q5 q5Var25 = new q5("FIXED32_LIST", 24, 24, 2, y5Var4);
        q5 q5Var26 = new q5("BOOL_LIST", 25, 25, 2, y5Var5);
        q5 q5Var27 = new q5("STRING_LIST", 26, 26, 2, y5Var6);
        q5 q5Var28 = new q5("MESSAGE_LIST", 27, 27, 2, y5Var7);
        q5 q5Var29 = new q5("BYTES_LIST", 28, 28, 2, y5Var8);
        q5 q5Var30 = new q5("UINT32_LIST", 29, 29, 2, y5Var4);
        q5 q5Var31 = new q5("ENUM_LIST", 30, 30, 2, y5Var9);
        q5 q5Var32 = new q5("SFIXED32_LIST", 31, 31, 2, y5Var4);
        q5 q5Var33 = new q5("SFIXED64_LIST", 32, 32, 2, y5Var3);
        q5 q5Var34 = new q5("SINT32_LIST", 33, 33, 2, y5Var4);
        q5 q5Var35 = new q5("SINT64_LIST", 34, 34, 2, y5Var3);
        q5 q5Var36 = new q5("DOUBLE_LIST_PACKED", 35, 35, 3, y5Var);
        f13527c = q5Var36;
        q5 q5Var37 = new q5("FLOAT_LIST_PACKED", 36, 36, 3, y5Var2);
        q5 q5Var38 = new q5("INT64_LIST_PACKED", 37, 37, 3, y5Var3);
        q5 q5Var39 = new q5("UINT64_LIST_PACKED", 38, 38, 3, y5Var3);
        q5 q5Var40 = new q5("INT32_LIST_PACKED", 39, 39, 3, y5Var4);
        q5 q5Var41 = new q5("FIXED64_LIST_PACKED", 40, 40, 3, y5Var3);
        q5 q5Var42 = new q5("FIXED32_LIST_PACKED", 41, 41, 3, y5Var4);
        q5 q5Var43 = new q5("BOOL_LIST_PACKED", 42, 42, 3, y5Var5);
        q5 q5Var44 = new q5("UINT32_LIST_PACKED", 43, 43, 3, y5Var4);
        q5 q5Var45 = new q5("ENUM_LIST_PACKED", 44, 44, 3, y5Var9);
        q5 q5Var46 = new q5("SFIXED32_LIST_PACKED", 45, 45, 3, y5Var4);
        q5 q5Var47 = new q5("SFIXED64_LIST_PACKED", 46, 46, 3, y5Var3);
        q5 q5Var48 = new q5("SINT32_LIST_PACKED", 47, 47, 3, y5Var4);
        q5 q5Var49 = new q5("SINT64_LIST_PACKED", 48, 48, 3, y5Var3);
        f13528d = q5Var49;
        f13530f = new q5[]{q5Var, q5Var2, q5Var3, q5Var4, q5Var5, q5Var6, q5Var7, q5Var8, q5Var9, q5Var10, q5Var11, q5Var12, q5Var13, q5Var14, q5Var15, q5Var16, q5Var17, q5Var18, q5Var19, q5Var20, q5Var21, q5Var22, q5Var23, q5Var24, q5Var25, q5Var26, q5Var27, q5Var28, q5Var29, q5Var30, q5Var31, q5Var32, q5Var33, q5Var34, q5Var35, q5Var36, q5Var37, q5Var38, q5Var39, q5Var40, q5Var41, q5Var42, q5Var43, q5Var44, q5Var45, q5Var46, q5Var47, q5Var48, q5Var49, new q5("GROUP_LIST", 49, 49, 2, y5Var7), new q5("MAP", 50, 50, 4, y5.f13616b)};
        q5[] q5VarArrValues = values();
        f13529e = new q5[q5VarArrValues.length];
        for (q5 q5Var50 : q5VarArrValues) {
            f13529e[q5Var50.f13531b] = q5Var50;
        }
    }

    public q5(String str, int i, int i10, int i11, y5 y5Var) {
        this.f13531b = i10;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            y5Var.getClass();
        }
        if (i11 == 1) {
            y5 y5Var2 = y5.f13616b;
            y5Var.ordinal();
        }
    }

    public static q5[] values() {
        return (q5[]) f13530f.clone();
    }
}
