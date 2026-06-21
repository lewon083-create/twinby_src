package com.google.android.gms.internal.play_billing;

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
public final class b3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b3 f14140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b3 f14141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3[] f14142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b3[] f14143f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14144b;

    /* JADX INFO: Fake field, exist only in values array */
    b3 EF0;

    static {
        o3 o3Var = o3.f14262f;
        b3 b3Var = new b3("DOUBLE", 0, 0, 1, o3Var);
        o3 o3Var2 = o3.f14261e;
        b3 b3Var2 = new b3("FLOAT", 1, 1, 1, o3Var2);
        o3 o3Var3 = o3.f14260d;
        b3 b3Var3 = new b3("INT64", 2, 2, 1, o3Var3);
        b3 b3Var4 = new b3("UINT64", 3, 3, 1, o3Var3);
        o3 o3Var4 = o3.f14259c;
        b3 b3Var5 = new b3("INT32", 4, 4, 1, o3Var4);
        b3 b3Var6 = new b3("FIXED64", 5, 5, 1, o3Var3);
        b3 b3Var7 = new b3("FIXED32", 6, 6, 1, o3Var4);
        o3 o3Var5 = o3.f14263g;
        b3 b3Var8 = new b3("BOOL", 7, 7, 1, o3Var5);
        o3 o3Var6 = o3.f14264h;
        b3 b3Var9 = new b3("STRING", 8, 8, 1, o3Var6);
        o3 o3Var7 = o3.f14266k;
        b3 b3Var10 = new b3("MESSAGE", 9, 9, 1, o3Var7);
        o3 o3Var8 = o3.i;
        b3 b3Var11 = new b3("BYTES", 10, 10, 1, o3Var8);
        b3 b3Var12 = new b3("UINT32", 11, 11, 1, o3Var4);
        o3 o3Var9 = o3.f14265j;
        b3 b3Var13 = new b3("ENUM", 12, 12, 1, o3Var9);
        b3 b3Var14 = new b3("SFIXED32", 13, 13, 1, o3Var4);
        b3 b3Var15 = new b3("SFIXED64", 14, 14, 1, o3Var3);
        b3 b3Var16 = new b3("SINT32", 15, 15, 1, o3Var4);
        b3 b3Var17 = new b3("SINT64", 16, 16, 1, o3Var3);
        b3 b3Var18 = new b3("GROUP", 17, 17, 1, o3Var7);
        b3 b3Var19 = new b3("DOUBLE_LIST", 18, 18, 2, o3Var);
        b3 b3Var20 = new b3("FLOAT_LIST", 19, 19, 2, o3Var2);
        b3 b3Var21 = new b3("INT64_LIST", 20, 20, 2, o3Var3);
        b3 b3Var22 = new b3("UINT64_LIST", 21, 21, 2, o3Var3);
        b3 b3Var23 = new b3("INT32_LIST", 22, 22, 2, o3Var4);
        b3 b3Var24 = new b3("FIXED64_LIST", 23, 23, 2, o3Var3);
        b3 b3Var25 = new b3("FIXED32_LIST", 24, 24, 2, o3Var4);
        b3 b3Var26 = new b3("BOOL_LIST", 25, 25, 2, o3Var5);
        b3 b3Var27 = new b3("STRING_LIST", 26, 26, 2, o3Var6);
        b3 b3Var28 = new b3("MESSAGE_LIST", 27, 27, 2, o3Var7);
        b3 b3Var29 = new b3("BYTES_LIST", 28, 28, 2, o3Var8);
        b3 b3Var30 = new b3("UINT32_LIST", 29, 29, 2, o3Var4);
        b3 b3Var31 = new b3("ENUM_LIST", 30, 30, 2, o3Var9);
        b3 b3Var32 = new b3("SFIXED32_LIST", 31, 31, 2, o3Var4);
        b3 b3Var33 = new b3("SFIXED64_LIST", 32, 32, 2, o3Var3);
        b3 b3Var34 = new b3("SINT32_LIST", 33, 33, 2, o3Var4);
        b3 b3Var35 = new b3("SINT64_LIST", 34, 34, 2, o3Var3);
        b3 b3Var36 = new b3("DOUBLE_LIST_PACKED", 35, 35, 3, o3Var);
        f14140c = b3Var36;
        b3 b3Var37 = new b3("FLOAT_LIST_PACKED", 36, 36, 3, o3Var2);
        b3 b3Var38 = new b3("INT64_LIST_PACKED", 37, 37, 3, o3Var3);
        b3 b3Var39 = new b3("UINT64_LIST_PACKED", 38, 38, 3, o3Var3);
        b3 b3Var40 = new b3("INT32_LIST_PACKED", 39, 39, 3, o3Var4);
        b3 b3Var41 = new b3("FIXED64_LIST_PACKED", 40, 40, 3, o3Var3);
        b3 b3Var42 = new b3("FIXED32_LIST_PACKED", 41, 41, 3, o3Var4);
        b3 b3Var43 = new b3("BOOL_LIST_PACKED", 42, 42, 3, o3Var5);
        b3 b3Var44 = new b3("UINT32_LIST_PACKED", 43, 43, 3, o3Var4);
        b3 b3Var45 = new b3("ENUM_LIST_PACKED", 44, 44, 3, o3Var9);
        b3 b3Var46 = new b3("SFIXED32_LIST_PACKED", 45, 45, 3, o3Var4);
        b3 b3Var47 = new b3("SFIXED64_LIST_PACKED", 46, 46, 3, o3Var3);
        b3 b3Var48 = new b3("SINT32_LIST_PACKED", 47, 47, 3, o3Var4);
        b3 b3Var49 = new b3("SINT64_LIST_PACKED", 48, 48, 3, o3Var3);
        f14141d = b3Var49;
        f14143f = new b3[]{b3Var, b3Var2, b3Var3, b3Var4, b3Var5, b3Var6, b3Var7, b3Var8, b3Var9, b3Var10, b3Var11, b3Var12, b3Var13, b3Var14, b3Var15, b3Var16, b3Var17, b3Var18, b3Var19, b3Var20, b3Var21, b3Var22, b3Var23, b3Var24, b3Var25, b3Var26, b3Var27, b3Var28, b3Var29, b3Var30, b3Var31, b3Var32, b3Var33, b3Var34, b3Var35, b3Var36, b3Var37, b3Var38, b3Var39, b3Var40, b3Var41, b3Var42, b3Var43, b3Var44, b3Var45, b3Var46, b3Var47, b3Var48, b3Var49, new b3("GROUP_LIST", 49, 49, 2, o3Var7), new b3("MAP", 50, 50, 4, o3.f14258b)};
        b3[] b3VarArrValues = values();
        f14142e = new b3[b3VarArrValues.length];
        for (b3 b3Var50 : b3VarArrValues) {
            f14142e[b3Var50.f14144b] = b3Var50;
        }
    }

    public b3(String str, int i, int i10, int i11, o3 o3Var) {
        this.f14144b = i10;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            o3Var.getClass();
        }
        if (i11 == 1) {
            o3 o3Var2 = o3.f14258b;
            o3Var.ordinal();
        }
    }

    public static b3[] values() {
        return (b3[]) f14143f.clone();
    }
}
